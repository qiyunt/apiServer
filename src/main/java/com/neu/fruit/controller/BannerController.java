package com.neu.fruit.controller;

import com.neu.fruit.service.BannerService;
import com.neu.fruit.utils.ResultModel;
import com.neu.fruit.vo.BannerVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/banner")
public class BannerController {

    @Autowired
    private BannerService bannerService;


    @GetMapping
    public ResultModel<List<BannerVO>> find(){
        return bannerService.find();
    }
}
