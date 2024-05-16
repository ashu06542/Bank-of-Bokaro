package com.bank.BankOfBokaro.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


public class AccountCreationModel {


		private int id;
		private String name;
		private String dob;
		private String fathersName;
		private String email;
		private long mobileNo;
		private double initBalance;
		private long accntNumber;
		private long journalNo;
		private String dateOfCreation;
		private String status;
		
		
		
		public long getJournalNo() {
			return journalNo;
		}



		public void setJournalNo(long journalNo) {
			this.journalNo = journalNo;
		}



		public String getDateOfCreation() {
			return dateOfCreation;
		}



		public void setDateOfCreation(String dateOfCreation) {
			this.dateOfCreation = dateOfCreation;
		}



		public String getStatus() {
			return status;
		}



		public void setStatus(String status) {
			this.status = status;
		}



		@Override
		public String toString() {
			return "AccountCreationModel [name=" + name + ", dob=" + dob + ", fathersName=" + fathersName + ", email="
					+ email + ", mobileNo=" + mobileNo + ", initBalance=" + initBalance + ", accntNumber=" + accntNumber
					+ "]";
		}
		
		
		
		public int getId() {
			return id;
		}



		public void setId(int id) {
			this.id = id;
		}



		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDob() {
			return dob;
		}
		public void setDob(String dob) {
			this.dob = dob;
		}
		public String getFathersName() {
			return fathersName;
		}
		public void setFathersName(String fathersName) {
			this.fathersName = fathersName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public long getMobileNo() {
			return mobileNo;
		}
		public void setMobileNo(long mobileNo) {
			this.mobileNo = mobileNo;
		}
		public double getInitBalance() {
			return initBalance;
		}
		public void setInitBalance(double initBalance) {
			this.initBalance = initBalance;
		}
		public long getAccntNumber() {
			return accntNumber;
		}
		public void setAccntNumber(long accntNumber) {
			this.accntNumber = accntNumber;
		}
		
		
		
		
	}

	

