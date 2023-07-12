package com.speed.services

import com.speed.daos.HostDAO
import com.speed.daos.PostDAO
import com.speed.models.Hosts.Host
import com.speed.models.Posts.Post
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@Service
class PostService {
    private PostDAO postDAO

    @Autowired
    void setPostDAO(PostDAO postDAO) { this.postDAO = postDAO }

//    -------------------------------------------------

//    Post getPostById(int id) {
//        println("Retrieving Post By Id: " + id)
//        Post post = postDAO.findByPostId(id)
//        println("Post Retrieved: " + post)
//    }

//    Post createPost(Post post) { postDAO.createPost(post) }

//    Post getPostByHostUsername(String username) { postDAO.findPostByHostUsername(username) }

//    Post findPostByHostId(int id) { postDAO.findPostByHostHostId(id) }

}
