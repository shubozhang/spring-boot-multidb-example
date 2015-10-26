package com.boot.multidb.dao;

import com.boot.multidb.model.regular.RegularCustomer;

import java.util.List;

public interface RegularCustomerService {

    List<RegularCustomer> findAll();
}
