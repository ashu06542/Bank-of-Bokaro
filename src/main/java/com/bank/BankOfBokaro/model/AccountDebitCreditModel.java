package com.bank.BankOfBokaro.model;

public class AccountDebitCreditModel {
 
	private int accntNo;

	private double amountDebitCredit;
	
	private int journalNo;

	private String DateOfDebitCredit;
	
	private String status;
	
	
	
	
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDateOfDebitCredit() {
		return DateOfDebitCredit;
	}
	public void setDateOfDebitCredit(String dateOfDebitCredit) {
		DateOfDebitCredit = dateOfDebitCredit;
	}
	public int getJournalNo() {
		return journalNo;
	}
	public void setJournalNo(int journalNo) {
		this.journalNo = journalNo;
	}
	public double getAmountDebitCredit() {
		return amountDebitCredit;
	}
	public void setAmountDebitCredit(double amountDebitCredit) {
		this.amountDebitCredit = amountDebitCredit;
	}

	public int getAccntNo() {
		return accntNo;
	}
	public void setAccntNo(int accntNo) {
		this.accntNo = accntNo;
	}
	
	
}
