package com.lulu02_MS1_Promotions.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lulu02_MS1_Promotions.Entity.Promotion;
import com.lulu02_MS1_Promotions.Repository.PromotionRepository;

@RestController
@RequestMapping("/promotion")
public class PromotionController {

	@Autowired
	private PromotionRepository promotionRepository;

	@GetMapping
	public List<Promotion> getAllPromotions() {
		return promotionRepository.findAll();
	}

	@GetMapping("/{id}")
	public Promotion getPromotionById(@PathVariable Long id) {
		return promotionRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Promotion not found with id: " + id));
	}

	@PostMapping
	public Promotion createPromotion(@RequestBody Promotion promotion) {
		return promotionRepository.save(promotion);
	}

	@DeleteMapping("/{id}")
	public void deletePromotion(@PathVariable Long id) {
		promotionRepository.deleteById(id);
	}
}
