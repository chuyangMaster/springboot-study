package com.xd.controller;

import com.xd.domain.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ValueController {

    @Value("${server.port}")
    private String port;

    @Value("${mycar.brand}")
    private String carBrand;

    @Value("${mycar.price}")
    private Integer carPrice;

    @Autowired
    private Car car;

    @RequestMapping("/value")
    @ResponseBody
    public String getValue(){
        return "端口号：" + port + "；车品牌：" + carBrand + "; 车价格：" + carPrice + "; Car信息：" + car;
    }


}
