package com.neu.fruit.controller;

//controller
    //含义:控制器
             //作用:和servlet一样也是用来处理请求产生响应的
    //在springBoot || springMVC中开发步骤
         //添加@RestController
         //在方法添加RequestMapping相关注解
import com.neu.fruit.service.UserService;
import com.neu.fruit.utils.ResultModel;
import com.neu.fruit.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //等价于@Controller      +            @ResponseBody
                          //含义:创建对象并且交给容器管理       //含义:将方法返回的数据转换成JSON格式并响应
public class UserController {

    //JSON
       //含义:特殊格式字符串
       //特殊  数值 boolean 可以不加“”
           //{"name":"zs","age":10}
           //{"name":"zs","age":24,"gf":{"name":"xh",“age“:27}}
           //{"name":"zs","age":24,"friends":[{"name":"xh",“age“:27},{"name":"lw",“age“:30}]}
           //[{"name":"zs","age":10},{"name":"ls","age":20}]
       //校验格式
           //json.cn

       //表现形式
           //json字符串
           //json对象
       //使用场景
           //数据传输载体

    @Autowired   //作用:就是从容器中获取UserService类型的对象
    private UserService userService;

    @RequestMapping("/user")
    public ResultModel<List<UserVO>> find(){

        //连接数据库
        //发送短信
        //...

        return userService.find();
    }
}
