package com.kaida.service.impl;

import com.kaida.dao.BillMapper;
import com.kaida.dao.UserMapper;
import com.kaida.entity.Bill;
import com.kaida.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("billService")
public class BillServiceImpl implements BillService {
    @Autowired
    private BillMapper billMapper;

    public BillMapper getBillMapper() {
        return billMapper;
    }

    public void setBillMapper(BillMapper billMapper) {
        this.billMapper = billMapper;
    }

    @Override
    public List<Bill> selectBillByProductName(String productName) {
        return billMapper.selectBillByProductName(productName);
    }
}
