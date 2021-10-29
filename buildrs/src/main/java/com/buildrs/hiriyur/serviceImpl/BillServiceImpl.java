package com.buildrs.hiriyur.serviceImpl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.buildrs.hiriyur.entity.Bill;
import com.buildrs.hiriyur.repository.BillRepository;
import com.buildrs.hiriyur.service.BillService;

@Service
public class BillServiceImpl implements BillService{

	@Autowired
	BillRepository billRepo;
	
	@Transactional
	public Bill saveBill(Bill bill) {
		// TODO Auto-generated method stub
		return billRepo.save(bill);
	}

	@Transactional
	public List<Bill> getAllBillByOwnerId(Long ownerId) {
		// TODO Auto-generated method stub
		return billRepo.findByOwnerId(ownerId);
	}

	@Transactional
	public Optional<Bill> getBillById(Long billId) {
		// TODO Auto-generated method stub
		return billRepo.findById(billId);
	}

	@Transactional
	public List<Bill> getAllBillByCustomerId(Long customerId) {
		// TODO Auto-generated method stub
		return billRepo.findByCustomerId(customerId);
	}

}
