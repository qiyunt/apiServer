package com.neu.fruit.service;

import com.neu.fruit.dto.TypeDTO;
import com.neu.fruit.utils.ResultModel;
import com.neu.fruit.vo.TypeVO;

import java.util.List;

public interface TypeService {
    ResultModel<List<TypeVO>> find(TypeDTO typeDTO);

    ResultModel add(TypeDTO typeDTO);
}
