package com.buildrs.hiriyur.service;

import java.util.Optional;

import com.buildrs.hiriyur.entity.OwnerDetails;

public interface OwnerService {

	OwnerDetails saveOwner(OwnerDetails ownerDetails);

	Optional<OwnerDetails> getOwnerByPhoneAndPassword(String phone, String password);

	Optional<OwnerDetails> getOwnerByPhone(String phone);

}
