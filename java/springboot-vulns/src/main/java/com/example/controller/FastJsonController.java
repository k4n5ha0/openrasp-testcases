package com.example.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.alibaba.fastjson.*;

@RestController
@RequestMapping(value = "/fastjson")
public class FastJsonController {
    @RequestMapping(value = "/parse")
    public String parseJson(@RequestParam(name="json", required=true) String name) {
        JSONObject obj = JSON.parseObject(name);
        return obj.toString();
    }
}