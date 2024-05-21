package com.bank.BankOfBokaro.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.bank.BankOfBokaro.entities.AccountCreationEntity;



public interface AccountInfoDao extends CrudRepository<AccountCreationEntity, Integer> {

	 @Query("SELECT MAX(accntNumber) FROM AccountCreationEntity")
	    int findGreatestAccntNumber();
	 
	public AccountCreationEntity findByAccntNumber(long accntNum);
	

}
