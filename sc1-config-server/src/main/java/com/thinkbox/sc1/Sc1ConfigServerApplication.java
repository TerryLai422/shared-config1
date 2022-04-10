package com.thinkbox.sc1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class Sc1ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sc1ConfigServerApplication.class, args);
	}

}
