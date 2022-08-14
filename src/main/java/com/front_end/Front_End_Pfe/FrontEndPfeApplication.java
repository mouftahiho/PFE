package com.front_end.Front_End_Pfe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class FrontEndPfeApplication {

	public static void main(String[] args) {
		SpringApplication.run(FrontEndPfeApplication.class, args);
	}

	@Bean
	public RestTemplate getRestTemplate() {

		return new RestTemplate();

	}

	@Bean
	public PasswordEncoder getPasswordEncoder(){
		return new BCryptPasswordEncoder();
	}


}
