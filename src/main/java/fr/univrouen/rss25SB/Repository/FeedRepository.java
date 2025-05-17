package fr.univrouen.rss25SB.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.univrouen.rss25SB.model.Feed;

public interface FeedRepository extends JpaRepository<Feed, Long>{

}
