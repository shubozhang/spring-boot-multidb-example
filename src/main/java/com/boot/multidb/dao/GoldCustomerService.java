package com.boot.multidb.dao;

import com.boot.multidb.model.gold.GoldCustomer;

import java.util.List;

public interface GoldCustomerService {

    List<GoldCustomer> findAll();
}
