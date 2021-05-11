package br.com.contacts.model.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public abstract class Person{
	
	@Id
	private Long id;
	
	@Column(length = 100, nullable = false)
	private String fullName;

	private LocalDateTime registerDate;
}
