package com.bank.BankOfBokaro.entities;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="journalTable")
@Component
public class JournalTableEntity {

	@Id
	private long journalNo;
	private String screenData;
	private int capability;
	private String url;
	private String status;
	
	
	
	
	
	
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
	
	

	public long getJournalNo() {
		return journalNo;
	}
	public void setJournalNo(long journalNo) {
		this.journalNo = journalNo;
	}
	public int getCapability() {
		return capability;
	}
	public void setCapability(int capability) {
		this.capability = capability;
	}
	public String getScreenData() {
		return screenData;
	}
	public void setScreenData(String screenData) {
		this.screenData = screenData;
	}
	
	
	
}
