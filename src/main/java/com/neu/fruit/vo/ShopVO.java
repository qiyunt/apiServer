package com.neu.fruit.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
public class ShopVO {

    private Integer id;
    private String name;
    private String photo;


    private String description;
    private Integer deliveryPrice;
    private Integer minPrice;


    private Boolean popular;
}
