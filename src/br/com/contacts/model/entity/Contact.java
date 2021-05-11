package br.com.contacts.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
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
@NamedQuery(name = "Contact.findAll", query = "SELECT c FROM Contact c")
@Table(name = "CONTACT")
public class Contact extends Profile implements Serializable {
	
	private static final long serialVersionUID = 9059322199437981474L;
	
	@Column(length = 50)
	private String relation;
	
	@Column(length = 50)
	private String place;
}
