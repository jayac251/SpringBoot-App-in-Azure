package com.example.ccvalidation.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditCardRepository extends CrudRepository<CreditCardInfo, Long> {

	List<CreditCardInfo> findByCcnumber(String ccnumber);

}