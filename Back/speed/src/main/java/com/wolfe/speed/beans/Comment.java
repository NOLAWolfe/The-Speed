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
@Table(name = "COMMENT")
public class Comment implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int commentId;

	@Column
	@NotNull
	private String comment;
	@Column
	@NotNull
	private int flag;
	@Column
	@NotNull
	private LocalDateTime timeCreated;

	@Column
	@NotNull
	private int likes;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "USER_ID")
	@OnDelete(action = OnDeleteAction.CASCADE)
	private User userid;

	public int getCommentId() {
		return commentId;
	}

	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
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

	public User getUserid() {
		return userid;
	}

	public void setUserid(User userid) {
		this.userid = userid;
	}

	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Comment(int commentId, @NotNull String comment, @NotNull int flag, @NotNull LocalDateTime timeCreated,
			@NotNull int likes, User userid) {
		super();
		this.commentId = commentId;
		this.comment = comment;
		this.flag = flag;
		this.timeCreated = timeCreated;
		this.likes = likes;
		this.userid = userid;
	}

	public Comment(@NotNull String comment, @NotNull int flag, @NotNull LocalDateTime timeCreated, @NotNull int likes,
			User userid) {
		super();
		this.comment = comment;
		this.flag = flag;
		this.timeCreated = timeCreated;
		this.likes = likes;
		this.userid = userid;
	}

	
}
