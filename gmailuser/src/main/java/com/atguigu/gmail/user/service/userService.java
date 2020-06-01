package com.atguigu.gmail.user.service;

import com.atguigu.gmail.user.bean.UmsMember;
import com.atguigu.gmail.user.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface userService {

    List<UmsMember> findAll();

    List<UmsMemberReceiveAddress> findAllAddress();

    List<UmsMemberReceiveAddress> findByMemberId(String memberId);

    UmsMember findById(String id);

}
