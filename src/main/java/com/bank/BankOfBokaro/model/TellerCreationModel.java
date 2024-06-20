package com.bank.BankOfBokaro.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Id;

@Component
public class TellerCreationModel {

	
	private int tellerId;
	private String pass;
	private int capability;
	private String name;
	
	
	
	public int getTellerId() {
		return tellerId;
	}
	public void setTellerId(int tellerId) {
		this.tellerId = tellerId;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public int getCapability() {
		return capability;
	}
	public void setCapability(int capability) {
		this.capability = capability;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
