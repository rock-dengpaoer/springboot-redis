package com.xdt.springbootredis.service.Impl;

import com.xdt.springbootredis.dto.RedisInfo;
import com.xdt.springbootredis.service.RedisService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * @author XDT
 * @ClassName RedisServiceImpl
 * @Description: TODO
 * @Date 2023/3/5 14:27
 **/
@Service()
@Slf4j
public class RedisServiceImpl implements RedisService {

    private static String redisCode = "utf-8";

    @Autowired
    //private RedisTemplate<String, String> redisTemplate;
    private RedisTemplate redisTemplate;


    private RedisConnection execute() {
        return (RedisConnection) redisTemplate.execute(new RedisCallback() {
            @Override
            public Object doInRedis(RedisConnection redisConnection) throws DataAccessException {
                return redisConnection;
            }
        });
    }

    @Override
    public List<RedisInfo> getRedisInfo() {
        log.info("getRedisInfo");
        try {
            List<RedisInfo> list = new ArrayList<>();
            Properties info = execute().info();
            for (String key : info.stringPropertyNames()) {
                RedisInfo redisInfo = new RedisInfo();
                redisInfo.setKey(key);
                redisInfo.setValue(info.getProperty(key));
                list.add(redisInfo);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}
