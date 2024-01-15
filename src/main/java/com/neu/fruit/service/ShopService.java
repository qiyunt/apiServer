package com.neu.fruit.service;

import com.neu.fruit.dto.ShopDTO;
import com.neu.fruit.utils.ResultModel;
import com.neu.fruit.vo.ShopVO;

import java.util.List;

public interface ShopService {
    ResultModel<List<ShopVO>> find(ShopDTO shopDTO);
}
