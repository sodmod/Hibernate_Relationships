package com.badmus.Hibernate_Relationships.repositories;

import com.badmus.Hibernate_Relationships.Entity.Customers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomersRepository extends JpaRepository<Customers, Long> {
}
