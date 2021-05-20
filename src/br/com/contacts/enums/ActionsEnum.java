package br.com.contacts.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ActionsEnum {
	SAVE(1, "Save"), UPDATE(2, "Update"), DELETE(3, "Delete"), LIST(4, "List"), LOGIN(5, "Login"), REGISTER(6, "Register");
		
	private Integer key;
	private String name;
	
	
}
