package com.badmus.Hibernate_Relationships.Controller;

import com.badmus.Hibernate_Relationships.DTO.OrderRequest;
import com.badmus.Hibernate_Relationships.Entity.Customers;
import com.badmus.Hibernate_Relationships.repositories.CustomersRepository;
import com.badmus.Hibernate_Relationships.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "order")
@AllArgsConstructor
public class OrderController {

    @Autowired
    private CustomersRepository customersRepository;

    @Autowired
    private ProductRepository productRepository;

    @PostMapping(path = "placeOrder")
    public Customers placeOrder (@RequestBody OrderRequest orderRequest){
        return customersRepository.save(orderRequest.getCustomers());
    }

    @GetMapping(path = "findAllOrders")
    public List<Customers> findAllOrders(){
        return customersRepository.findAll();
    }
}
