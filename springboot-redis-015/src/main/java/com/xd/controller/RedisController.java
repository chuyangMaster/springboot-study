package com.xd.controller;

import com.xd.domain.Student;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class RedisController {

    /**
     * 1、redisTemplate、stringRedisTemplate是引入redis场景启动器由容器创建出来的类
     * 2、可以使用redisTemplate、stringRedisTemplate类的方法操作redis数据库，底层使用的redis服务器是lettuce
     * 3、redisTemplate的序列化方式是JDK序列化（不支持跨语言，java）、stringRedisTemplate使用的是String序列化，可读性好
     * 4、JDK序列化简单，但效率低；也可以用json、Kryo（不支持跨语言，java）等序列化，可以跨语言，效率也高
     */

    @Resource
    private RedisTemplate redisTemplate;

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @PostMapping("/redis/set")
    public String setRedisKV(String key, String value){
        ValueOperations valueOperations = redisTemplate.opsForValue();
        valueOperations.set(key, value);
        return "redis添加数据成功";
    }

    @GetMapping("/redis/get")
    public String getRedisValue(String key){
        ValueOperations valueOperations = redisTemplate.opsForValue();
        Object value = valueOperations.get(key);
        return "key是:" + key + "；获取的value是:" + value;
    }

    @PostMapping("/redis/setString")
    public String setStringRedisKV(String key, String value){
        ValueOperations<String, String> stringStringValueOperations = stringRedisTemplate.opsForValue();
        stringStringValueOperations.set(key, value);
        return "redis添加数据成功";
    }

    @GetMapping("/redis/getString")
    public String getStringRedisValue(String key){
        ValueOperations<String, String> stringStringValueOperations = stringRedisTemplate.opsForValue();
        String s = stringStringValueOperations.get(key);
        return "key是:" + key + "；获取的value是:" + s;
    }


    /**
     * 设置RedisTemplate的序列化方式
     *
     * @param key 从路径变量获取值
     * @param value 从路径变量获取值
     * @return
     */
    @PostMapping("/redis/setStr/{key}/{value}")
    public String setRedis(@PathVariable String key, @PathVariable String value){
        //设置key的序列化方式
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        //设置value的序列化方式
        redisTemplate.setValueSerializer(new StringRedisSerializer());

        redisTemplate.opsForValue().set(key, value);
        return "设置RedisTemplcate的序列化方式";
    }

    @GetMapping("/redis/getStr/{key}")
    public String getRedis(@PathVariable String key){
        Object value = redisTemplate.opsForValue().get(key);
        return "对应key:" + key + "的value是：" + value;
    }

    //将java对象序列化为json保存
    @PostMapping("/redis/setJson")
    public String setJson(){
        Student student = new Student(101, "甘雨", 22);

        //通常，key用String序列化，可读性好，即在redis客户端可读性好
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        //value用json序列化，支持跨语言
        redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer(Student.class));

        //表示将"student"用String序列化保存，student用json序列化保存
        redisTemplate.opsForValue().set("mystudent", student);

        return "json序列化";
    }

    //将json反序列化为java对象
    @GetMapping("/redis/getJson")
    public String getJson(){
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer(Student.class));

        Object mystudent = redisTemplate.opsForValue().get("mystudent");
        return "json反序列化=" + mystudent;
    }

}
