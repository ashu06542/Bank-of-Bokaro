package com.bank.BankOfBokaro.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.BankOfBokaro.dao.TellerInfoDao;
import com.bank.BankOfBokaro.entities.TellerInfoEntity;
import com.bank.BankOfBokaro.model.TellerCreationModel;

@Service
public class TellerCreationService extends JournalTableService {

	@Autowired
	TellerInfoDao tellerInfoDao;
	
	@Autowired
	TellerInfoEntity tellerInfoEntity;

	
	
	
}
