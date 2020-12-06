package com.kaida.service;

import com.kaida.entity.Bill;

import java.util.List;

public interface BillService {
    List<Bill> selectBillByProductName(String productName);
}
