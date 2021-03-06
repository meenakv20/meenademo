package com.meena.service;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.meena.models.Product;

@Service
public class ProductService {
	
	
	private static List<Product> globalProducts = new ArrayList<>(Arrays.asList(
			new Product("Prod1", "Shirt", "EACH", null,null ),
			new Product("Prod2", "Trousers", "EACH", null,null),
			new Product("Prod3", "Tie", "EACH", null,null)
			));
	
	public Product createNewProduct(Product inputProduct) {
		return checkIfProdObjIsEqual(globalProducts, inputProduct);
	}
	
	
	public Product checkIfProdObjIsEqual(List<Product> globalProducts , Product inputProduct) {
		 boolean isProductExists = Stream.of(inputProduct).anyMatch( p -> globalProducts.contains(p));

	        if(isProductExists){
	        	inputProduct.setStatus("Exists");
	        } else{
	        	inputProduct.setStatus("Created");
	           globalProducts.add(inputProduct);
	        }
			return inputProduct;
		
	}

	
	public List<Product>  sortProducts(List<Product> productsList) {
		List<Product> sortedProdIdList = sortProductsByProdId(productsList);
//		sortProductsByDate(sortedProdIdList);
		return sortedProdIdList;
	}
	
	
//	private void sortProductsByDate(List<Product> sortedProdIdList) {
//		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-mm-dd");
//		    Collections.sort(sortedProdIdList, (s1, s2) -> LocalDateTime.parse(s1, formatter).
//		            compareTo(LocalDateTime.parse(s2, formatter)));
//		
//	}


	public List<Product> sortProductsByProdId(List<Product> productsList) {
		
		List<Product> sortedProdIdList = productsList
				.stream().sorted(Comparator.comparing(Product::getProductId).reversed())
				.collect(Collectors.toList());
		return sortedProdIdList;
		
	}



}
