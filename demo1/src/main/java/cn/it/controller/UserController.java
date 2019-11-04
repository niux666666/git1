package cn.it.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("/user")
public class UserController {

    @RequestMapping("/get")
    @ResponseBody
    public String User(){
        return "tom";
    }
}
