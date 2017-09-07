package com.jarjune.supervise.controller;

import com.jarjune.supervise.config.IndexConfig;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/index")
public class LoginController {

    @Resource
    IndexConfig indexConfig;

    @RequestMapping(value = "/name/{name}")
    public String print(@PathVariable String name) {
        return name + "-" + indexConfig.getUser() + "-" + indexConfig.getPassword();
    }

    @RequestMapping(value = "/login")
    public String login() {
        return "login.html";
    }

    @RequestMapping(value = "/login/user/{user}/password/{password}", method = RequestMethod.POST)
    public String login(@PathVariable String user, @PathVariable String password) {
        return user + "--" + password;
    }
}
