package com.buildrs.hiriyur.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.buildrs.hiriyur.entity.Bill;

public interface BillRepository extends JpaRepository<Bill, Long> {

	List<Bill> findByOwnerId(Long ownerId);

	List<Bill> findByCustomerId(Long customerId);

}
