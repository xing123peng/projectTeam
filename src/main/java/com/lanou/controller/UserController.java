package com.lanou.controller;

/**
 * Created by peng on 2018/7/25.
 */

@Controller
public class UserController {
    @RequestMapping(value = "login")
    public String login(){
        return "login";
    }

}
