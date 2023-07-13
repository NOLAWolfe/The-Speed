package com.speed.models.Hosts

import com.speed.models.Events.Event
import com.speed.models.Posts.Comment
import com.speed.models.Posts.Post
import com.speed.models.Posts.Status
import groovy.transform.Canonical
import lombok.Data
import lombok.Getter
import lombok.Setter

import javax.persistence.*
import javax.validation.constraints.NotNull
import java.time.LocalDate
import java.time.LocalDateTime

@Entity
@Table(name="HOST")
@Canonical
@Data
class Host implements Serializable{
    private static final long serialVersionUID = 2028103581041053472L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private UUID hostId;

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

}
