package io.github.danthe1st.spring_test;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class SomeController {

	@PostMapping
	public void setStartPage(@RequestParam MultipartFile imageFile) throws IOException {
		somethingTransactional();
	}

	@Transactional
	public void somethingTransactional() {

	}
}
