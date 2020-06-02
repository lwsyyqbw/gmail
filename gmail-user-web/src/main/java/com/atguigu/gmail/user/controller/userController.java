package com.atguigu.gmail.user.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmail.bean.UmsMember;
import com.atguigu.gmail.bean.UmsMemberReceiveAddress;
import com.atguigu.gmail.service.userService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class userController {

    @Reference
    userService userService;

    @RequestMapping("/findAll")
    public List<UmsMember> findAll() {
        List<UmsMember> umsMemberList = userService.findAll();
        return umsMemberList;
    }

    @RequestMapping("/findAllAddress")
    public List<UmsMemberReceiveAddress> findAllAddress() {
        List<UmsMemberReceiveAddress> umsMemberReceiveAddressList = userService.findAllAddress();
        return umsMemberReceiveAddressList;
    }

    @RequestMapping("/findByUserId/{memberId}")
    public List<UmsMemberReceiveAddress> findAddressByUserId(@PathVariable String memberId) {
        List<UmsMemberReceiveAddress> umsMemberReceiveAddress = userService.findByMemberId(memberId);
        return umsMemberReceiveAddress;
    }

    @RequestMapping("/findUser/{id}")
    public UmsMember findById(@PathVariable String id) {
        UmsMember umsMember = userService.findById(id);
        return umsMember;
    }


}
