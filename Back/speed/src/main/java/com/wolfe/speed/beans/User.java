package com.wolfe.speed.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "USERS")
public class User implements Serializable {

		/**
	 * 
	 */
	private static final long serialVersionUID = 2028103581041053472L;
		@Id
		@Column(name = "USER_ID")
		@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "userSequence")
		@SequenceGenerator(allocationSize = 1, name = "userSequence", sequenceName = "SQ_USER_PK")
		private int userid;
		@Column(name="FIRSTNAME")
		private String firstname;
		@Column(name = "LASTNAME")
		private String lastname;
		@Column(name = "USERNAME")
		private String username;
		@Column(name="EMAIL")
		private String email;
		@Column(name="PASSWORD")
		private String password;
		
		
		
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		public User(String firstname, String lastname, String username, String email, String password) {
			super();
			this.firstname = firstname;
			this.lastname = lastname;
			this.username = username;
			this.email = email;
			this.password = password;
		}


		public User(int userid, String firstname, String lastname, String username, String email, String password) {
			super();
			this.userid = userid;
			this.firstname = firstname;
			this.lastname = lastname;
			this.username = username;
			this.email = email;
			this.password = password;
		}
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
		@Override
		public String toString() {
			return "User [userid=" + userid + ", firstname=" + firstname + ", lastname=" + lastname + ", username="
					+ username + ", email=" + email + ", password=" + password + "]";
		}
		
		
		
	
}
