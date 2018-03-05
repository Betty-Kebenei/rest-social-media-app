package com.in28minutes.restful.webservices.restwebservices.post;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class PostDaoService {

    private static List<Post> posts = new ArrayList<>();

    private static List<Post> userposts = new ArrayList<>();


    private static int postCount = 4;

    static {
        posts.add(new Post(1, 1, "Java", "This is a Java course", new Date()));
        posts.add(new Post(2, 1, "JavaScript", "This is a JavaScript course", new Date()));
        posts.add(new Post(3, 2,  "Python", "This is a Python course", new Date()));
        posts.add(new Post(4, 2, "Perl", "This is a Perl course", new Date()));
    }

    public static List<Post> findAllPosts(int userId) {
        for(Post post:posts){
            if(post.getUserId()==userId){
                userposts.add(post);
            }
        }
        if(userposts != null){
            return userposts;
        }
        return null;
    }

    public Post save(Post post) {
        if(post.getId()==null){
            post.setId(++postCount);
        }
        posts.add(post);
        return post;
    }

    public Post findOnePost(int id){

        for(Post post:posts){
            if(post.getId()==id){
                return post;
            }
        }
        return null;
    }

}
