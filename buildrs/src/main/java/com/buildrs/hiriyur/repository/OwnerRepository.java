package com.buildrs.hiriyur.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.buildrs.hiriyur.entity.OwnerDetails;

public interface OwnerRepository extends JpaRepository<OwnerDetails, Long>{

	Optional<OwnerDetails> findByPhoneAndPassword(String phone, String password);

	Optional<OwnerDetails> findByPhone(String phone);

}
