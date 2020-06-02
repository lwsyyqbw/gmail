package com.atguigu.gmail.service;



import com.atguigu.gmail.bean.UmsMember;
import com.atguigu.gmail.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface userService {

    List<UmsMember> findAll();

    List<UmsMemberReceiveAddress> findAllAddress();

    List<UmsMemberReceiveAddress> findByMemberId(String memberId);

    UmsMember findById(String id);

}
