package com.vijayit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.vijayit.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/user")
public class FeignController {
@Autowired
private FeignClient feignService;

@GetMapping("/username")
public String getName() {
    return feignService.getName();
}
@GetMapping("/userrole")
public String getRole() {
    return feignService.getRole();
}
}
