package com.atguigu.gmail.user.mapper;



import com.atguigu.gmail.bean.UmsMember;
import com.atguigu.gmail.bean.UmsMemberReceiveAddress;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserMapper extends Mapper<UmsMember> {

    List<UmsMember> selectAllUser();

    List<UmsMemberReceiveAddress> selectAllAddress();
}
