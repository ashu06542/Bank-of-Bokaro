package com.bank.BankOfBokaro.entities;

import java.sql.Date;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Component
@Table(name="DebitCreditInfo")
public class AccountDebitCreditEntity {

	private long accntNo;

	private double amountDebitCredit;
	
	@Id
	private int journalNo;

	private Date DateOfDebitCredit;
	
	private String status;
	
	private int tellerId;
	
	
	

	public int getTellerId() {
		return tellerId;
	}

	public void setTellerId(int tellerId) {
		this.tellerId = tellerId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	

	public long getAccntNo() {
		return accntNo;
	}

	public void setAccntNo(long accntNo) {
		this.accntNo = accntNo;
	}

	public double getAmountDebitCredit() {
		return amountDebitCredit;
	}

	public void setAmountDebitCredit(double amountDebitCredit) {
		this.amountDebitCredit = amountDebitCredit;
	}

	public int getJournalNo() {
		return journalNo;
	}

	public void setJournalNo(int journalNo) {
		this.journalNo = journalNo;
	}

	public Date getDateOfDebitCredit() {
		return DateOfDebitCredit;
	}

	public void setDateOfDebitCredit(Date dateOfDebitCredit) {
		DateOfDebitCredit = dateOfDebitCredit;
	}

	
	
}
