package io.github.danthe1st.spring_test;

import org.springframework.data.repository.CrudRepository;

public interface EntityRepository extends CrudRepository<SomeEntity, String> {
	SomeEntity getByName(String name);
}
