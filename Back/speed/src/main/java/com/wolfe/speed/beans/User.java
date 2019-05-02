package com.wolfe.speed.beans;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "USER")
public class User implements Serializable {

	/**
	* 
	*/
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


	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int userid) {
		super();
		this.userid = userid;
	}

	public User(int userid, @NotNull String firstname, @NotNull String lastname, @NotNull String username,
			@NotNull String email, @NotNull String password, @NotNull String website, @NotNull String bio,
			@NotNull LocalDate birthdate, List<UserEvent> events) {
		super();
		this.userid = userid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.email = email;
		this.password = password;
		this.website = website;
		this.bio = bio;
		this.birthdate = birthdate;
		this.events = events;
	}

	public User(@NotNull String firstname, @NotNull String lastname, @NotNull String username, @NotNull String email,
			@NotNull String password, @NotNull String website, @NotNull String bio, @NotNull LocalDate birthdate,
			List<UserEvent> events) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.email = email;
		this.password = password;
		this.website = website;
		this.bio = bio;
		this.birthdate = birthdate;
		this.events = events;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", firstname=" + firstname + ", lastname=" + lastname + ", username="
				+ username + ", email=" + email + ", password=" + password + ", website=" + website + ", bio=" + bio
				+ ", birthdate=" + birthdate + ", events=" + events + "]";
	}

	
}
