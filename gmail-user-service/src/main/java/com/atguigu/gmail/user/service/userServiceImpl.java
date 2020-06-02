package com.atguigu.gmail.user.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmail.bean.UmsMember;
import com.atguigu.gmail.bean.UmsMemberReceiveAddress;
import com.atguigu.gmail.service.userService;
import com.atguigu.gmail.user.mapper.UmsMemberReceiveAddressMapper;
import com.atguigu.gmail.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class userServiceImpl implements userService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UmsMemberReceiveAddressMapper userAddressMapper;
    @Override
    public List<UmsMember> findAll() {
        return userMapper.selectAllUser();
    }

    @Override
    public List<UmsMemberReceiveAddress> findAllAddress() {
        return userMapper.selectAllAddress();
    }

    @Override
    public List<UmsMemberReceiveAddress> findByMemberId(String memberId) {
//        UmsMemberReceiveAddress address = new UmsMemberReceiveAddress();
//        address.setMemberId(memberId);
//        List<UmsMemberReceiveAddress> select = userAddressMapper.select(address);

        Example example = new Example(UmsMemberReceiveAddress.class);
        example.createCriteria().andEqualTo("memberId", memberId);
        List<UmsMemberReceiveAddress> umsMemberReceiveAddressList = userAddressMapper.selectByExample(example);
        return umsMemberReceiveAddressList;
    }

    @Override
    public UmsMember findById(String id) {
        UmsMember umsMember = userMapper.selectByPrimaryKey(id);
        return umsMember;
    }
}
