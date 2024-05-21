package com.bank.BankOfBokaro.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.bank.BankOfBokaro.entities.AccountDebitCreditEntity;

public interface DebitCreditDao extends CrudRepository<AccountDebitCreditEntity, Integer>

{
	
	
	
}
