package fr.univrouen.rss25SB.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.univrouen.rss25SB.model.Item;

public interface FeedRepository extends JpaRepository<Item, String>{

}
