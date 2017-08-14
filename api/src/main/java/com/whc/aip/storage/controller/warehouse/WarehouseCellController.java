package com.whc.aip.storage.controller.warehouse;

import com.wanhuchina.common.code.CommonCode;
import com.wanhuchina.common.code.TxResultResponse;
import com.wanhuchina.common.exception.CommonException;
import com.whc.aip.storage.service.dispenser.DispensertWahoceCabinetService;
import com.whc.aip.storage.service.dispenser.DispensertWarehouseCellService;
import com.whc.aip.storage.service.dispenser.DispensertWarehouseService;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by Administrator on 2017/5/25.
 */
@RestController
@RequestMapping("/Warehouse")
public class WarehouseCellController {
    public static final org.slf4j.Logger log = LoggerFactory.getLogger(WarehouseCellController.class);
    @Resource
    private DispensertWarehouseService dispensertWarehouseService;
    @Resource
    private DispensertWahoceCabinetService dispensertWahoceCabinetService;
    @Resource
    private DispensertWarehouseCellService dispensertWarehouseCellService;
    //进入选定门店接口
    @RequestMapping(value = "/getWarehouseCellInfo",method = RequestMethod.POST)
    public TxResultResponse getWarehouseCellInfo(@RequestParam String wahoId){
        TxResultResponse resultResponse = new TxResultResponse(CommonCode.SUCCESS.getCode(),"操作成功");
        try {
            Map<String, Object> data = dispensertWarehouseService.getDispensertWarehouse(wahoId);
            resultResponse.setData(data);
            return resultResponse;
        }catch (CommonException e){
            return new TxResultResponse(e.getCode(),e.getMsg());
        } catch (Exception e) {
            return new TxResultResponse(CommonCode.SERVER_ERROR.getCode(),"服务器内部异常");
        }
    }
    //选好柜之后的接口
    @RequestMapping(value = "/getWahoce",method = RequestMethod.POST)
    public TxResultResponse getWahoce(@RequestParam String wahoceId,@RequestParam String openId,@RequestParam String wahoId){
        TxResultResponse resultResponse = new TxResultResponse(CommonCode.SUCCESS.getCode(),"操作成功");
        try {
            Map<String, Object> data = dispensertWahoceCabinetService.getDispensertWahoceCabinet(wahoceId,openId,wahoId);
            resultResponse.setData(data);
            return resultResponse;
        }catch (CommonException e){
            return new TxResultResponse(e.getCode(),e.getMsg());
        } catch (Exception e) {
            return new TxResultResponse(CommonCode.SERVER_ERROR.getCode(),"服务器内部异常");
        }
    }
    @RequestMapping(value = "/getWarehouseCell",method = RequestMethod.POST)
    public TxResultResponse getWarehouseCell(@RequestParam String wahoceId){
        TxResultResponse resultResponse = new TxResultResponse(CommonCode.SUCCESS.getCode(),"操作成功");
        try {
            Map<String, Object> data = dispensertWarehouseCellService.getDispensertWarehouseCell(wahoceId);
            resultResponse.setData(data);
            return resultResponse;
        }catch (CommonException e){
            return new TxResultResponse(e.getCode(),e.getMsg());
        } catch (Exception e) {
            return new TxResultResponse(CommonCode.SERVER_ERROR.getCode(),"服务器内部异常");
        }
    }
    @RequestMapping(value = "/updateWarehouseCellStatus",method = RequestMethod.POST)
    public TxResultResponse updateWarehouseCellStatus(@RequestParam String wahoceId,@RequestParam String status){
        TxResultResponse resultResponse = new TxResultResponse(CommonCode.SUCCESS.getCode(),"操作成功");
        try {
            Map<String, Object> data = dispensertWarehouseCellService.updateWarehouseCellStatus(wahoceId,status);
            resultResponse.setData(data);
            return resultResponse;
        }catch (CommonException e){
            return new TxResultResponse(e.getCode(),e.getMsg());
        } catch (Exception e) {
            return new TxResultResponse(CommonCode.SERVER_ERROR.getCode(),"服务器内部异常");
        }
    }
}
