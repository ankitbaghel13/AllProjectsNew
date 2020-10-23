package org.netscape.bean;

import java.util.Map;

public class Bank {
	
	private String name;
	private Map<String, Account> accountMap;
	
	public Bank(){
		
	}
	
	public Bank(String name, Map<String, Account> accountMap) {
		super();
		this.name = name;
		this.accountMap = accountMap;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, Account> getAccountMap() {
		return accountMap;
	}

	public void setAccountMap(Map<String, Account> accountMap) {
		this.accountMap = accountMap;
	}
	
}
