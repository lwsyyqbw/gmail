package com.atguigu.gmail.user.mapper;

import com.atguigu.gmail.user.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserMapper extends Mapper<UmsMember>{
    List<UmsMember> selectAllUser();


}
