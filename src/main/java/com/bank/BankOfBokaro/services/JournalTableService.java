package com.bank.BankOfBokaro.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.bank.BankOfBokaro.dao.JournalTableDao;
import com.bank.BankOfBokaro.entities.JournalTableEntity;
import com.bank.BankOfBokaro.model.AccountInfoModel;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class JournalTableService {
	
	@Autowired
	JournalTableDao journalTableDao;

	@Autowired
	JournalTableEntity journalTableEntity;
	
	public void saveDataInJournalTable(JournalTableEntity ent) {
		
		journalTableDao.save(ent);
	}
	
	public Optional<JournalTableEntity> getData(int journalNo) {
		
		Optional<JournalTableEntity>	ent=journalTableDao.findById(journalNo);
		
		return ent;
	}
	
	
	
 public void sendDataForJounrnalTable(Object model,String url) throws JsonProcessingException {
    	 
    	 ObjectMapper mapper = new ObjectMapper();
    	 String json=mapper.writeValueAsString(model);
    	 
    	 int jrnlNo=journalTableDao.findGreatestJournalNumber();
    	 
    	 journalTableEntity.setJournalNo(jrnlNo+1);
    	 journalTableEntity.setScreenData(json);
    	 journalTableEntity.setUrl(url);
    	 journalTableEntity.setStatus("pendingForAuthorization");
    	 journalTableDao.save(journalTableEntity);

     }
}
