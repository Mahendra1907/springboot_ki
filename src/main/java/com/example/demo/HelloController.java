package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

@GetMapping("/")
public String home() {
return "Welcome to KLH";
}

@GetMapping("/hello")
public String hello() {
return "Hello Kubernetes!";
}

@GetMapping("/employee")
public String employee() {
return "Employee: 101, Name: Srinivas";
}
}
