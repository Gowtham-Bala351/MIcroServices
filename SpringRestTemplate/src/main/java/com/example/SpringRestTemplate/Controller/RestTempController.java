package com.example.SpringRestTemplate.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.SpringRestTemplate.Model.Product;

@RestController
public class RestTempController 
{
	@Lazy
	@Autowired
	private RestTemplate restemp;
	
	@GetMapping("/getProd")
	public String getallProd()
	{
		return restemp.getForObject("http://localhost:9095/getallProducts", String.class);
	}
	
	@GetMapping("/getprodName")
	public String getProdName()
	{
		return restemp.getForObject("http://localhost:9095/getName", String.class);
	}
	//--using class object
	@PostMapping("/postproduct")
	public Product postproduct(@RequestBody Product prod)
	{
		return restemp.postForObject("http://localhost:9095/createproduct",prod, Product.class);
		
	}
	
	@GetMapping("/getlistOfproduct")
	public List<Product> getprods()
	{
		return  restemp.getForObject("http://localhost:9095/getlistproducts", ArrayList.class);
	}
	
	@Bean
	private RestTemplate restTemplate()
	{
		return new RestTemplate();
	}
}
