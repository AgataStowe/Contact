package br.com.contacts.model.entity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public abstract class  Profile extends Person {
	
	@Column(length = 20)
	private String alias;
	
	@Column(length = 20)
	private Integer phoneNumber;
	
	@Column(length = 50)
	private String email;

}
