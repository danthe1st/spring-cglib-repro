package io.github.danthe1st.spring_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;

@SpringBootApplication
public class SpringTestApplication implements ApplicationListener<ApplicationReadyEvent> {

	private final EntityRepository repo;

	public SpringTestApplication(EntityRepository repo) {
		this.repo = repo;
	}

	@Override
	public void onApplicationEvent(ApplicationReadyEvent event) {
		repo.getByName("");
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringTestApplication.class, args);
	}
}