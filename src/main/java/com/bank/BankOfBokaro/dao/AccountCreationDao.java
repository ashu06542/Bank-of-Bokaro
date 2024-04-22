package com.bank.BankOfBokaro.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.bank.BankOfBokaro.entities.AccountCreationEntity;



public interface AccountCreationDao extends CrudRepository<AccountCreationEntity, Integer> {

	 @Query("SELECT MAX(accntNumber) FROM AccountCreationEntity")
	    int findGreatestAccntNumber();
}
