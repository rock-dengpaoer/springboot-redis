package com.xdt.springbootredis.service;

import com.xdt.springbootredis.dto.RedisInfo;

import java.util.List;

public interface RedisService {
    /**
     * 获取Redis基础info列表
     *
     * @return
     */
    List<RedisInfo> getRedisInfo();

    Boolean set(String key, String value);
}
