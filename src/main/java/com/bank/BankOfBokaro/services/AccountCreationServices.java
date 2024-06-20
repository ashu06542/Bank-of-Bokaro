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
import com.bank.BankOfBokaro.dao.JournalTableDao;
import com.bank.BankOfBokaro.entities.AccountCreationEntity;
import com.bank.BankOfBokaro.entities.AccountDebitCreditEntity;
import com.bank.BankOfBokaro.entities.JournalTableEntity;
import com.bank.BankOfBokaro.model.AccountCreationModel;
import com.bank.BankOfBokaro.model.AccountInfoModel;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper; 


@Service
public class AccountCreationServices extends JournalTableService {
	@Autowired
	AccountInfoDao accountInfoDao;
	
	@Autowired
	AccountCreationEntity accountCreationEntity;

	@Autowired
	ModelMapper mapper;

	@Autowired
	JournalTableEntity journalTableEntity;
	
	@Autowired
	JournalTableService journalTableService;
	
	@Autowired
	JournalTableDao journalTableDao;
	
     public String onSubmitOfAccntCreation(AccountInfoModel accountInfoModel) {
    	 
    	 accountCreationEntity = mapper.map(accountInfoModel, AccountCreationEntity.class);
 		
 		accountCreationEntity.setStatus("pendingForAuthorization");
 		
 		
 		accountInfoDao.save(accountCreationEntity);
 		
 		return "success";

     }
     
     public long getAccountNum() {
    	 
    	 int accnt=accountInfoDao.findGreatestAccntNumber();
 			return accnt;
 		
 		
    	 
     }
     
   
}
