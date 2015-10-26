package com.boot.multidb.repository.regular;

import com.boot.multidb.model.regular.RegularCustomer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegularCustomerRepository extends JpaRepository<RegularCustomer, Integer> {
}
