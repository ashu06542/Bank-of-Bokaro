package com.bank.BankOfBokaro.entities;

import java.sql.Date;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Component
@Table(name="DebitCreditInfo")
public class AccountDebitCreditEntity {

	@Id
	private long accntNo;

	private double amountDebitCredit;
	
	
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

	
	public Date getDateOfDebitCredit() {
		return DateOfDebitCredit;
	}

	public void setDateOfDebitCredit(Date dateOfDebitCredit) {
		DateOfDebitCredit = dateOfDebitCredit;
	}

	
	
}
