package com.example;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProducerApplication {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String port=scan.nextLine();
		new SpringApplicationBuilder(ProducerApplication.class).properties("server.port:"+port).run(args);
	}
}
