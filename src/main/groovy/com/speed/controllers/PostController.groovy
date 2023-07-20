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
@RequestMapping(value = "/post")
class PostController {

    @Autowired
    private PostDAO postDAO

    @Autowired
    private PostService postService

    @PostMapping(value = "/s")
    ResponseEntity<List<Post>> savePost(@RequestBody Post post) {
        new ResponseEntity<>(postService.createPost(post), HttpStatus.CREATED)
    }
    @GetMapping("/")
    ResponseEntity<List<Post>> findAllPosts() {
        new ResponseEntity<List<Post>>(postService.findAllPost(), HttpStatus.OK)
    }
    @PostMapping(value="/gpbi")
    ResponseEntity<Post> getPostById(@RequestBody String Id) {
        new ResponseEntity<Post>(postService.findPostById(Id), HttpStatus.OK)
    }

    @PostMapping(value = "/gpbhi")
    ResponseEntity<List<Post>> findPostByHostId(@RequestBody String hostId) {
        new ResponseEntity<>(postService.findPostsByHostId(hostId), HttpStatus.OK)
    }

    @PostMapping(value="/dpbi")
    ResponseEntity<List<Post>> deleteById(@RequestBody String postId){
        new ResponseEntity<>(postService.deleteByPostId(postId), HttpStatus.OK)
    }

}
