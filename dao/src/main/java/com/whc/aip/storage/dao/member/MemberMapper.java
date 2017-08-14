package com.whc.aip.storage.dao.member;

import com.wanhuchina.common.exception.CommonException;
import com.whc.aip.storage.model.member.Member;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberMapper {
    int insert(Member record);

    int insertSelective(Member record);

    Member selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Member record);

    int updateByPrimaryKey(Member record);

    Member getMemberId(String openId) throws CommonException;
}