package com.bank.BankOfBokaro.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.bank.BankOfBokaro.entities.AccountDebitCreditEntity;

public interface DebitCreditDao extends CrudRepository<AccountDebitCreditEntity, Integer>

{
	
	
	 @Query(value = "SELECT MAX(journal_no) FROM (SELECT journal_no  FROM customer_info " +
             "UNION ALL SELECT journal_no FROM debit_credit_info) AS combined_tables", nativeQuery = true)
Integer findMaxJournalNo();

}
