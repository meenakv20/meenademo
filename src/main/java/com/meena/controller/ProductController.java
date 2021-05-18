package com.meena.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.meena.models.Product;
import com.meena.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired(required=true)
	private ProductService prodService;
	
	@RequestMapping(method=RequestMethod.POST , value="/createProducts")
	public Product createProducts(@RequestBody Product product) {
	return	prodService.createNewProduct(product);
	}
	
	@RequestMapping(method=RequestMethod.POST , value="/sortProducts")
	public List<Product> sortProducts(@RequestBody List<Product> productsList) {
	return	prodService.sortProducts(productsList);
	}
	

}
