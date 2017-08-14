package com.whc.aip.storage.service.member;

import com.wanhuchina.common.exception.CommonException;
import com.whc.aip.storage.model.member.Member;

/**
 * Created by Administrator on 2017/5/31.
 */
public interface MemberService {
    Member getMemberId(String openId) throws CommonException;
}
