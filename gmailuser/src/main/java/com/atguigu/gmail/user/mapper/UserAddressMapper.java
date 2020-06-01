package com.atguigu.gmail.user.mapper;

import com.atguigu.gmail.user.bean.UmsMemberReceiveAddress;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserAddressMapper extends Mapper<UmsMemberReceiveAddress> {
    List<UmsMemberReceiveAddress> selectAllAddress();
}
