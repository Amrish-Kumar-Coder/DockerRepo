package com.oms.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oms.product.dto.ProductDTO;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private PriceProxy priceProxy;

	@Override
	public ProductDTO getProduct(String productID) {
		ProductDTO productDTO=new ProductDTO();
		productDTO.setProductId(Long.valueOf(productID));
		productDTO.setProductName("iPhone 11");
		productDTO.setPrice(priceProxy.getPriceDTO(productID).getPrice());
		return productDTO;
	}

}