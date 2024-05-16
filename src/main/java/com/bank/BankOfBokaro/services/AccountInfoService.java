package com.bank.BankOfBokaro.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.BankOfBokaro.dao.AccountInfoDao;
import com.bank.BankOfBokaro.entities.AccountCreationEntity;
import com.bank.BankOfBokaro.model.AccountInfoModel;

@Service
public class AccountInfoService {
	
	@Autowired
	AccountInfoDao accountInfoDao;
	
	@Autowired
	AccountCreationEntity accountCreationEntity;

	@Autowired
	ModelMapper mapper;

	
	public AccountInfoModel getAccountInfo(AccountInfoModel accountInfoModel) {
		
		accountCreationEntity = accountInfoDao.findByAccntNumber(accountInfoModel.getAccntNumber());

		AccountInfoModel updatedModel= mapper.map(accountCreationEntity, AccountInfoModel.class);

		return updatedModel;
	}

}
