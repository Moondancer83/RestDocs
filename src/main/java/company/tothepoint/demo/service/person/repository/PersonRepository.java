package company.tothepoint.demo.service.person.repository;

import company.tothepoint.demo.service.person.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {}