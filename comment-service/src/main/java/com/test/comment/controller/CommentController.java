/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.comment.controller;

import com.test.comment.service.CommentService;
import com.test.comment.model.Comment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/comments/{topic}")
public class CommentController {

    private final CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @PostMapping
    public Comment postComment(Comment comment) {
        return commentService.create(comment);
    }

//    @GetMapping
//    public List<Comment> list(@PathVariable String topic) {
//        return null;
//    }

}
