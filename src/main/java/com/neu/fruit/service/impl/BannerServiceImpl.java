package com.neu.fruit.service.impl;

import com.neu.fruit.mapper.BannerMapper;
import com.neu.fruit.pojo.Banner;
import com.neu.fruit.service.BannerService;
import com.neu.fruit.utils.ResultModel;
import com.neu.fruit.vo.BannerVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BannerServiceImpl implements BannerService {

 @Autowired
 BannerMapper bannerMapper;

 @Override
 public ResultModel<List<BannerVO>> find() {

     List<BannerVO> bannerVOList = new ArrayList<>();

     List<Banner> bannerList = bannerMapper.selectList(null);

     for(Banner banner : bannerList){
         BannerVO bannerVO = new BannerVO();
         bannerVO.setName(banner.getName());
         bannerVO.setIcon(banner.getIcon());
         bannerVO.setId(banner.getId());

         bannerVOList.add(bannerVO);
     }
     return ResultModel.success("查询banner成功",2,bannerVOList);
 }
}
