package com.mercado.mercado.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.mercado.mercado.dto.ProductDTO;
import com.mercado.mercado.model.Product;

@Mapper
public interface ProductMapper {
	
	ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);
	
	Product toModel(ProductDTO productDTO);
	
	ProductDTO toDTO(Product product);
	
	
}
