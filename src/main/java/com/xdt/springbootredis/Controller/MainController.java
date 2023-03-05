package com.xdt.springbootredis.Controller;

import com.xdt.springbootredis.Until.Result;
import com.xdt.springbootredis.dto.RedisInfo;
import com.xdt.springbootredis.service.Impl.RedisServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author XDT
 * @ClassName MainController
 * @Description: TODO
 * @Date 2023/3/5 11:34
 **/
@RestController
@RequestMapping("/")
public class MainController {

    @GetMapping("/hello")
    public Result hello(){
        return Result.success("hello,world", null);
    }

    @Autowired
    private RedisServiceImpl redisService;

    @GetMapping("/getRedisInfo")
    public Result getRedisInfo(){
        List<RedisInfo> redisInfo = redisService.getRedisInfo();
        return Result.success("success", redisInfo);
    }
}
