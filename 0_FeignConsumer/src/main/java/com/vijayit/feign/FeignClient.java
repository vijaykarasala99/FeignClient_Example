package com.vijayit.feign;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.cloud.openfeign.FeignClient(value="feignDemo",url="http://localhost:8084/vijay/")
public interface FeignClient {
	
	@GetMapping("/name")
	String getName();

	
	@GetMapping("/role")
	String getRole();
		
}
