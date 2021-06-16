package com.example.ccvalidation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/creditcardmanage")
public class CreditCardController {
	@Autowired
private CreditCardRepository creditcardRepo;
	
//	@GetMapping(path="/addCreditCardInfo")
//	public @ResponseBody String addCreditCardInfo(@RequestParam String ccNo,@RequestParam String ccName,@RequestParam String ccStatus)
//	{
//		CreditCardInfo ccInfo = new CreditCardInfo();
//		ccInfo.setCcNo("1234-1234-1234-1234");
//		ccInfo.setCcName("James");
//		ccInfo.setCcStatus("Valid");
//		creditcardRepo.save(ccInfo);
//		return "Saved";
//	}
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<CreditCardInfo> getAllCreditCardInfo() {
		// This returns a JSON or XML with the users
		return creditcardRepo.findAll();
	}
	
	@GetMapping(path="/getCCStatus")
	public @ResponseBody String CreditCardStatus(@RequestParam("ccnumber") String ccNumber) {
		// This returns a JSON or XML with the users
		String status = new String();
		List<CreditCardInfo> ccList = creditcardRepo.findByCcnumber(ccNumber);
		if(ccList.size()==1) {
			status=ccList.get(0).getStatus();
		}
		 
		 return status;
	}
}
