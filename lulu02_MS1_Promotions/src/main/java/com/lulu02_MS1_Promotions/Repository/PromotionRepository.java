package com.lulu02_MS1_Promotions.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lulu02_MS1_Promotions.Entity.Promotion;

@Repository
public interface PromotionRepository extends JpaRepository<Promotion, Long> {
}
