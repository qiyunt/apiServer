package com.neu.fruit.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_user")  //代表当前实体类和哪张表对应  t_user
public class User {
    //POJO 的字段和表结构完全对应

    @TableId(type= IdType.AUTO)   //代表主键自增长
    private Integer id;

    private String name;
    private Integer age;
    private String loginName;  //为什么能找到表中的这一列login_name,因为内置有自动命名转换
    private String password;
}
