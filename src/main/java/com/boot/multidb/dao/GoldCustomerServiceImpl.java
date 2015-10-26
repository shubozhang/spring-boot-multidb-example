package com.boot.multidb.dao;

import com.boot.multidb.model.gold.GoldCustomer;
import com.boot.multidb.repository.gold.GoldCustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("GoldCustomerService")
public class GoldCustomerServiceImpl implements GoldCustomerService {

    @Autowired
    GoldCustomerRepository goldCustomerRepository;

    @Override
    public List<GoldCustomer> findAll() {
        return goldCustomerRepository.findAll();
    }
}
