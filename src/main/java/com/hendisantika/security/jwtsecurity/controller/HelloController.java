package com.hendisantika.security.jwtsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : jwt-security
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 07/10/17
 * Time: 10.03
 * To change this template use File | Settings | File Templates.
 */

@RestController
@RequestMapping("/rest/hello")
public class HelloController {

    @GetMapping
    public String hello() {
        return "Hello World";
    }
}
