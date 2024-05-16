package com.bank.BankOfBokaro.controller;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;

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


import com.bank.BankOfBokaro.dao.AccountInfoDao;
import com.bank.BankOfBokaro.dao.DebitCreditDao;
import com.bank.BankOfBokaro.dao.TellerInfoDao;
import com.bank.BankOfBokaro.entities.AccountCreationEntity;
import com.bank.BankOfBokaro.entities.AccountDebitCreditEntity;
import com.bank.BankOfBokaro.entities.TellerInfoEntity;
import com.bank.BankOfBokaro.model.AccountCreationModel;
import com.bank.BankOfBokaro.model.AccountDebitCreditModel;
import com.bank.BankOfBokaro.model.AccountInfoModel;
import com.bank.BankOfBokaro.model.TellerCreationModel;
import com.bank.BankOfBokaro.model.TellerLoginModel;
import com.bank.BankOfBokaro.services.AccountCreationServices;
import com.bank.BankOfBokaro.services.AccountInfoService;
import com.bank.BankOfBokaro.services.DebitCreditService;
import com.bank.BankOfBokaro.services.TellerInfoService;
import com.bank.BankOfBokaro.services.TellerLoginService;

@Controller
public class MainController {

	@Autowired
	AccountInfoDao accountInfoDao;
	
	@Autowired
	TellerInfoDao  tellerInfoDao;
	
	
	@Autowired
	DebitCreditDao debitCreditDao;
	@Autowired
	ModelMapper mapper;

	@Autowired
	TellerInfoService tellerInfoService;
	
	@Autowired
	DebitCreditService debitCreditService;
		
	@Autowired
	AccountCreationServices accountCreationService;

	@Autowired
	AccountInfoService accountInfoService;
	
	@Autowired
	TellerLoginService tellerLoginService;
	
	
	@GetMapping("/accntCreation")
	public String showAccountCreationPage() {

		return "AccountCreation";
	}

	@PostMapping("/process")

	public String onSubmitOfAccntCreation(@ModelAttribute AccountInfoModel accountInfoModel, Model model,
			BindingResult result) {

		accountCreationService.onSubmitOfAccntCreation(accountInfoModel);
 		model.addAttribute("accountNum", accountInfoModel.getAccntNumber());

		return "success";

	}

	@GetMapping("/accountInfo")
	public String showAccountInfo() {
		return "AccountInfo";
	}

	@PostMapping("/enquire")
	public String getAccountInfo(@ModelAttribute AccountInfoModel accountInfoModel, Model model) {

		AccountInfoModel inf = accountInfoService.getAccountInfo(accountInfoModel);
		model.addAttribute("accountInfo", inf);
		return "AccountInfo";
	}

	@GetMapping("/accntNum")
	public ResponseEntity<Long> getAccountNumber() {
		
		
		long accuntNum=accountCreationService.getAccountNum();
		
		return new ResponseEntity<Long>(accuntNum, HttpStatus.OK);
		
	}

	@GetMapping("/debitCredit")
	public String debitCredit() {

		return "AccountDebitCredit";

	}

	@PostMapping("/debitCreditProcess")
	public String debitCreditProcess(@ModelAttribute AccountDebitCreditModel accountDebitCreditModel) {

	     
		debitCreditService.DebitCreditSettlement(accountDebitCreditModel);
		
		return "AccountDebitCredit";

	}

	@GetMapping("/checkBal/{accntNum}")
	public ResponseEntity<Double> getBalance(@PathVariable("accntNum") int accntNum){

           double balance=debitCreditService.getAccountBalance(accntNum);
			
			return new ResponseEntity<Double>(balance, HttpStatus.OK);
		
	}
	
	@GetMapping("/TellerLogin")
	public String viewDashBoard() {
		
		return "TellerLogin";
	}
	
	@PostMapping("/TellerLoginSubmit")
	public String openTellerDashBoard(@ModelAttribute TellerLoginModel tellerLoginModel, Model model) {
		

		TellerInfoEntity tellerInfoEntity=tellerInfoService.getTellerInfo(tellerLoginModel.getTellerId());
		
		if(Objects.nonNull(tellerInfoEntity)) {
			
			model.addAttribute("tellerName", tellerInfoEntity.getName());
			model.addAttribute("tellerId", tellerInfoEntity.getTellerId());
			model.addAttribute("capability", tellerInfoEntity.getCapability());
			return "TellerDashBoard";
			
		}else {
			
			return "TellerLoginSubmit";
		}
		
		
	}
	
	@GetMapping("/createTeller")
	public String createNewTeller() {
		
		return "newTeller";
	}
	
	@PostMapping("/TellerCreation")
	public ResponseEntity<String> TellerCreation(@ModelAttribute TellerCreationModel tellerCreationModel ) {
		
		
		TellerInfoEntity tellerInfoEntity=mapper.map(tellerCreationModel, TellerInfoEntity.class);
		
		TellerInfoEntity tellerInfo=tellerInfoService.getTellerInfo(tellerInfoEntity.getTellerId());
		
		
		
		if(Objects.nonNull(tellerInfo)) {
			return new ResponseEntity<String>("Teller is already present", HttpStatus.OK);
		}
		tellerInfoService.addTeller(tellerInfoEntity);
		return new ResponseEntity<String>("Teller is created Successfully!!", HttpStatus.OK);
	}
}
