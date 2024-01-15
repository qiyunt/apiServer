package com.neu.fruit.service.impl;

import com.neu.fruit.mapper.UserMapper;
import com.neu.fruit.pojo.User;
import com.neu.fruit.service.UserService;
import com.neu.fruit.utils.ResultModel;
import com.neu.fruit.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

   //作用:创建UserServiceImpl对象并且放入spring容器
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;


    @Override
    public ResultModel<List<UserVO>> find() {

        List<UserVO> userVOList = new ArrayList<>();

        List<User> userList = userMapper.selectList(null);

        for(User user : userList){
            UserVO userVO = new UserVO();
            userVO.setName(user.getName());
            userVO.setLoginName(user.getLoginName());

            userVO.setAge(user.getAge());

            userVOList.add(userVO);

        }


        return ResultModel.success("查询用户成功",2,userVOList);
    }
}
