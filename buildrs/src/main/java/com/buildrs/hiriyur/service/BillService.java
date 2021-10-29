package com.buildrs.hiriyur.service;

import java.util.List;
import java.util.Optional;

import com.buildrs.hiriyur.entity.Bill;

public interface BillService {

	Bill saveBill(Bill bill);

	List<Bill> getAllBillByOwnerId(Long ownerId);

	Optional<Bill> getBillById(Long billId);

	List<Bill> getAllBillByCustomerId(Long customerId);

}
