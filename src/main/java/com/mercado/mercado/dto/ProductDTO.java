package com.mercado.mercado.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
	
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
