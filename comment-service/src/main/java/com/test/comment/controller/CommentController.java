/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.comment.controller;

import java.util.List;

import com.test.comment.model.Comment;
import com.test.comment.service.CommentService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping
    public List<Comment> getTopicComments(@PathVariable String topic) {
        List<Comment> list = commentService.getTopicComments(topic);
        return list;
    }

    @GetMapping("/{id}")
    public Comment getComment(@PathVariable Long id) {
        Comment comment = commentService.getComment(id);
        return comment;
    }
    @DeleteMapping("/{id}")
    public int deleteComment(@PathVariable Long id) {
        int affectedRows = commentService.deleteComment(id);
        return affectedRows; 
    }

}
