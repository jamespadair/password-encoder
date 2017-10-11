package com.relayhealth.passwordEncoder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;

@SpringBootApplication
public class MainApp {

	public static void main(String[] args) {
		
		BCryptPasswordEncoder bcryptEncoder = new BCryptPasswordEncoder();
		int i = 0;
		if (args[0] != null) {
			System.out.println("password="+args[0]);
		} else {
			System.out.println("usage: passwordEncoder [password to encode]");
			System.exit(1);
		}
			
		String password = args[0]; 
		String hashedPassword = bcryptEncoder.encode(password);

		System.out.println(hashedPassword);
	
		SpringApplication.run(MainApp.class, args);
	}

}
