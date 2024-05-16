package com.bank.BankOfBokaro.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.bank.BankOfBokaro.entities.AccountCreationEntity;



public interface AccountInfoDao extends CrudRepository<AccountCreationEntity, Integer> {

	 @Query("SELECT MAX(accntNumber) FROM AccountCreationEntity")
	    int findGreatestAccntNumber();
	 
	public AccountCreationEntity findByAccntNumber(long accntNum);
	
	
	 @Query(value = "SELECT MAX(journal_no) FROM (SELECT journal_no  FROM customer_info " +
             "UNION ALL SELECT journal_no FROM debit_credit_info) AS combined_tables", nativeQuery = true)
Integer findMaxJournalNo();
}
