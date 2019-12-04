package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "appcat", url = "http://appcat.default.svc.cluster.local:8080")
public interface AppcatFeign {
	
	@GetMapping("/cats")
	public String getCats();

}
