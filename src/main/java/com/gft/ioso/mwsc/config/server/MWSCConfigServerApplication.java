package com.gft.ioso.mwsc.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MWSCConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MWSCConfigServerApplication.class, args);
	}
}
