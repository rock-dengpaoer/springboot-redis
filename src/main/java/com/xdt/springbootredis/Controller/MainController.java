package com.xdt.springbootredis.Controller;

import com.xdt.springbootredis.Until.Result;
import org.springframework.web.bind.annotation.*;

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
}
