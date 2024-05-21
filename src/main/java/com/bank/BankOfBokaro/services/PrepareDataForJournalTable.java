package com.bank.BankOfBokaro.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.bank.BankOfBokaro.dao.JournalTableDao;
import com.bank.BankOfBokaro.entities.JournalTableEntity;

@Service
@Component
public class PrepareDataForJournalTable {
	
	@Autowired
	JournalTableDao journalTableDao;

	public void saveDataInJournalTable(JournalTableEntity ent) {
		
		journalTableDao.save(ent);
	}
}
