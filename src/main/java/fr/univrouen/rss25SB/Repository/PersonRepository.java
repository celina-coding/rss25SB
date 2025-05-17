package fr.univrouen.rss25SB.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.univrouen.rss25SB.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{

}
