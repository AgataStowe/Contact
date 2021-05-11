package br.com.contacts.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "USER")
public class User extends Profile {
	
	@Column(length = 20, nullable = false)
	private String login;
	
	@Column(length = 20, nullable = false)
	private String password;

}
