package cn.itheima.mybatis.mapper;

import java.io.Serializable;
import java.util.List;

import cn.itheima.mybatis.pojo.User;

public interface UserMapper extends Serializable {

	public User findUserById(Integer id);
}
