/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.comment.server.controller;

import com.test.comment.server.model.Comment;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/comments/{topic}")
public class CommentController {

    @PostMapping
    public Comment postComment(Comment comment) {
        return comment;
    }

//    @GetMapping
//    public List<Comment> list(@PathVariable String topic) {
//        return null;
//    }

}
