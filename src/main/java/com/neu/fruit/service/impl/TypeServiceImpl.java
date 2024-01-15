package com.neu.fruit.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.neu.fruit.dto.TypeDTO;
import com.neu.fruit.mapper.TypeMapper;
import com.neu.fruit.pojo.Type;
import com.neu.fruit.service.TypeService;
import com.neu.fruit.utils.ResultModel;
import com.neu.fruit.vo.TypeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {

 @Autowired
 TypeMapper typeMapper;

 @Override
 public ResultModel<List<TypeVO>> find(TypeDTO typeDTO) {

     List<TypeVO> typeVOList = new ArrayList<>();


     QueryWrapper queryWrapper = new QueryWrapper();
     queryWrapper.eq("shop_id",typeDTO.getShopId());

     List<Type> typeList = typeMapper.selectList(queryWrapper);

     for(Type type : typeList){
         TypeVO typeVO = new TypeVO();
         typeVO.setId(type.getId());
         typeVO.setName(type.getName());
         typeVOList.add(typeVO);
     }
     return ResultModel.success("查询type成功",2,typeVOList);
 }

    @Override
    public ResultModel add(TypeDTO typeDTO) {

        Type type = new Type();
        type.setName(typeDTO.getName());
        type.setShopId(typeDTO.getShopId());

        typeMapper.insert(type);

        return ResultModel.success("添加成功",null);
    }
}
