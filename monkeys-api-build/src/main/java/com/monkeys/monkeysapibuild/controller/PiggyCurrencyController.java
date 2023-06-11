package com.monkeys.monkeysapibuild.controller;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monkeys.monkeysapibuild.model.PiggyCurrency;
import com.monkeys.monkeysapibuild.payload.request.PiggyCurrencyRequest;
import com.monkeys.monkeysapibuild.service.PiggyCurrencyService;

@RestController
@RequestMapping("/api/v1/device")
public class PiggyCurrencyController {
	
	@Autowired
	PiggyCurrencyService piggyCurrencyService;

	@PostMapping("/addcurrency")
	public String addCurrency(@RequestBody PiggyCurrencyRequest currencyRequest) {
		
		piggyCurrencyService.addPiggyCurrency(currencyRequest.getCurrencyValue());
		return "currency added successfylly";
	}
	
	@SuppressWarnings("unchecked")
	@GetMapping("/getallpiggycurrency")
	public  String getAllPiggyCurrency(){ //List<PiggyCurrency>
		
		List<PiggyCurrency> getall = piggyCurrencyService.getAll();
		Object[] getarray = getall.toArray();
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("currency_name","inr");
		JSONArray jsonArray = new JSONArray();
		for(int i=0; i< getarray.length; i++) {
			int val = getall.get(i).getPiggyCurrencyValue();
			jsonArray.add(i, val);
		}
		jsonObject.put("values", jsonArray);
		return jsonObject.toJSONString();
	}
	
}
