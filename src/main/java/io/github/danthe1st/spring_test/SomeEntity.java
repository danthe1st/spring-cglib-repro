package io.github.danthe1st.spring_test;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class SomeEntity {

	@Id
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SomeEntity other = (SomeEntity) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "SomeEntity [name=" + name + "]";
	}

}
