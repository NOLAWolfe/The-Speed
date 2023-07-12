package com.speed.daos


import com.speed.models.Hosts.Host
import com.speed.models.Posts.Post
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PostDAO extends JpaRepository<Post, Integer>{

//    private class PostCassandraDAO extends CassandraRepositiory<Post, UUID>{
//
//    }

    Post save(Post post)
    List<Post> findAll()
    Post findByPostId(int postId)
    List<Post> findPostsByHostHostId(int hostId)
    Post findPostByHostUsername(String username)
}
