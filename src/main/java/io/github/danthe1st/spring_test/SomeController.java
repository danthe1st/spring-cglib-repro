package io.github.danthe1st.spring_test;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SomeController {

	@PostMapping
	public void setStartPage() {
		somethingTransactional();
	}

	@Transactional
	public void somethingTransactional() {

	}
}
