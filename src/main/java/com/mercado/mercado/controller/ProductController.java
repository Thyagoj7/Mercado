package com.mercado.mercado.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.mercado.mercado.dto.ProductDTO;
import com.mercado.mercado.model.Product;
import com.mercado.mercado.repository.ProductRepository;
import com.mercado.mercado.service.ProductService;

import javax.faces.view.ViewScoped;
//import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ViewScoped
@Controller
public class ProductController implements Serializable{

	
	private Product product = new Product();
	
	private List<Product> products= new ArrayList<>();
	
	private ProductDTO productDTO = new ProductDTO();
	
	private List<ProductDTO> productsDTO= new ArrayList<>();
	
	@Autowired
	private ProductService productService;
	
	//private ProductService productService = new ProductService();
	
	@Autowired
	private ProductRepository productRepository;
	
	
//--Métodos direto usando modelo ------------------------------------------
    public void fetchAll() {
        //
    	products = productRepository.findAll();
    }
    
	public void save() { 
        //
        productRepository.save(product);
        
        product = new Product();
        products = productRepository.findAll();
    }
	
	  public void edit(Product product) {
	        //
	        this.product = product;
	    }
	
	public void refresh() { 
        //
		product = new Product();
    }
	
	//--Metodos com DTO --------------------------
	
	public void saveA() {
		
		productService.save(this.productDTO);
		
		
		}
	
	public void fetchAllA() {
		productsDTO = productService.listAll();
	}
	
	public List<ProductDTO> fetchAllA2(){
		
		//ProductService productService = new ProductService();
		
		return productService.listAll();
	}
	//--get e set do modelo -------------------------------------
	
	public Product getProduct() {
        //
        return product;
    }

    public void setProduct(Product product) {
        //
        this.product = product;
    }
    
    public List<Product> getProducts() {
        //
        return products;
    }

    public void setProducts(List<Product> pruducts) {
        //
        this.products = products;
    }
    
    //---DTO ---------------------
    
    public ProductDTO getProductDTO() {
        //
        return productDTO;
    }

    public void setProductDTO(ProductDTO productDTO) {
        //
        this.productDTO = productDTO;
    }
    
    public List<ProductDTO> getProductsDTO() {
        //
        return productsDTO;
    }

    public void setProductsDTO(List<ProductDTO> pruductsDTO) {
        //
        this.productsDTO = productsDTO;
    }
}
