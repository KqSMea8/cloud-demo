package com.wsyy.gateway.server;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author songyu
 *
 * @EnableDiscoveryClient // 注册和发现服务
 */
@Slf4j
@EnableDiscoveryClient
@SpringBootApplication
public class GatewayServerApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(GatewayServerApplication.class, args);
		for (int i = 0; i < 20; i++) {
			log.info("<========GatewayServerApplication==========>");
		}
	}


	@RestController
	@RefreshScope
	static class TestController {

		@Value("${didispace.title:false}")
		private String title;


		@GetMapping("/test")
		public String hello() {
			return title;
		}

	}

}
