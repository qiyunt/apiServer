package com.neu.fruit.vo;

import lombok.Data;

@Data
public class UserVO {

    private String name;
    private String loginName;
    private int age;

    //lombok
        //含义:自动帮我们生成setter\getter\toString等等
        //使用步骤
             //idea需要安装插件
             //项目中添加依赖
             //愉快的使用
                 //@Data



}
