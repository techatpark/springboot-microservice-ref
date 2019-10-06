/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.resource.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentController {
    @RequestMapping("/resourcehome")
    public String sayHello() {
        return "Hello World from Resource Server!!!";
    }

    @RequestMapping("/name")
    public String printName() {
        return "";
    }

}
