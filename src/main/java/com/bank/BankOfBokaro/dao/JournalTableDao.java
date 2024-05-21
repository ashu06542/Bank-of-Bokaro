package com.bank.BankOfBokaro.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.bank.BankOfBokaro.entities.JournalTableEntity;

public interface JournalTableDao extends CrudRepository<JournalTableEntity, Integer> {

	
	 @Query("SELECT MAX(journalNo) FROM JournalTableEntity")
	    int findGreatestJournalNumber();
	 
}
