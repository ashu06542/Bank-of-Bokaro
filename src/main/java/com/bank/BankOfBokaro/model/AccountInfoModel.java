package com.bank.BankOfBokaro.model;




public class AccountInfoModel{


	
		private String name;
		private String dob;
		private String fathersName;
		private String email;
		private long mobileNo;
		private double initBalance;
		private long accntNumber;
		private long journalNo;
		



		public long getJournalNo() {
			return journalNo;
		}



		public void setJournalNo(long journalNo) {
			this.journalNo = journalNo;
		}



		@Override
		public String toString() {
			return "AccountCreationModel [name=" + name + ", dob=" + dob + ", fathersName=" + fathersName + ", email="
					+ email + ", mobileNo=" + mobileNo + ", initBalance=" + initBalance + ", accntNumber=" + accntNumber
					+ "]";
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

	

