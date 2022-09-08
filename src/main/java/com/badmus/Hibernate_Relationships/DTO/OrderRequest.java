package com.badmus.Hibernate_Relationships.DTO;

import com.badmus.Hibernate_Relationships.Entity.Customers;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderRequest {

//    @Autowired
    private Customers customers;
}
