package com.oms.products.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oms.products.dto.PriceDTO;
import com.oms.products.model.Price;
import com.oms.products.repo.PriceRepository;

@Service
public class PriceServiceImpl implements PriceService {
	
	@Autowired
	private PriceRepository priceRepository;

	@Override
	public PriceDTO getPriceDTO(Long id) {
		Price price = priceRepository.findById(id).get();
		PriceDTO priceDTO=new PriceDTO();
		priceDTO.setPrice(price.getPrice());
		return priceDTO;
	}

}
