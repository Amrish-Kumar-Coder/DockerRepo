package com.oms.products.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.oms.products.dto.PriceDTO;
import com.oms.products.service.PriceService;

@RestController
public class PriceController {
	
	@Autowired
	private PriceService priceService;
	
	@GetMapping("/productPrice/{productID}") 
	public PriceDTO getPriceDTO(@PathVariable("productID") String productID) {
		return priceService.getPriceDTO(Long.valueOf(productID));
		
	}

}
