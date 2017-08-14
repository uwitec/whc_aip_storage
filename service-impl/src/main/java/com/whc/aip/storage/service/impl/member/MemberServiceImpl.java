package com.whc.aip.storage.service.impl.member;

import com.wanhuchina.common.exception.CommonException;
import com.whc.aip.storage.dao.member.MemberMapper;
import com.whc.aip.storage.model.member.Member;
import com.whc.aip.storage.service.member.MemberService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/5/31.
 */
@Service("MemberService")
public class MemberServiceImpl implements MemberService{
    @Resource
    private MemberMapper memberMapper;
    @Override
    public Member getMemberId(String openId) throws CommonException {
         Member memberId = memberMapper.getMemberId(openId);
         return memberId;
    }
}
