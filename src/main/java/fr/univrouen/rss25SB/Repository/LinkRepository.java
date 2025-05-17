package fr.univrouen.rss25SB.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.univrouen.rss25SB.model.Link;

public interface LinkRepository extends JpaRepository<Link, Long> {

}
