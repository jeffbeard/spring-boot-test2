package org.firebyte.test;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class SpringBootTestApplicationTests {

	@SpyBean
	private ApplicationContext applicationContext;

	@Test
	void contextLoads() {
	}

	@Test
	void mainMethodStartsApplication() {
		SpringBootTestApplication.main(new String[]{});
		assertNotNull(applicationContext, "Application context should be created");
	}
}
