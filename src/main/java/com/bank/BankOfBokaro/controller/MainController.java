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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bank.BankOfBokaro.dao.AccountCreationDao;
import com.bank.BankOfBokaro.entities.AccountCreationEntity;
import com.bank.BankOfBokaro.model.AccountCreationModel;
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
	
	public String onSubmitOfAccntCreation(@ModelAttribute AccountInfoModel accountInfoModel, Model model,BindingResult result) {

		AccountCreationEntity ent=mapper.map(accountInfoModel,AccountCreationEntity.class);
	    List<AccountInfoModel>  accountInformation=accountInfoDao.findByAccntNumber(accountInfoModel.getAccntNumber());
	    
	    if(accountInformation.size()>0) {
	    	return "AccountCreation";
	    }
	   	    
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
	    List<AccountInfoModel>  accountInfo=accountInfoDao.findByAccntNumber(accountInfoModel.getAccntNumber());
       
	    AccountInfoModel inf= mapper.map(accountInfo.get(0),AccountInfoModel.class);
	    
	    model.addAttribute("accountInfo",inf);
	    return "AccountInfo";
	}
	
	@GetMapping("/accntNum")
	public ResponseEntity<Integer> getAccountNumber() {
		
		int ace=0;
		try {
			ace=accountInfoDao.findGreatestAccntNumber();
			return new ResponseEntity<Integer>(ace,HttpStatus.OK);
		}catch(Exception e) {
			
			return new ResponseEntity<Integer>(0,HttpStatus.OK);
		}
		
		 
		
	   
		
		
	}

}
