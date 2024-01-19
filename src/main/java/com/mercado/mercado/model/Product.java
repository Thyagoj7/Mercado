package com.mercado.mercado.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Product {
	
	@Id
	@GeneratedValue
	private Long id;

    private String name;
    private String description;
    private String category;
    private double price;
    private Long amount;
    private String supplier; //fornecedor
    private String lot_number;
    private Date validity;

}
