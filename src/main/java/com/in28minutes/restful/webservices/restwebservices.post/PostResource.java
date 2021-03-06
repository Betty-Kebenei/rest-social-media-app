package com.in28minutes.restful.webservices.restwebservices.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PostResource {

    @Autowired
    private PostDaoService service;

    @GetMapping("/users/{userId}/posts")
    public List<Post> retrieveAllPosts(@PathVariable Integer userId){
        List<Post> posts = service.findAllPosts(userId);
        return posts;

    }

}
