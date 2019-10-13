/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.user.controller;

import com.test.user.model.User;
import com.test.user.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/comments/{topic}")
public class UserController {

    private final UserService commentService;

    public UserController(UserService commentService) {
        this.commentService = commentService;
    }

    @PostMapping
    public User postComment(User comment) {
        return commentService.create(comment);
    }

//    @GetMapping
//    public List<Comment> list(@PathVariable String topic) {
//        return null;
//    }

}
