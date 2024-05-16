package com.bank.BankOfBokaro.dao;

import org.springframework.data.repository.CrudRepository;

import com.bank.BankOfBokaro.entities.TellerInfoEntity;

public interface TellerInfoDao extends CrudRepository<TellerInfoEntity, Integer> {

	
	public TellerInfoEntity findByTellerId(int tellerId);
}
