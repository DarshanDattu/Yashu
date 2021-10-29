package com.buildrs.hiriyur.controller;

import java.util.HashMap;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.buildrs.hiriyur.entity.CustomerAddress;
import com.buildrs.hiriyur.entity.CustomerDetails;
import com.buildrs.hiriyur.service.CustomerAddressService;
import com.buildrs.hiriyur.service.CustomerDetailsService;

@RestController
@RequestMapping(value = "/customerAddressController")
public class CustomerAddressController {

	
	@Autowired
	CustomerAddressService customerAddressService;

	
	@RequestMapping(value = "/saveCustomerAddress",method = RequestMethod.POST)
	public HashMap<String, Object> saveCustomerAddress(@RequestBody CustomerAddress customerDetails) {
		HashMap< String, Object> map = new HashMap<String , Object>();
		
		CustomerAddress data = customerAddressService.saveCustomerAddress(customerDetails);
			if (data!=null) {
				map.put("code", "200");
				map.put("content", data);
			} else {
				map.put("code", "201");
				map.put("content", "no data");
			}
		
		
		return map;
	}
	
	
}
