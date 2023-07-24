package io.github.danthe1st.spring_test;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;

@SpringBootTest
class SpringTestApplicationTests {

	@Test
	void testChangeStartPage() throws Exception {
	}

	@Test
	@WithMockUser
	void testChangeStartPageAsNonAdmin() throws Exception {
	}
}
