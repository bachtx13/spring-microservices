package com.bachtx.eurekaclientbook.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

public interface GreetingController {
    @RequestMapping(value = "/greeting")
    String greeting();
}
