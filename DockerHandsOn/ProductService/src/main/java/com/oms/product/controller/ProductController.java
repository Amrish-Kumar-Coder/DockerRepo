package com.oms.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.oms.product.dto.ProductDTO;
import com.oms.product.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;
	
	
	@GetMapping("/product/{productID}")
	public ProductDTO getProduct(@PathVariable String productID) {
		ProductDTO productDTO = productService.getProduct(productID);
		return productDTO;
	}
}
