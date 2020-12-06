package com.kaida.dao;

import com.kaida.entity.Bill;

import java.util.List;

public interface BillMapper {
    List<Bill> selectBillByProductName(String productName);

}
