package com.whc.aip.storage.dao.common;

import com.wanhuchina.common.exception.CommonException;
import com.whc.aip.storage.model.common.DoorGuard;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by shenshanghua
 * Email shenshanghua@wanhuchina.com
 * Date：2017/7/21
 * Time：10:51
 */
@Repository
public interface DoorGuardMapper {

    List<DoorGuard> getDoorGuardList(String memberId) throws CommonException;
}
