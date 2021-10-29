package com.buildrs.hiriyur.serviceImpl;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.buildrs.hiriyur.entity.CustomerDetails;
import com.buildrs.hiriyur.repository.CustomerDetailsRepository;
import com.buildrs.hiriyur.service.CustomerDetailsService;

@Service
public class CustomerDetailsServiceImpl implements CustomerDetailsService{

	@Autowired
	CustomerDetailsRepository cutomerRepo;
	@Transactional
	public Optional<CustomerDetails> getCustomerByPhone(String phone) {
		// TODO Auto-generated method stub
		return cutomerRepo.findByPhone(phone);
	}

	@Transactional
	public CustomerDetails saveCustomerDetails(CustomerDetails customerDetails) {
		// TODO Auto-generated method stub
		return cutomerRepo.save(customerDetails);
	}

}
