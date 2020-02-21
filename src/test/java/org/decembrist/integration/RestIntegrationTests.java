package org.decembrist.integration;

import org.decembrist.domain.User;
import org.decembrist.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class RestIntegrationTests {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private MockMvc mvc;

	@Test
	public void userFindAllTest() throws Exception {
		final var user = new User();
		final var email = "email@email.ru";
		user.setEmail(email);
		user.setUsername("admin");
		user.setPassword("admin");
		userRepository.save(user);

		mvc.perform(get("/user"))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$", hasSize(1)))
				.andExpect(jsonPath("$[0].email", is(email)));
	}

}
