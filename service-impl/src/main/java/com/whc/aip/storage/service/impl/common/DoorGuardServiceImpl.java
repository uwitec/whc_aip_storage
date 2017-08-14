package com.whc.aip.storage.service.impl.common;

import com.google.common.base.Strings;
import com.wanhuchina.common.code.CommonCode;
import com.wanhuchina.common.exception.CommonException;
import com.whc.aip.storage.dao.common.DoorGuardMapper;
import com.whc.aip.storage.model.common.DoorGuard;
import com.whc.aip.storage.service.common.DoorGuardService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by shenshanghua
 * Email shenshanghua@wanhuchina.com
 * Date：2017/7/21
 * Time：10:45
 */
@Service("doorGuardService")
public class DoorGuardServiceImpl implements DoorGuardService{

    @Resource
    private DoorGuardMapper doorGuardMapper;

    @Override
    public List<DoorGuard> getDoorGuardList(String memberId) throws CommonException {
        if(!Strings.isNullOrEmpty(memberId)){

            List<DoorGuard> doorGuardList = doorGuardMapper.getDoorGuardList(memberId);
            return doorGuardList;
        }else{
            throw new CommonException(CommonCode.DATA_NOT_FOUND.getCode(),"入参memberId为空");
        }
    }
}
