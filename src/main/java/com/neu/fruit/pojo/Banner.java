package com.neu.fruit.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.omg.CORBA.IDLType;

@Data
@TableName("t_banner")
public class Banner {

    @TableId(type= IdType.AUTO)
    private Integer id;
    private String name;
    private String icon;

}
