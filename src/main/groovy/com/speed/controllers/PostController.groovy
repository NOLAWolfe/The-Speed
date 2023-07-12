package com.speed.controllers

import com.speed.daos.PostDAO
import com.speed.models.Hosts.Host
import com.speed.models.Posts.Post
import com.speed.services.HostService
import com.speed.services.PostService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

import java.lang.reflect.Array

@RestController
@RequestMapping(value = "api/postService")
class PostController {

    @Autowired
    private PostDAO postDAO

//    @Autowired
//    void setPostService(PostService postService) { this.postService = postService }


    @PostMapping(value = "/sp")
    ResponseEntity<Post> savePost(@RequestBody Post post) {
        new ResponseEntity<>(postDAO.save(post), HttpStatus.OK)
    }
    @GetMapping("/a")
    ResponseEntity<List<Post>> findAllPosts() {
        new ResponseEntity<List<Post>>(postDAO.findAll(), HttpStatus.OK)
    }
    @PostMapping(value="/gpbi")
    ResponseEntity<Post> getPostById(@RequestBody int postId) {
        new ResponseEntity<Post>(postDAO.findByPostId(postId), HttpStatus.OK)
    }


    @PostMapping(value = "/gpbhi")
    ResponseEntity<List<Post>> findPostByHostId(@RequestBody int hostId) {
        new ResponseEntity<>(postDAO.findPostsByHostHostId(hostId), HttpStatus.OK)
    }
    @PostMapping(value = "/gpbhu")
    ResponseEntity<Post> findPostByHostUsername(@RequestBody String hostUsername) {
        new ResponseEntity<Post>(postDAO.findPostByHostUsername(hostUsername), HttpStatus.OK)
    }


}
