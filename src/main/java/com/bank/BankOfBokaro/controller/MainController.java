package com.bank.BankOfBokaro.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bank.BankOfBokaro.dao.AccountCreationDao;
import com.bank.BankOfBokaro.entities.AccountCreationEntity;
import com.bank.BankOfBokaro.model.AccountCreationModel;
import com.bank.BankOfBokaro.model.AccountDebitCredit;
import com.bank.BankOfBokaro.model.AccountInfoModel;

@Controller
public class MainController {

	@Autowired
	AccountCreationDao accountInfoDao;
	@Autowired
	ModelMapper mapper;

	@GetMapping("/accntCreation")
	public String showAccountCreationPage() {

		return "AccountCreation";
	}

	@PostMapping("/process")

	public String onSubmitOfAccntCreation(@ModelAttribute AccountInfoModel accountInfoModel, Model model,
			BindingResult result) {

		AccountCreationEntity ent = mapper.map(accountInfoModel, AccountCreationEntity.class);
		accountInfoDao.save(ent);
		model.addAttribute("accountNum", ent.getAccntNumber());

		return "success";

	}

	@GetMapping("/accountInfo")
	public String showAccountInfo() {
		return "AccountInfo";
	}

	@PostMapping("/enquire")
	public String getAccountInfo(@ModelAttribute AccountInfoModel accountInfoModel, Model model) {
		AccountCreationEntity accountInfoDaoObj = accountInfoDao.findByAccntNumber(accountInfoModel.getAccntNumber());

		AccountInfoModel inf = mapper.map(accountInfoDaoObj, AccountInfoModel.class);

		model.addAttribute("accountInfo", inf);
		return "AccountInfo";
	}

	@GetMapping("/accntNum")
	public ResponseEntity<Integer> getAccountNumber() {

		int ace = 0;
		try {
			ace = accountInfoDao.findGreatestAccntNumber();
			return new ResponseEntity<Integer>(ace, HttpStatus.OK);
		} catch (Exception e) {

			return new ResponseEntity<Integer>(0, HttpStatus.OK);
		}
	}

	@GetMapping("/debitCredit")
	public String debitCredit() {

		return "AccountDebitCredit";

	}

	@PostMapping("/debitCreditProcess")
	public String debitCreditProcess(@ModelAttribute AccountDebitCredit accountDebitCredit) {

		double debitCreditAmt = Double.valueOf(accountDebitCredit.getAmountDebitCredit());
		AccountCreationEntity accountInfoDaoObj = accountInfoDao.findByAccntNumber(accountDebitCredit.getAccntNo());

		double intialBalance = accountInfoDaoObj.getInitBalance();

		double finalAmount = intialBalance + debitCreditAmt;

		accountInfoDaoObj.setInitBalance(finalAmount);
		accountInfoDao.save(accountInfoDaoObj);

		return "AccountDebitCredit";

	}

	@GetMapping("/checkBal/{accntNum}")
	public ResponseEntity<Double> getBalance(@PathVariable("accntNum") int accntNum){

		AccountCreationEntity accountInfoDaoObj = accountInfoDao.findByAccntNumber(accntNum);

		try {
			
			return new ResponseEntity<Double>(accountInfoDaoObj.getInitBalance(), HttpStatus.OK);
		} catch (Exception e) {

			return new ResponseEntity<Double>(0.00, HttpStatus.OK);
		}
	}

}
