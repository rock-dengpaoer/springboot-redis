package com.xdt.springbootredis.Until;

import org.springframework.http.HttpStatus;

/**
 * @author XDT
 * @ClassName Result
 * @Description: 统一返回类型
 * @Date 2023/3/5 11:50
 **/
public class Result<T> {

    private String code;
    private String message;
    private T data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    /*成功*/
    private static final String success = HttpStatus.OK.value() + "";
    /*服务器内部错误*/
    private static final String error = HttpStatus.INTERNAL_SERVER_ERROR.value() + "";
    /*404错误，找不到地址*/
    private static final String notFound = HttpStatus.NOT_FOUND.value() + "";

    private Result(String code, String message, T t){
        this.code = code;
        this.message = message;
        this.data = t;
    }

    private Result(String code, String message){
        this.code = code;
        this.message = message;
    }

    public static Result success(String message, Object data){
        return new Result(success, message, data);
    }

    public static Result error(String message){
        return new Result(error, message);
    }
}
