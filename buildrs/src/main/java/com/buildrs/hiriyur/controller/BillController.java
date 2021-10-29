package com.buildrs.hiriyur.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.buildrs.hiriyur.entity.Bill;
import com.buildrs.hiriyur.service.BillService;

@RestController
@RequestMapping(value = "billController")
public class BillController {

	@Autowired
	BillService billSerive;
	
	@RequestMapping(value = "/saveBill",method = RequestMethod.POST)
	public HashMap<String, Object> saveBill(@RequestBody Bill bill) {
		HashMap< String, Object> map = new HashMap<String , Object>();
		Bill data = billSerive.saveBill(bill);
		if (data!=null) {
			map.put("code", "200");
			map.put("content", data);
		} else {
			map.put("code", "201");
			map.put("content", "no data");
		}
		return map;
	}
	
	@RequestMapping(value = "/getAllBillByOwnerId",method = RequestMethod.GET)
	public HashMap<String , Object> getAllBillByOwnerId(Long ownerId) {
		HashMap< String, Object> map = new HashMap<String , Object>();
		List<Bill> data = billSerive.getAllBillByOwnerId(ownerId);
		if (!data.isEmpty()) {
			map.put("code", "200");
			map.put("content", data);
		} else {
			map.put("code", "201");
			map.put("content", "no data");
		}
		return map;
	}
	
	@RequestMapping(value = "/getBillById",method = RequestMethod.GET)
	public HashMap<String , Object> getBillById(Long billId) {
		HashMap< String, Object> map = new HashMap<String , Object>();
		Optional<Bill> data = billSerive.getBillById(billId);
		if (data.isPresent()) {
			map.put("code", "200");
			map.put("content", data);
		} else {
			map.put("code", "201");
			map.put("content", "no data");
		}
		return map;
	}
	
	@RequestMapping(value = "/getAllBillByCustomerId",method = RequestMethod.GET)
	public HashMap<String , Object> getAllBillByCustomerId(Long customerId) {
		HashMap< String, Object> map = new HashMap<String , Object>();
		List<Bill> data = billSerive.getAllBillByCustomerId(customerId);
		if (!data.isEmpty()) {
			map.put("code", "200");
			map.put("content", data);
		} else {
			map.put("code", "201");
			map.put("content", "no data");
		}
		return map;
	}
}
