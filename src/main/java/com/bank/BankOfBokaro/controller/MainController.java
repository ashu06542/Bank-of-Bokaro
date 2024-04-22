package com.bank.BankOfBokaro.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bank.BankOfBokaro.dao.AccountCreationDao;
import com.bank.BankOfBokaro.entities.AccountCreationEntity;
import com.bank.BankOfBokaro.model.AccountCreationModel;



@Controller
public class MainController {
	
	@Autowired
	AccountCreationDao accntCreation;
	@Autowired
	ModelMapper mapper;

	@GetMapping("/accntCreation")
	public String showAccountCreationPage() {
		
		return "AccountCreation";
	}
	
	@PostMapping("/process")
	public String onSubmitOfAccntCreation(@ModelAttribute AccountCreationModel accountCreationModel, Model model) {

		AccountCreationEntity ent=mapper.map(accountCreationModel,AccountCreationEntity.class);
		accntCreation.save(ent);
		model.addAttribute("accountNum", ent.getAccntNumber());
		return "success";
	}
	
	@GetMapping("/accntNum")
	@ResponseBody
	public ResponseEntity<Integer> getAccountNumber() {
		
		int ace=0;
		try {
			ace=accntCreation.findGreatestAccntNumber();
			return new ResponseEntity<Integer>(ace,HttpStatus.OK);
		}catch(Exception e) {
			
			return new ResponseEntity<Integer>(0,HttpStatus.OK);
		}
		
		 
		
	   
		
		
	}

}
