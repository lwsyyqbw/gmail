package com.atguigu.gmail.user.service.Impl;

import com.atguigu.gmail.user.bean.UmsMember;
import com.atguigu.gmail.user.bean.UmsMemberReceiveAddress;
import com.atguigu.gmail.user.mapper.UserAddressMapper;
import com.atguigu.gmail.user.mapper.UserMapper;
import com.atguigu.gmail.user.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
@Service
public class userServiceImpl implements userService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserAddressMapper userAddressMapper;
    @Override
    public List<UmsMember> findAll() {
        return userMapper.selectAllUser();
    }

    @Override
    public List<UmsMemberReceiveAddress> findAllAddress() {
        return userAddressMapper.selectAllAddress();
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
