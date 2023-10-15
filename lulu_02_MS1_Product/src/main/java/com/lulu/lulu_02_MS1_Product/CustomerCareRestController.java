package com.lulu.lulu_02_MS1_Product;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "Customercare-service") // other micro service name

public interface CustomerCareRestController {

	@GetMapping("ccs/hellocustomercare")

	public String Hello();

}