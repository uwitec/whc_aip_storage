package com.whc.aip.storage.controller.wahoce;

import com.wanhuchina.common.code.CommonCode;
import com.wanhuchina.common.code.TxResultResponse;
import com.wanhuchina.common.exception.CommonException;
import com.whc.aip.storage.model.wahoce.WahocePriceParam;
import com.whc.aip.storage.model.warehouse.WahoceType;
import com.whc.aip.storage.service.dispenser.DispensertWahoceService;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by WangHu
 * Email：wanghu@wanhuchina.com
 * Date：2017/6/27
 * Time：16:39
 */
@RestController
@RequestMapping("/wahoce")
public class WahoceController {
    private static final org.slf4j.Logger log= LoggerFactory.getLogger(WahoceController.class);
    @Resource
    private DispensertWahoceService dispensertWahoceService;
    @RequestMapping(value = "/getWahoceTypePrice",method = RequestMethod.POST)
    public TxResultResponse getWahoceTypePrice(@RequestParam String wahoId, @RequestParam String watyId){
        TxResultResponse resultResponse = new TxResultResponse(CommonCode.SUCCESS.getCode(),"操作成功");
        try {
            Map<String, Object> data = dispensertWahoceService.getWahoceTypePrice(wahoId,watyId);
            resultResponse.setData(data);
            return resultResponse;
        }catch (CommonException e){
            return new TxResultResponse(e.getCode(),e.getMsg());
        } catch (Exception e) {
            return new TxResultResponse(CommonCode.SERVER_ERROR.getCode(),"服务器内部异常");
        }
    }
    @RequestMapping(value = "/getImmediateWahocePrice",method = RequestMethod.POST)
    public TxResultResponse getImmediateWahocePrice(@RequestParam String wahoId){
        TxResultResponse resultResponse = new TxResultResponse(CommonCode.SUCCESS.getCode(),"操作成功");
        try {
            Map<String, Object> data = dispensertWahoceService.getImmediateWahocePrice(wahoId);
            resultResponse.setData(data);
            return resultResponse;
        }catch (CommonException e){
            return new TxResultResponse(e.getCode(),e.getMsg());
        } catch (Exception e) {
            return new TxResultResponse(CommonCode.SERVER_ERROR.getCode(),"服务器内部异常");
        }
    }
    @RequestMapping(value = "/getIntelligenceWahocePrice",method = RequestMethod.POST)
    public TxResultResponse getIntelligenceWahocePrice(@RequestParam String wahoId){
        TxResultResponse resultResponse = new TxResultResponse(CommonCode.SUCCESS.getCode(),"操作成功");
        try {
            Map<String, Object> data = dispensertWahoceService.getIntelligenceWahocePrice(wahoId);
            resultResponse.setData(data);
            return resultResponse;
        }catch (CommonException e){
            return new TxResultResponse(e.getCode(),e.getMsg());
        } catch (Exception e) {
            return new TxResultResponse(CommonCode.SERVER_ERROR.getCode(),"服务器内部异常");
        }
    }
    @RequestMapping(value = "/selWahocePriceParam",method = RequestMethod.POST)
    public TxResultResponse selWahocePriceParam(@RequestParam String warehouseId){
        TxResultResponse resultResponse = new TxResultResponse(CommonCode.SUCCESS.getCode(),"操作成功");
        try {
            List<WahocePriceParam> wahocePriceParams = dispensertWahoceService.selWahocePriceParam(warehouseId);
            resultResponse.setData(wahocePriceParams);
            return resultResponse;
        }catch (CommonException e){
            return new TxResultResponse(e.getCode(),e.getMsg());
        } catch (Exception e) {
            return new TxResultResponse(CommonCode.SERVER_ERROR.getCode(),"服务器内部异常");
        }
    }
    @RequestMapping(value = "/selWahoceTypeByStatus",method = RequestMethod.POST)
    public TxResultResponse selWahoceTypeByStatus(@RequestParam String status){
        TxResultResponse resultResponse = new TxResultResponse(CommonCode.SUCCESS.getCode(),"操作成功");
        try {
            List<WahoceType> wahoceType = dispensertWahoceService.selWahoceTypeByStatus(status);
            resultResponse.setData(wahoceType);
            return resultResponse;
        }catch (CommonException e){
            return new TxResultResponse(e.getCode(),e.getMsg());
        } catch (Exception e) {
            return new TxResultResponse(CommonCode.SERVER_ERROR.getCode(),"服务器内部异常");
        }
    }
}
