package com.whc.aip.storage.controller.warehouse;

import com.wanhuchina.common.code.CommonCode;
import com.wanhuchina.common.code.TxResultResponse;
import com.wanhuchina.common.exception.CommonException;
import com.whc.aip.storage.model.warehouse.Warehouse;
import com.whc.aip.storage.model.warehouse.WarehouseList;
import com.whc.aip.storage.service.dispenser.DispensertWahoceListService;
import com.whc.aip.storage.service.dispenser.DispensertWarehouseService;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/5/17.
 */

@RestController
@RequestMapping("/Warehouse")
public class WarehouseController {
    private static final org.slf4j.Logger log= LoggerFactory.getLogger(WarehouseController.class);
    @Resource
    private DispensertWahoceListService dispensertWahoceListService;
    @Resource
    private DispensertWarehouseService dispensertWarehouseService;
    //门店列表接口
    @RequestMapping(value = "/getWarehouseList",method = RequestMethod.POST)
    public TxResultResponse getWarehouseList(@RequestParam String keyWord,@RequestParam String wahoType){
        TxResultResponse resultResponse = new TxResultResponse(CommonCode.SUCCESS.getCode(),"操作成功");
        try {
            List<Warehouse> data = dispensertWahoceListService.getDispensertWahoceList(keyWord,wahoType);
            resultResponse.setData(data);
            return resultResponse;
        }catch (CommonException e){
            return new TxResultResponse(e.getCode(),e.getMsg());
        } catch (Exception e) {
            return new TxResultResponse(CommonCode.SERVER_ERROR.getCode(),"服务器内部异常");
        }
    }
    @RequestMapping(value = "/getWarehouseInfo",method = RequestMethod.POST)
    public TxResultResponse getWarehouseInfo(@RequestParam String wahoId){
        TxResultResponse resultResponse = new TxResultResponse(CommonCode.SUCCESS.getCode(),"操作成功");
        try {
            Map<String, Object> data = dispensertWarehouseService.getDispensertWarehouseInfo(wahoId);
            resultResponse.setData(data);
            return resultResponse;
        }catch (CommonException e){
            return new TxResultResponse(e.getCode(),e.getMsg());
        }catch (Exception e) {
            return new TxResultResponse(CommonCode.SERVER_ERROR.getCode(),"服务器内部异常");
        }
    }
    /*
    return 1:成功；0：失败
     */
    @RequestMapping(value = "/updateWarehouseQRCodeUrl",method = RequestMethod.POST)
    public TxResultResponse updateWarehouseQRCodeUrl(@RequestParam String wahoId,@RequestParam String qrcodeUrl){
        TxResultResponse resultResponse = new TxResultResponse(CommonCode.SUCCESS.getCode(),"操作成功");
        try {
            Map<String, Object> data = dispensertWarehouseService.updateWarehouseQRCodeUrl(wahoId,qrcodeUrl);
            resultResponse.setData(data);
            return resultResponse;
        }catch (CommonException e){
            return new TxResultResponse(e.getCode(),e.getMsg());
        } catch (Exception e) {
            return new TxResultResponse(CommonCode.SERVER_ERROR.getCode(),"服务器内部异常");
        }
    }
}
