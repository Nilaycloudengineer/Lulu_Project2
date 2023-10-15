package com.lulu.lulu_02_Shipping.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lulu.lulu_02_Shipping.entity.Shipping;

public interface ShippingRepository extends JpaRepository<Shipping, Long> {
}
