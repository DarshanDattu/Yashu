package com.buildrs.hiriyur.serviceImpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.buildrs.hiriyur.entity.CustomerAddress;
import com.buildrs.hiriyur.repository.CustomerAddressRepository;
import com.buildrs.hiriyur.service.CustomerAddressService;

@Service
public class CustomerAddressServiceImpl  implements CustomerAddressService{

	@Autowired
	CustomerAddressRepository customerAddressRepo;
	@Transactional
	public CustomerAddress saveCustomerAddress(CustomerAddress customerDetails) {
		// TODO Auto-generated method stub
		return customerAddressRepo.save(customerDetails);
	}

}
