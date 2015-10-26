package com.boot.multidb.dao;

import com.boot.multidb.model.silver.SilverCustomer;
import com.boot.multidb.repository.silver.SilverCustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("SilverCustomerService")
public class SilverCustomerServiceImpl implements SilverCustomerService {

    @Autowired
    SilverCustomerRepository silverCustomerRepository;


    @Override
    public List<SilverCustomer> findAll() {
        return silverCustomerRepository.findAll();
    }
}
