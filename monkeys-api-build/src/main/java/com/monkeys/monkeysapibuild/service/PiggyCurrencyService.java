package com.monkeys.monkeysapibuild.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monkeys.monkeysapibuild.model.PiggyCurrency;
import com.monkeys.monkeysapibuild.repository.PiggyCurrecyRepository;

@Service
public class PiggyCurrencyService {
	
	@Autowired
	PiggyCurrecyRepository piggyCurrecyRepository;
	
	public void addPiggyCurrency(Integer currencyValue) {
		
		PiggyCurrency currency = new PiggyCurrency();
		currency.setPiggyCurrencyValue(currencyValue);
		currency.setIsActive(true);
		piggyCurrecyRepository.save(currency);
		
	}
	
	public List<PiggyCurrency> getAll(){

		return piggyCurrecyRepository.findAll();
	}

}
