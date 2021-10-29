package com.buildrs.hiriyur.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.buildrs.hiriyur.entity.CustomerDetails;

public interface CustomerDetailsRepository extends JpaRepository<CustomerDetails, Long>{

	Optional<CustomerDetails> findByPhone(String phone);

}
