package com.whc.aip.storage.controller.cabinet;

import com.wanhuchina.common.code.CommonCode;
import com.wanhuchina.common.code.TxResultResponse;
import com.wanhuchina.common.exception.CommonException;
import com.whc.aip.storage.controller.warehouse.WarehouseCellController;
import com.whc.aip.storage.model.cabinet.CabinetRecord;
import com.whc.aip.storage.service.dispenser.DispensertCabinetService;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by WangHu
 * Email：wanghu@wanhuchina.com
 * Date：2017/6/22
 * Time：12:07
 */
@RestController
@RequestMapping("cabinet")
public class CabinetController {
    public static final org.slf4j.Logger log = LoggerFactory.getLogger(WarehouseCellController.class);
    @Resource
    private DispensertCabinetService dispensertCabinetService;
    @RequestMapping(value = "/getCabinet",method = RequestMethod.POST)
    public TxResultResponse getCabinet(@RequestParam String id){
        TxResultResponse resultResponse = new TxResultResponse(CommonCode.SUCCESS.getCode(),"操作成功");
        try{
            Map<String, Object> data = dispensertCabinetService.getCabinet(id);
            resultResponse.setData(data);
            return resultResponse;
        }catch (CommonException e){
            return new TxResultResponse(e.getCode(),e.getMsg());
        } catch (Exception e) {
            return new TxResultResponse(CommonCode.SERVER_ERROR.getCode(),"服务器内部异常");
        }
    }
    @RequestMapping(value = "/getCabinetRecordNumberLock",method = RequestMethod.POST)
    public TxResultResponse getCabinetRecordNumberLock(@RequestParam String orderId){
        TxResultResponse resultResponse = new TxResultResponse(CommonCode.SUCCESS.getCode(),"操作成功");
        try{
            Map<String, Object> data = dispensertCabinetService.getCabinetRecordNumberLock(orderId);
            resultResponse.setData(data);
            return resultResponse;
        }catch (CommonException e){
            return new TxResultResponse(e.getCode(),e.getMsg());
        } catch (Exception e) {
            return new TxResultResponse(CommonCode.SERVER_ERROR.getCode(),"服务器内部异常");
        }
    }

    @ResponseBody
    @RequestMapping(value = "/getCabinetRecordId",method = RequestMethod.POST,produces="application/json")
    public TxResultResponse getCabinetRecordId(@RequestBody CabinetRecord cabinetRecord){
        TxResultResponse resultResponse = new TxResultResponse(CommonCode.SUCCESS.getCode(),"操作成功");
        Map<String,String> data = new HashMap<String,String>();
        CabinetRecord cabinetRecordId = new CabinetRecord();
        try{
            cabinetRecordId = dispensertCabinetService.getCabinetRecordId(cabinetRecord);
            resultResponse.setData(cabinetRecordId);
            return resultResponse;
        }catch (CommonException e){
            return new TxResultResponse(e.getCode(),e.getMsg());
        } catch (Exception e) {
            return new TxResultResponse(CommonCode.SERVER_ERROR.getCode(),"服务器内部异常");
        }
    }

    @RequestMapping(value = "/updateCabinetStatus",method = RequestMethod.POST)
    public TxResultResponse updateCabinetStatus(@RequestParam String cabinetId,@RequestParam String status){
        TxResultResponse resultResponse = new TxResultResponse(CommonCode.SUCCESS.getCode(),"操作成功");
        try{
            Map<String, Object> data  = dispensertCabinetService.updateCabinetStatus(cabinetId,status);
            resultResponse.setData(data);
            return resultResponse;
        }catch (CommonException e){
            return new TxResultResponse(e.getCode(),e.getMsg());
        } catch (Exception e) {
            return new TxResultResponse(CommonCode.SERVER_ERROR.getCode(),"服务器内部异常");
        }
    }

    @RequestMapping(value = "/getWeigateCabinetRecordList",method = RequestMethod.POST)
    public TxResultResponse getWeigateCabinetRecordList(@RequestParam String orderId){
        TxResultResponse resultResponse = new TxResultResponse(CommonCode.SUCCESS.getCode(),"操作成功");
        try{
            Map<String, Object> data = dispensertCabinetService.getWeigateCabinetRecordList(orderId);
            resultResponse.setData(data);
            return resultResponse;
        }catch (CommonException e){
            return new TxResultResponse(e.getCode(),e.getMsg());
        } catch (Exception e) {
            return new TxResultResponse(CommonCode.SERVER_ERROR.getCode(),"服务器内部异常");
        }
    }
}
