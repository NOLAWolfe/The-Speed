package com.wolfe.speed.beans;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name ="POST")
public class Post implements Serializable {


	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "POSTID")
	private int postId;
	
	@Column(name = "CAPTION")
	@NotNull
	private String caption;

	@Column(name = "FLAG")
	@NotNull
	private int flag;

	@Column(name = "LIKES", columnDefinition = "int default 0")
	@NotNull
	private int likes;

	@Column(name = "TIMECREATED")	
	@NotNull
	private LocalDateTime timeCreated;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "USERID")
	@OnDelete(action = OnDeleteAction.CASCADE)
	private User userId;

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public LocalDateTime getTimeCreated() {
		return timeCreated;
	}

	public void setTimeCreated(LocalDateTime timeCreated) {
		this.timeCreated = timeCreated;
	}

	public User getuserId() {
		return userId;
	}

	public void setuserId(User userId) {
		this.userId = userId;
	}

	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Post(int postId, @NotNull String caption, @NotNull int flag, @NotNull int likes,
			@NotNull LocalDateTime timeCreated, User userId) {
		super();
		this.postId = postId;
		this.caption = caption;
		this.flag = flag;
		this.likes = likes;
		this.timeCreated = timeCreated;
		this.userId = userId;
	}

	public Post(@NotNull String caption, @NotNull int flag, @NotNull int likes, @NotNull LocalDateTime timeCreated,
			User userId) {
		super();
		this.caption = caption;
		this.flag = flag;
		this.likes = likes;
		this.timeCreated = timeCreated;
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Post [postId=" + postId + ", caption=" + caption + ", flag=" + flag + ", likes=" + likes
				+ ", timeCreated=" + timeCreated + ", userId=" + userId + "]";
	}
	
	
	
}
