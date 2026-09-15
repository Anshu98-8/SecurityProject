package com.CodingBrajmohan.SecurityProject;

import com.CodingBrajmohan.SecurityProject.entities.User;
import com.CodingBrajmohan.SecurityProject.services.JwtService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SecurityProjectApplicationTests {

	@Autowired
	private JwtService jwtService;

	@Test
	void contextLoads() {

		User user = new User();

		String token = jwtService.generateAccessToken(user);

		System.out.println(token);

		Long id = jwtService.getUserIdFromToken("eyJhbGciOiJIUzM4NCJ9" +
				".eyJzdWIiOiI0IiwiZW1haWwiOiJhbnVqQGdtYWlsLmNvbSIsInJvbGVzIjpbIlVTRVIiLCJBRE1JTiJdLCJpYXQiOjE3MjE2NTMyNTgsImV4cCI6MTcyMTY1MzMxOH0.fhjAtKv56iN9XsyPxNh6V3rr6Eds9LuWVkqklcRQNzgTq7GY-46TG2LFvyDshiZe");

		System.out.println(id);

	}

}
