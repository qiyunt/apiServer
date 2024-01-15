package com.neu.fruit.service;

import com.neu.fruit.utils.ResultModel;
import com.neu.fruit.vo.UserVO;

import java.util.List;

public interface UserService {
    ResultModel<List<UserVO>> find();
}
