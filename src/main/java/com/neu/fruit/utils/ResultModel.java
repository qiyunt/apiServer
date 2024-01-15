package com.neu.fruit.utils;

import lombok.Data;

@Data
public class ResultModel<T> {
    private int code=200;  //200代表业务处理成功  500代表业务处理失败

    private String msg;     //提示

    private Integer total;  //数据的总数量

    private T data;         //返回的数据本身


    public static <T> ResultModel<T> success(String msg,T data){
        ResultModel<T> resultModel = new ResultModel<>();
        resultModel.setMsg(msg);
        resultModel.setData(data);
        return resultModel;
    }

    public static <T> ResultModel<T> success(String msg,int total,T data){
        ResultModel<T> resultModel = new ResultModel<>();
        resultModel.setMsg(msg);
        resultModel.setTotal(total);
        resultModel.setData(data);
        return resultModel;
    }

    public static <T> ResultModel<T> failure(String msg){
        ResultModel<T> resultModel = new ResultModel<>();
        resultModel.setMsg(msg);
        resultModel.setCode(500);
        return resultModel;
    }

    public static <T> ResultModel<T> failure(String msg,int code){
        ResultModel<T> resultModel = new ResultModel<>();
        resultModel.setMsg(msg);
        resultModel.setCode(code);
        return resultModel;
    }
}
