package com.oms.products.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oms.products.model.Price;

@Repository
public interface PriceRepository extends JpaRepository<Price , Long>{

}
