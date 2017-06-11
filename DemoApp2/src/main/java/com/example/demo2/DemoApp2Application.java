package com.example.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class DemoApp2Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoApp2Application.class, args);
	}

	@RequestMapping(method = { RequestMethod.GET }, value = { "/hello" })
	public String hello() {
		System.out.println("alive in DemoApp2");
		try {
			Thread.currentThread().sleep(40000);// just to simulate the slow method
												
		} catch (InterruptedException e) {
		}
		return "hello example - DemoApp2";
	}
}
