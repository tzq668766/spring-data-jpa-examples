package net.petrikainulainen.spring.datajpa.repository;

import net.petrikainulainen.spring.datajpa.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Specifies methods used to obtain and modify person related information
 * which is stored in the database.
 * @author Petri Kainulainen
 */
public interface PersonRepository extends JpaRepository<Person, Long>, JpaSpecificationExecutor<Person> {

}
