package fr.univrouen.rss25SB.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.univrouen.rss25SB.model.Category;

public interface CategoryRepository extends JpaRepository<Category, String> {

}
