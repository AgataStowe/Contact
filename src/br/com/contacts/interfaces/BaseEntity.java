package br.com.contacts.interfaces;

import java.util.Date;

public interface BaseEntity {
	
	public long getId();
	public Date getRegisterDate();
	public boolean getFlagOn(); 
}
