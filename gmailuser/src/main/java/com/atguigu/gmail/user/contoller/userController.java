package com.atguigu.gmail.user.contoller;

import com.atguigu.gmail.user.bean.UmsMember;
import com.atguigu.gmail.user.bean.UmsMemberReceiveAddress;
import com.atguigu.gmail.user.service.Impl.userServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class userController {
    @Autowired
    private userServiceImpl userServiceImpl;

    @RequestMapping("/findAll")
    public List<UmsMember> findAll() {
        List<UmsMember> umsMemberList = userServiceImpl.findAll();
        return umsMemberList;
    }

    @RequestMapping("/findAllAddress")
    public List<UmsMemberReceiveAddress> findAllAddress() {
        List<UmsMemberReceiveAddress> umsMemberReceiveAddressList = userServiceImpl.findAllAddress();
        return umsMemberReceiveAddressList;
    }

    @RequestMapping("/findByUserId/{memberId}")
    public List<UmsMemberReceiveAddress> findAddressByUserId(@PathVariable String memberId) {
        List<UmsMemberReceiveAddress> umsMemberReceiveAddress = userServiceImpl.findByMemberId(memberId);
        return umsMemberReceiveAddress;
    }

    @RequestMapping("/findUser/{id}")
    public UmsMember findById(@PathVariable String id) {
        UmsMember umsMember = userServiceImpl.findById(id);
        return umsMember;
    }


}
