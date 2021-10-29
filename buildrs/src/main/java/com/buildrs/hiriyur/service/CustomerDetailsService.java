package com.buildrs.hiriyur.service;

import java.util.Optional;

import com.buildrs.hiriyur.entity.CustomerDetails;

public interface CustomerDetailsService {

	Optional<CustomerDetails> getCustomerByPhone(String phone);

	CustomerDetails saveCustomerDetails(CustomerDetails customerDetails);

}
