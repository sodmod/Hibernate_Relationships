package com.badmus.Hibernate_Relationships.repositories;

import com.badmus.Hibernate_Relationships.Entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Products, Long> {
}
