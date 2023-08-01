package com.cgr.forex.data;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {

	ExchangeValue findByDeAndTo(String from, String to);
	
}
