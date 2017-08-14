package com.whc.aip.storage.controller.storage;

import com.wanhuchina.common.code.CommonCode;
import com.wanhuchina.common.code.TxResultResponse;
import com.wanhuchina.common.exception.CommonException;
import com.whc.aip.storage.model.common.DoorGuard;
import com.whc.aip.storage.model.storage.WeigateDoorRecord;
import com.whc.aip.storage.model.storage.weigateDoor;
import com.whc.aip.storage.service.common.DoorGuardService;
import com.whc.aip.storage.service.storage.WeigateDoorService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by shenshanghua
 * Email shenshanghua@wanhuchina.com
 * Date：2017/7/21
 * Time：11:02
 */
@RestController
@RequestMapping("/storageManage")
public class StorageController {
    @Resource
    private DoorGuardService doorGuardService;
    @Resource
    private WeigateDoorService weigateDoorService;

    /**
     * 用户门禁权限列表
     * @param deviceId,isDel
     * @return
     */
    @RequestMapping(value = "/getDoor" , method = RequestMethod.POST )
    public TxResultResponse getDoorGuardList(@RequestParam String deviceId , @RequestParam String isDel){
        TxResultResponse resultResponse = new TxResultResponse(CommonCode.SUCCESS.getCode(),"操作成功");
        try {
            weigateDoor weigateDoor = weigateDoorService.getWeigateByDeviceId(deviceId, isDel);
            resultResponse.setData(weigateDoor);
            return resultResponse;
        } catch (CommonException e) {
            return new TxResultResponse(e.getCode(),e.getMsg());
        } catch (Exception e) {
            return new TxResultResponse(CommonCode.SERVER_ERROR.getCode(),"接口内部异常");
        }

    }


    /**
     * 添加门禁记录
     */
    @RequestMapping(value = "/insDoorRecord" , method = RequestMethod.POST)
    @ResponseBody
    private TxResultResponse insDoorRecord(@RequestBody WeigateDoorRecord weigateDoorRecord){
        TxResultResponse resultResponse = new TxResultResponse(CommonCode.SUCCESS.getCode(),"添加成功");

        try {
            int index = weigateDoorService.insWeigateDoorRecord(weigateDoorRecord);
            if(index == 1 ){
                return resultResponse;
            }else{
                return new TxResultResponse(CommonCode.PARAM_ERROR.getCode(),"添加失败");
            }
        } catch (CommonException e) {
            return new TxResultResponse(e.getCode(),e.getMsg());
        } catch (Exception e) {
            return new TxResultResponse(CommonCode.SERVER_ERROR.getCode(),"接口内部异常");
        }
    }

    /**
     * 查询仓位所在
     * @param memberId
     * @return
     */
    @RequestMapping(value = "/getDoorGuardList" , method = RequestMethod.POST )
    public TxResultResponse getDoor(@RequestParam String memberId){
        TxResultResponse resultResponse = new TxResultResponse(CommonCode.SUCCESS.getCode(),"操作成功");
        try {
            List<DoorGuard> doorGuardList = doorGuardService.getDoorGuardList(memberId);
            resultResponse.setData(doorGuardList);
            return resultResponse;
        } catch (CommonException e) {
            return new TxResultResponse(e.getCode(),e.getMsg());
        } catch (Exception e) {
            return new TxResultResponse(CommonCode.SERVER_ERROR.getCode(),"接口内部异常");
        }

    }
}
