package com.oms.product.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.oms.product.dto.PriceDTO;

@FeignClient(name = "price-service", url = "${PRICE_SERVICE_HOST:http://localhost}:8000")
public interface PriceProxy {
	
	@GetMapping("/productPrice/{productID}") 
	public PriceDTO getPriceDTO(@PathVariable("productID") String productID);

}
