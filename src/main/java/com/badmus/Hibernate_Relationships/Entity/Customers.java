package com.badmus.Hibernate_Relationships.Entity;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customers {

    @Id
    @GeneratedValue
    private Long cid;
    private String name;
    private String email;
    private String gender;
    @OneToMany(targetEntity = Products.class, cascade = CascadeType.ALL)
    private List<Products> products;
}
