package com.boot.multidb.dao;

import com.boot.multidb.model.regular.RegularCustomer;
import com.boot.multidb.repository.regular.RegularCustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component("RegularCustomerService")
public class RegularCustomerServiceImpl implements RegularCustomerService {
    @Autowired
    RegularCustomerRepository regularCustomerRepository;

    @Override
    public List<RegularCustomer> findAll() {
        return regularCustomerRepository.findAll();
    }
}
