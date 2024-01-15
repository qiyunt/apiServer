package com.neu.fruit.controller;

import com.neu.fruit.dto.TypeDTO;
import com.neu.fruit.exception.ParamException;
import com.neu.fruit.service.TypeService;
import com.neu.fruit.utils.ResultModel;
import com.neu.fruit.utils.StringUtil;
import com.neu.fruit.vo.TypeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/type")
public class TypeController {
    @Autowired
    private TypeService typeService;

    @GetMapping
    public ResultModel<List<TypeVO>> find(TypeDTO typeDTO){
        if(typeDTO.getShopId()==null){
            throw new ParamException("查询分类信息,参数错误");
        }
        return typeService.find(typeDTO);
    }

    @PostMapping
    public ResultModel add(TypeDTO typeDTO){
        if(typeDTO.getShopId()==null || StringUtil.isEmpty(typeDTO.getName())){
            throw new ParamException("查询分类信息,参数错误");
        }
        return typeService.add(typeDTO);
    }
}
