package com.speed.models.Hosts

import com.speed.models.Events.Event
import com.speed.models.Posts.Comment
import com.speed.models.Posts.Post
import com.speed.models.Posts.Status
import groovy.transform.Canonical

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
    @Column(name = "HOSTID")
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


    @OneToMany
    private List<Event> events = new ArrayList<>();

    @OneToMany
    private List<Post> posts = new ArrayList<>();

    @OneToMany
    private List<Comment> comments = new ArrayList<>();

    @OneToMany
    private List<Status> status = new ArrayList<>();
}
