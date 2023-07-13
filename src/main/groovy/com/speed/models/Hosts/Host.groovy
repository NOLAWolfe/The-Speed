package com.speed.models.Hosts

import com.speed.models.Events.Event
import com.speed.models.Posts.Comment
import com.speed.models.Posts.Post
import com.speed.models.Posts.Status
import groovy.transform.Canonical
import lombok.Data
import lombok.Getter
import lombok.Setter
import org.codehaus.jackson.annotate.JsonProperty

import javax.persistence.*
import javax.validation.constraints.NotNull
import java.time.LocalDate
import java.time.LocalDateTime

@Entity
@Table(name="HOST")
@Canonical
class Host implements Serializable{
    private static final long serialVersionUID = 2028103581041053472L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int hostId;

    @Column(name = "FIRSTNAME")
    @NotNull
    private String firstname;

    @Column(name = "LASTNAME")
    @NotNull
    private String lastname;

    @Column(name = "USERNAME")
    @NotNull
    private String username;

    @Column(name = "EMAIL")
    @NotNull
    private String email;

    @Column(name = "PASSWORD")
    @NotNull
    private String password;

    @Column(name = "WEBSITE")
    private String website;

    @Column(name = "BIO")
    private String bio;

    @Column(name = "BIRTHDATE")
    private LocalDate birthdate;

    @Column(name = "CREATEDATE")
    private LocalDateTime createDate;


    @OneToMany(mappedBy = "followingHost")
    private List<Follow> followingHost

    @OneToMany(mappedBy = "followedHost")
    private List<Follow> followedHost

    @OneToMany(mappedBy = "host")
    private List<Event> events = new ArrayList<>();

    @OneToMany
    private List<Post> posts = new ArrayList<>();

    @OneToMany
    private List<Comment> comments = new ArrayList<>();

    @OneToMany
    private List<Status> status = new ArrayList<>();

    int getHostId() {
        return hostId
    }

    void setHostId(int hostId) {
        this.hostId = hostId
    }

    String getFirstname() {
        return firstname
    }

    void setFirstname(String firstname) {
        this.firstname = firstname
    }

    String getLastname() {
        return lastname
    }

    void setLastname(String lastname) {
        this.lastname = lastname
    }

    String getUsername() {
        return username
    }

    void setUsername(String username) {
        this.username = username
    }

    String getEmail() {
        return email
    }

    void setEmail(String email) {
        this.email = email
    }

    String getPassword() {
        return password
    }

    void setPassword(String password) {
        this.password = password
    }

    String getWebsite() {
        return website
    }

    void setWebsite(String website) {
        this.website = website
    }

    String getBio() {
        return bio
    }

    void setBio(String bio) {
        this.bio = bio
    }

    LocalDate getBirthdate() {
        return birthdate
    }

    void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate
    }

    LocalDateTime getCreateDate() {
        return createDate
    }

    void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate
    }

    List<Follow> getFollowingHost() {
        return followingHost
    }

    void setFollowingHost(List<Follow> followingHost) {
        this.followingHost = followingHost
    }

    List<Follow> getFollowedHost() {
        return followedHost
    }

    void setFollowedHost(List<Follow> followedHost) {
        this.followedHost = followedHost
    }

    List<Event> getEvents() {
        return events
    }

    void setEvents(List<Event> events) {
        this.events = events
    }

    List<Post> getPosts() {
        return posts
    }

    void setPosts(List<Post> posts) {
        this.posts = posts
    }

    List<Comment> getComments() {
        return comments
    }

    void setComments(List<Comment> comments) {
        this.comments = comments
    }

    List<Status> getStatus() {
        return status
    }

    void setStatus(List<Status> status) {
        this.status = status
    }
}
