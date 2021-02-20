package pl.coderslab.autowired.beans;

import org.springframework.stereotype.Component;

@Component
public class PersonService {

	private PersonRepository personRepository;

	public PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	public PersonRepository getPersonRepository() {
		return personRepository;
	}
}
