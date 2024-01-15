package com.neu.fruit.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_type")
public class Type {

    @TableId(type= IdType.AUTO)
    private Integer id;
    private String name;
    private Integer shopId;

}
