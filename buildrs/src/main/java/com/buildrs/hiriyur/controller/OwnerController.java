package com.buildrs.hiriyur.controller;

import java.util.HashMap;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.buildrs.hiriyur.entity.Bill;
import com.buildrs.hiriyur.entity.OwnerDetails;
import com.buildrs.hiriyur.service.BillService;
import com.buildrs.hiriyur.service.OwnerService;

@RestController
@RequestMapping(value = "ownerController")
@CrossOrigin("*")
public class OwnerController {

	
	@Autowired
	OwnerService ownerService;
	
	@RequestMapping(value = "/saveOwner",method = RequestMethod.POST)
	public HashMap<String, Object> saveOwner(@RequestBody OwnerDetails ownerDetails) {
		HashMap< String, Object> map = new HashMap<String , Object>();
		Optional<OwnerDetails> checkPhoneNumber = ownerService.getOwnerByPhone(ownerDetails.getPhone());
		if (checkPhoneNumber.isPresent()) {
			map.put("code", "202");
			map.put("content", "phone number alrady present in our appliaction please log in and enjoy you bussiness");
		} else {
			OwnerDetails data = ownerService.saveOwner(ownerDetails);
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
	
	@RequestMapping(value = "/getOwnerByPhoneAndPassword",method = RequestMethod.GET)
	public HashMap<String , Object> getOwnerByPhoneAndPassword(String phone,String password ) {
		HashMap< String, Object> map = new HashMap<String , Object>();
		Optional<OwnerDetails> data = ownerService.getOwnerByPhoneAndPassword(phone,password);
		if (data.isPresent()) {
			map.put("code", "200");
			map.put("content", data);
		} else {
			map.put("code", "201");
			map.put("content", "no data");
		}
		return map;
	}
	
	@RequestMapping(value = "/getOwnerByPhone",method = RequestMethod.GET)
	public HashMap<String , Object> getOwnerByPhoneAndPassword(String phone) {
		HashMap< String, Object> map = new HashMap<String , Object>();
		Optional<OwnerDetails> data = ownerService.getOwnerByPhone(phone);
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
