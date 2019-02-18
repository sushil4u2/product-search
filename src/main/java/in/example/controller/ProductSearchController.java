package in.example.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.example.model.CreateProductRequest;
import in.example.search.services.ProductSearchService;

@RestController
public class ProductSearchController {
	
	@Autowired
	ProductSearchService productSearchService;
	
	@GetMapping("/ping")
	public ResponseEntity<String> ping(){
		return new ResponseEntity<>("pong",HttpStatus.OK);
	}
	
	
	@PostMapping("/create-product-set")
	public ResponseEntity<Void> createProductSet(HttpServletRequest request){
		String productSetId  =request.getHeader("productSetId");
		String productSetDisplayName  =request.getHeader("productSet-display-name");
		productSearchService.createProductSet(productSetId, productSetDisplayName);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	
	@PostMapping("/create-product")
	public ResponseEntity<Void> createProduct(@RequestBody CreateProductRequest createProductRequest){
		productSearchService.createProduct(createProductRequest);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
