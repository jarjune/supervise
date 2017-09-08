package com.jarjune.supervise.controller;

import com.jarjune.supervise.config.IndexConfig;
import com.jarjune.supervise.entity.UserEntity;
import com.jarjune.supervise.service.IndexService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/index")
public class IndexController {

    @Resource
    IndexConfig indexConfig;

    @Resource
    IndexService indexService;

    @RequestMapping(value = "/name/{name}")
    public String print(@PathVariable String name) {
        return name + "-" + indexConfig.getUser() + "-" + indexConfig.getPassword();
    }

    @RequestMapping(value = {"/index", "/login"})
    public List<UserEntity> login() {
        return indexService.getUser("aaaa");
    }

    @RequestMapping(value = "/login/user/{user}/password/{password}", method = RequestMethod.POST)
    public String login(@PathVariable String user, @PathVariable String password) {
        return user + "--" + password;
    }
}
