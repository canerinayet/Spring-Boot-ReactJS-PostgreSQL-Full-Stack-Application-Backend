package com.caner.demo;

import com.caner.demo.entities.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.password.PasswordEncoder;
@EnableJpaRepositories
@SpringBootApplication()
public class  CanerApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CanerApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {


	}


}
