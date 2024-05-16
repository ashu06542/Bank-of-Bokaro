package com.bank.BankOfBokaro.services;

import java.sql.Date;
import java.util.Calendar;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.bank.BankOfBokaro.dao.AccountInfoDao;
import com.bank.BankOfBokaro.dao.DebitCreditDao;
import com.bank.BankOfBokaro.entities.AccountCreationEntity;
import com.bank.BankOfBokaro.entities.AccountDebitCreditEntity;
import com.bank.BankOfBokaro.model.AccountInfoModel;

@Service
public class AccountCreationServices {
	@Autowired
	AccountInfoDao accountInfoDao;
	
	@Autowired
	AccountCreationEntity accountCreationEntity;

	@Autowired
	ModelMapper mapper;

	
	
     public String onSubmitOfAccntCreation(AccountInfoModel accountInfoModel) {
    	 
    	 accountCreationEntity = mapper.map(accountInfoModel, AccountCreationEntity.class);
 		int journalNo=accountInfoDao.findMaxJournalNo()+1;
 		accountCreationEntity.setJournalNo(journalNo);
 		accountCreationEntity.setStatus("pendingForAuthorization");
 		
 		 Calendar calendar = Calendar.getInstance();
 	        java.util.Date today = calendar.getTime();
 	        
 	        // Convert to SQL Date
 	        Date sqlDate = new Date(today.getTime());

 		
 	       accountCreationEntity.setDateOfAccountCreation(sqlDate);
 		accountInfoDao.save(accountCreationEntity);
 		
 		return "success";

     }
     
     public long getAccountNum() {
    	 
    	 
 			return accountInfoDao.findGreatestAccntNumber();
 		
 		
    	 
     }
}
