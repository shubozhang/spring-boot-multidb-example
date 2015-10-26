package com.boot.multidb.dao;

import com.boot.multidb.model.silver.SilverCustomer;

import java.util.List;

public interface SilverCustomerService {

    List<SilverCustomer> findAll();
}
