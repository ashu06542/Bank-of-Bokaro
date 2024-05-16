package com.bank.BankOfBokaro.services;

import java.sql.Date;
import java.util.Calendar;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.BankOfBokaro.dao.AccountInfoDao;
import com.bank.BankOfBokaro.dao.DebitCreditDao;
import com.bank.BankOfBokaro.entities.AccountCreationEntity;
import com.bank.BankOfBokaro.entities.AccountDebitCreditEntity;
import com.bank.BankOfBokaro.model.AccountDebitCreditModel;

@Service
public class DebitCreditService {

	@Autowired
	DebitCreditDao debitCreditDao;
	
	@Autowired
	AccountInfoDao accountInfoDao;
	
	@Autowired
	AccountCreationEntity accountCreationEntity;

	
	@Autowired
	AccountDebitCreditEntity ent;

	@Autowired
	ModelMapper mapper;

	public String DebitCreditSettlement(AccountDebitCreditModel accountDebitCreditModel) {

		ent = mapper.map(accountDebitCreditModel, AccountDebitCreditEntity.class);

		int jouralNo = debitCreditDao.findMaxJournalNo() + 1;

		ent.setJournalNo(jouralNo);

		ent.setStatus("pendingForAuthorization");

		Calendar calendar = Calendar.getInstance();
		java.util.Date today = calendar.getTime();

		// Convert to SQL Date
		Date sqlDate = new Date(today.getTime());

		ent.setDateOfDebitCredit(sqlDate);

		 debitCreditDao.save(ent);

		return "success";

	}
	
	public Double getAccountBalance(long accntNum) {
		
		accountCreationEntity = accountInfoDao.findByAccntNumber(accntNum);
		
		return accountCreationEntity.getInitBalance();

		
	}
}
