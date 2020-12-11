package com.speed.models

import groovy.transform.Canonical

import javax.persistence.*
import javax.validation.constraints.NotNull
import java.time.LocalDate

@Entity
@Table(name = "USER")
@Canonical
class User implements Serializable{
    private static final long serialVersionUID = 2028103581041053472L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USERID")
    private int userid;
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

    @OneToMany(mappedBy = "userId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<UserEvent> events = new ArrayList<>();
}
