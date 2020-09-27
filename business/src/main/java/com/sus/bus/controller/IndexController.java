package com.sus.bus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {
    @Resource
    private HttpServletRequest servletRequest;


    /**
     * 生成短链接
     */
    @GetMapping("/createShortCode")
    @ResponseBody
    public String createShortCode() {

        return "success";
    }


}
