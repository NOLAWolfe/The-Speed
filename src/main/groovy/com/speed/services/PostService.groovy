package com.speed.services

import com.speed.daos.HostDAO
import com.speed.daos.PostDAO
import com.speed.models.Hosts.Host
import com.speed.models.Posts.Post
import org.apache.tomcat.jni.Local
import org.json.JSONObject
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

import java.time.LocalDateTime

@Service
class PostService {

    @Autowired
    private PostDAO postDAO
    @Autowired
    private HostDAO hostDAO


    List<Post> createPost(Post post) {
        LocalDateTime ldt = LocalDateTime.now()
        post.setCreateDate(ldt)

        Host host = hostDAO.findByUsername(post.host.username)
        println(
                "\nPost: "+ post
        +       "\nHost: "+ post.host
        +   "\nHostUsername(M4):"+ post.host.username)


        post.setHost(host)
        postDAO.save(post)

        List<Post> result = postDAO.findAll()
        result
    }

    List<Post> findAllPost(){
        println("Retrieving All Post...")
        postDAO.findAll()
    }

    Post findPostById(String id) {
        JSONObject json = new JSONObject(id)
        Post post = postDAO.findByPostId(json.getInt("id"))
        post
    }

    List<Post> findPostsByHostId(String id) {
        JSONObject json = new JSONObject(id)
        List<Post> posts = postDAO.findPostsByHostHostId(json.getInt("id"))
        posts
    }

    List<Post> deleteByPostId(String id){
        JSONObject json = new JSONObject(id)
        Post post = postDAO.deleteByPostId(json.getInt("id"))
        postDAO.findAll()
    }

}
