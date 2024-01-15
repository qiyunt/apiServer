package com.neu.fruit.service;

import com.neu.fruit.utils.ResultModel;
import com.neu.fruit.vo.BannerVO;

import java.util.List;

public interface BannerService {
    ResultModel<List<BannerVO>> find();
}
