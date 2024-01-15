package com.neu.fruit.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.neu.fruit.dto.ShopDTO;
import com.neu.fruit.mapper.ShopMapper;
import com.neu.fruit.pojo.Shop;
import com.neu.fruit.service.ShopService;
import com.neu.fruit.utils.ResultModel;
import com.neu.fruit.vo.ShopVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShopServiceImpl implements ShopService {

 @Autowired
 ShopMapper shopMapper;

 @Override
 public ResultModel<List<ShopVO>> find(ShopDTO shopDTO) {

     List<ShopVO> shopVOList = new ArrayList<>();

     //封装查询条件
     QueryWrapper queryWrapper = new QueryWrapper();
     if(shopDTO.getBannerId()!=null){
         queryWrapper.eq("banner_id",shopDTO.getBannerId());
     }

     List<Shop> shopList = shopMapper.selectList(queryWrapper);

     for(Shop shop : shopList){
         ShopVO shopVO = new ShopVO();
         shopVO.setId(shop.getId());

         shopVO.setName(shop.getName());
         shopVO.setPhoto(shop.getPhoto());

         shopVO.setDescription(shop.getDescription());
         shopVO.setDeliveryPrice(shop.getDeliveryPrice());
         shopVO.setMinPrice(shop.getMinPrice());
         shopVO.setPopular(shop.getPopular());
         shopVOList.add(shopVO);
     }
     return ResultModel.success("查询shop成功",2,shopVOList);
 }
}
