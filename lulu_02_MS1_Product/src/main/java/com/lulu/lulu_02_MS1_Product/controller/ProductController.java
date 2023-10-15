package com.lulu.lulu_02_MS1_Product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lulu.lulu_02_MS1_Product.CustomerCareRestController;
import com.lulu.lulu_02_MS1_Product.entity.Product;
import com.lulu.lulu_02_MS1_Product.repo.ProductRepo;

@RestController
@RequestMapping("/pps")
public class ProductController {
//
//	@GetMapping("/add")
//	public int add() {
//		int a = 3;
//		int b = 2;
//		int res = a + b;
//		return res;
//	}
//
//	@GetMapping("info")
//
//	public String info() {
//
//		return "<marquee><h1>Hi, I am Nilay. I am from lululemon</h1></marquee>";
//
//	}

	@Autowired
	ProductRepo productRepository;

	@GetMapping("/pps/getProduct")
	public List<Product> getJPQL() {

		return productRepository.findAll(); // select * from <TableName>;

	}

//	@PostMapping("/addProduct")
//	public SportsProduct createuser(@RequestBody SportsProduct prod) {
//		return productRepository.save(prod);
//	}

	/*
	 * @GetMapping("/getserviceconcept") public String getdata() {
	 * 
	 * // service Layer ---class--method to be invoked from here MyService ms = new
	 * MyService(); return ms.process();
	 * 
	 * // return productRepository.findAll(); // select * from <TableName>; //
	 * console i/O
	 * 
	 * }
	 */
//
//	@Autowired
//	MyService ms;
//
//	@GetMapping("/getserviceconcept")
//	public String getdata() {
//
//		// service Layer ---class--method to be invoked from here
//		// MyService ms= new MyService();
//		ms.process();
//		// return productRepository.findAll(); // select * from <TableName>;
//		// console i/O
//		return ms.process();
//
//	}
//
////	///////////////// JPQL///////////////////
////
////	@GetMapping("/getbyJPQL")
////	public List<SportsProduct> getProductsByJPQL() {
////
////		return productRepository.findAllMyQuery(); // select * from <TableName>;
////
////	}
//
//	@GetMapping("/getbyMyNative")
//	public List<SportsProduct> getProductsByNative() {
//
//		return productRepository.findAllNativeQuey(); // select * from <TableName>;
//	}
//////Delete Operations  @PathVariable..
//
//////Delete Operations  @PathVariable..
//
//	@DeleteMapping("`/{id}")
//	public void deletProduct(@PathVariable("id") Integer id) {
//
//		productRepository.deleteById(id); // select * from <TableName>;
//
//	}

	@Autowired

	CustomerCareRestController ccrc;

	@GetMapping("/productToCustomer")

	public String helloProduct() {

		// Here we are trying to invoke or call other microservice methods or
		// implementations

		return ccrc.Hello();

	}
}
