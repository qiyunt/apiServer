package com.neu.fruit.controller;

import com.neu.fruit.dto.ShopDTO;
import com.neu.fruit.service.ShopService;
import com.neu.fruit.utils.ResultModel;
import com.neu.fruit.vo.ShopVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/shop")
public class ShopController {

    @Autowired
    private ShopService shopService;

    //查找配送范围是【10，                   20】

    @GetMapping
    public ResultModel<List<ShopVO>> find(ShopDTO shopDTO){
        return shopService.find(shopDTO);
    }
}
