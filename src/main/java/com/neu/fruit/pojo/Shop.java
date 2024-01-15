package com.neu.fruit.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_shop")
public class Shop {

    @TableId(type = IdType.AUTO)
    private Integer id;
    private String name;
    private String photo;


    private String description;
    private Integer deliveryPrice;
    private Integer minPrice;

    private Integer bannerId;
    private Boolean popular;

}
