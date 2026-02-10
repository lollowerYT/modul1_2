package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    List<Post> posts = new ArrayList<>();
   {

        posts.add(new Post(0L,"Первый пост", new Date()));
        posts.add(new Post(1L,"Второй пост", new Date(2007-1900, 10-1, 12, 12, 29, 36)));
        posts.add(new Post(2L,"Третий пост", new Date()));
    }
    public List<Post> listAllPosts() {return posts;}

    public void create(String text) {
        Long newId = (long) posts.size();
        posts.add(new Post(newId, text, new Date()));
    }
}
