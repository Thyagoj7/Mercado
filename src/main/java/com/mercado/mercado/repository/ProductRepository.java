package com.mercado.mercado.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.mercado.mercado.model.Product;


@Repository
@Component
public interface ProductRepository  extends JpaRepository<Product, Long>{

}
