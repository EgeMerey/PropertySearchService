package com.inm381.app.soacw.domain;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@Entity
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "User", propOrder = {
    "id",
    "cscore",
    "username"
})
public class User {
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private Long Id;
    @XmlElement(required = true)
    private String username;
    @XmlElement(name = "Cscore")
    private Float Cscore;
	public User(Long id, String username, Float cscore) {
		Id = id;
		this.username = username;
		Cscore = cscore;
	}
	public User() {

	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Float getCscore() {
		return Cscore;
	}
	public void setCscore(Float cscore) {
		Cscore = cscore;
	}
	@Override
	public String toString() {
		return "User [Id=" + Id + ", username=" + username + ", Cscore=" + Cscore + "]";
	}
      
}