package com.lulu.lulu_02_Shipping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lulu.lulu_02_Shipping.entity.Shipping;
import com.lulu.lulu_02_Shipping.repo.ShippingRepository;

@RestController
@RequestMapping("/sss")
public class ShippingController {

	@Autowired
	private ShippingRepository shippingRepository;

	@GetMapping
	public List<Shipping> getAllShipping() {
		return shippingRepository.findAll();
	}

	@PostMapping
	public Shipping createShipping(@RequestBody Shipping shipping) {
		return shippingRepository.save(shipping);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteShipping(@PathVariable Long id) {
		shippingRepository.deleteById(id);
		return ResponseEntity.ok().build();
	}
}
