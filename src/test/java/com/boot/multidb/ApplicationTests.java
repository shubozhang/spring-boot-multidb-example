package com.boot.multidb;

import com.boot.multidb.dao.GoldCustomerService;
import com.boot.multidb.dao.RegularCustomerService;
import com.boot.multidb.dao.SilverCustomerService;
import com.boot.multidb.model.gold.GoldCustomer;
import com.boot.multidb.model.regular.RegularCustomer;
import com.boot.multidb.model.silver.SilverCustomer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.boot.multidb.Application;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class ApplicationTests extends SpringApplication{

    @Autowired
    GoldCustomerService goldCustomerService;

    @Autowired
    SilverCustomerService silverCustomerService;

    @Autowired
    RegularCustomerService regularCustomerService;

    @Test
     public void testGoldDb() {
        List<GoldCustomer> goldCustomers = goldCustomerService.findAll();
        for(GoldCustomer goldCustomer : goldCustomers) {
            System.out.println(goldCustomer.toString());
        }
        assertNotNull(goldCustomers);
    }


    @Test
    public void testSilverDb() {
        List<SilverCustomer> silverCustomers = silverCustomerService.findAll();
        for(SilverCustomer silverCustomer : silverCustomers) {
            System.out.println(silverCustomer.toString());
        }
        assertNotNull(silverCustomers);
    }


    @Test
    public void testRegularDb() {
        List<RegularCustomer> regularCustomers = regularCustomerService.findAll();
        for(RegularCustomer regularCustomer : regularCustomers) {
            System.out.println(regularCustomer.toString());
        }
        assertNotNull(regularCustomers);
    }
}
