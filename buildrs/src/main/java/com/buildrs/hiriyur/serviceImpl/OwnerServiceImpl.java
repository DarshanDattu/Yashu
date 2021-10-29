package com.buildrs.hiriyur.serviceImpl;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.buildrs.hiriyur.entity.OwnerDetails;
import com.buildrs.hiriyur.repository.OwnerRepository;
import com.buildrs.hiriyur.service.OwnerService;

@Service
public class OwnerServiceImpl implements OwnerService{

	@Autowired
	OwnerRepository ownerRepo;
	
	@Transactional
	public OwnerDetails saveOwner(OwnerDetails ownerDetails) {
		// TODO Auto-generated method stub
		return ownerRepo.save(ownerDetails);
	}

	@Transactional
	public Optional<OwnerDetails> getOwnerByPhoneAndPassword(String phone, String password) {
		// TODO Auto-generated method stub
		return ownerRepo.findByPhoneAndPassword(phone,password);
	}

	@Transactional
	public Optional<OwnerDetails> getOwnerByPhone(String phone) {
		// TODO Auto-generated method stub
		return ownerRepo.findByPhone(phone);
	}

}
