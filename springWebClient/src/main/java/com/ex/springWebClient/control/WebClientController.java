package com.ex.springWebClient.control;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.ex.springWebClient.Model.Product;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class WebClientController {
	private WebClient webclient;
	
	public WebClientController()
	{
		this.webclient=WebClient.create("http://localhost:9095");
	}
	
	//synchronous way using block()
	@GetMapping("/allproducts")
	public String synallproducts()
	{
		return webclient.get().uri("getallProducts").retrieve().bodyToMono(String.class).block();
	}
	//Asynchronous way using  Mono for single data return)
	@GetMapping("/allproductsNon")
	public Mono<String> asynallproducts()
	{
		return webclient.get().uri("getallProducts").retrieve().bodyToMono(String.class);
	}
	//Asynchronous way using  Flux for Multi data return)
	@GetMapping("/Name")
	public Flux<String> asynallproductsFlux()
	{
		return webclient.get().uri("getName").retrieve().bodyToFlux(String.class);
	}
	
	//-----Using ClassObject 
	@PostMapping("/createproduct")
	public Mono<Product> createproduct(@RequestBody Product pr)
	{
		
  	return webclient.post().uri("createproduct").body(Mono.just(pr),Product.class).retrieve().bodyToMono(Product.class);
	}
	@GetMapping("/getlistproducts")
	public Flux<Product> getlistproducts()
	{
		return webclient.get().uri("getlistproducts").retrieve().bodyToFlux(Product.class);
	}
}
