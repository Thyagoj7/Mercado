package com.mercado.mercado.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mercado.mercado.repository.ProductRepository;
import com.mercado.mercado.dto.ProductDTO;
import com.mercado.mercado.mapper.ProductMapper;
import com.mercado.mercado.model.Product;


@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	private Product product = new Product();
	
	private List<Product> products= new ArrayList<>();
	
	private final ProductMapper productMapper = ProductMapper.INSTANCE;
	

	
	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	
	
	
	@Transactional
	public Product save(ProductDTO productDTO) {
		
		//System.out.print(product);
		
		Product productToSave = productMapper.toModel(productDTO);
		
		System.out.print(productToSave);
		
		Product savedProduct = productRepository.save(productToSave);
	 
		return savedProduct;
		
		
	}
	
//	public Product listAll(ProductDTO productDTO) {
//		Product products = (Product) productRepository.findAll();
//		return ((Collection<Product>) products).stream()
//        		.map(productMapper::toDTO)
//        		.collect(Collectors.toList());
//	}
//	
    public List<ProductDTO> listAll() {
    	List<Product> allProduct = productRepository.findAll();
    	//System.out.println(allProduct);
    	List<ProductDTO> productDTOs = allProduct.stream()
        		.map(productMapper::toDTO)
        		.collect(Collectors.toList());
    	
    	//System.out.println(productDTOs);
    	
    	return productDTOs;
    }

}
