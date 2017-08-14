package com.whc.aip.storage.service.impl.wahoce;

import com.wanhuchina.common.exception.CommonException;
import com.whc.aip.storage.dao.wahoce.ImmediateWahocePriceMapper;
import com.whc.aip.storage.dao.wahoce.IntelligenceWahocePriceMapper;
import com.whc.aip.storage.dao.wahoce.WahoceTypePriceMapper;
import com.whc.aip.storage.dao.warehouse.WahoceTypeMapper;
import com.whc.aip.storage.model.wahoce.ImmediateWahocePrice;
import com.whc.aip.storage.model.wahoce.IntelligenceWahocePrice;
import com.whc.aip.storage.model.wahoce.WahocePriceParam;
import com.whc.aip.storage.model.wahoce.WahoceTypePrice;
import com.whc.aip.storage.model.warehouse.WahoceType;
import com.whc.aip.storage.service.wahoce.WahoceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by WangHu
 * Email：wanghu@wanhuchina.com
 * Date：2017/6/27
 * Time：17:10
 */
@Service("WahoceService")
public class WahoceServiceImpl implements WahoceService{
    @Resource
    private WahoceTypePriceMapper wahoceTypePriceMapper;
    @Resource
    private WahoceTypeMapper wahoceTypeMapper;
    @Resource
    private ImmediateWahocePriceMapper immediateWahocePriceMapper;
    @Resource
    private IntelligenceWahocePriceMapper intelligenceWahocePriceMapper;
    @Override
    public WahoceTypePrice getWahoceTypePrice(WahoceTypePrice wahoceTypePriceParams) {
        WahoceTypePrice wahoceTypePrice = wahoceTypePriceMapper.getWahoceTypePrice(wahoceTypePriceParams);
        return wahoceTypePrice;
    }

    @Override
    public List<ImmediateWahocePrice> getImmediateWahocePrice(ImmediateWahocePrice immediateWahocePriceParams) {
        List<ImmediateWahocePrice> immediateWahocePrices = immediateWahocePriceMapper.getImmediateWahocePrice(immediateWahocePriceParams);
        return immediateWahocePrices;
    }

    @Override
    public List<IntelligenceWahocePrice> getIntelligenceWahocePrice(IntelligenceWahocePrice intelligenceWahocePriceParams) {
        List<IntelligenceWahocePrice> intelligenceWahocePrices = intelligenceWahocePriceMapper.getIntelligenceWahocePrice(intelligenceWahocePriceParams);
        return intelligenceWahocePrices;
    }

    @Override
    public List<WahocePriceParam> selWahocePriceParam(String warehouseId) throws CommonException {
        List<WahocePriceParam> wahocePriceParams = wahoceTypeMapper.selWahocePriceParam(warehouseId);
        return wahocePriceParams;
    }

    @Override
    public List<WahoceType> selWahoceTypeByStatus(String status) throws CommonException {
        List<WahoceType> wahoceType = wahoceTypeMapper.selWahoceTypeByStatus(status);
        return wahoceType;
    }
}
