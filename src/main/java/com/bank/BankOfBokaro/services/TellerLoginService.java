package com.bank.BankOfBokaro.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.BankOfBokaro.dao.TellerInfoDao;
import com.bank.BankOfBokaro.entities.TellerInfoEntity;

@Service
public class TellerLoginService {

	@Autowired
	TellerInfoDao tellerInfoDao;
	
	@Autowired
	TellerInfoEntity tellerInfoEntity;
	
	
public TellerInfoEntity getTellerInfo(int tellerId) {
		
		tellerInfoEntity=tellerInfoDao.findByTellerId(tellerId);
		
		return tellerInfoEntity;

	}
}
