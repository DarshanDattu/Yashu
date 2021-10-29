package com.buildrs.hiriyur.controller;

import java.util.HashMap;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.buildrs.hiriyur.entity.CustomerDetails;
import com.buildrs.hiriyur.entity.OwnerDetails;
import com.buildrs.hiriyur.service.CustomerDetailsService;

@RestController
@RequestMapping(value = "/customerController")
public class CustomerDetailController {
	
	@Autowired
	CustomerDetailsService customerDetailsService;

	
	@RequestMapping(value = "/saveCustomerDetails",method = RequestMethod.POST)
	public HashMap<String, Object> saveCustomerDetails(@RequestBody CustomerDetails customerDetails) {
		HashMap< String, Object> map = new HashMap<String , Object>();
		Optional<CustomerDetails> checkPhoneNumber = customerDetailsService.getCustomerByPhone(customerDetails.getPhone());
		if (checkPhoneNumber.isPresent()) {
			map.put("code", "202");
			map.put("content", "phone number alrady present in our appliaction");
		} else {
			CustomerDetails data = customerDetailsService.saveCustomerDetails(customerDetails);
			if (data!=null) {
				map.put("code", "200");
				map.put("content", data);
			} else {
				map.put("code", "201");
				map.put("content", "no data");
			}
		}
		
		return map;
	}
	
	@RequestMapping(value = "/getCustomerByPhone",method = RequestMethod.GET)
	public HashMap<String , Object> getCustomerByPhone(String phone) {
		HashMap< String, Object> map = new HashMap<String , Object>();
		Optional<CustomerDetails> data = customerDetailsService.getCustomerByPhone(phone);
		if (data.isPresent()) {
			map.put("code", "200");
			map.put("content", data);
		} else {
			map.put("code", "201");
			map.put("content", "no data");
		}
		return map;
	}
}
