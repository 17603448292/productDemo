package com.kaida.test;

import com.kaida.entity.Bill;
import com.kaida.service.BillService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class BillTest {
    private Logger logger =Logger.getLogger(BillTest.class);
    @Test
    public void selectBill(){
       ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis-config.xml");
        BillService billService = (BillService) context.getBean("billService");
        List<Bill> bills = billService.selectBillByProductName("大");
        bills.stream().forEach(bill -> logger.debug(bill));
    }
}
