package com.boot.multidb.repository.silver;

import com.boot.multidb.model.silver.SilverCustomer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SilverCustomerRepository extends JpaRepository<SilverCustomer, Integer>{
}
