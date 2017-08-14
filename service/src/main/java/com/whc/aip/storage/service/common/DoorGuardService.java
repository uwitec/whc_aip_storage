package com.whc.aip.storage.service.common;

import com.wanhuchina.common.exception.CommonException;
import com.whc.aip.storage.model.common.DoorGuard;

import java.util.List;

/**
 * Created by shenshanghua
 * Email shenshanghua@wanhuchina.com
 * Date：2017/7/21
 * Time：10:39
 */
public interface DoorGuardService {
    /**
     * 用户门禁权限列表
     */
    List<DoorGuard> getDoorGuardList(String memberId) throws CommonException;

}
