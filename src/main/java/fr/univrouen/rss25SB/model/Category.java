package fr.univrouen.rss25SB.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.xml.bind.annotation.*;

@Entity
@Table(name = "categories")
@XmlRootElement(name = "category")
@XmlAccessorType(XmlAccessType.FIELD)
public class Category {
    @Id
    private Long id;
    
    @NotNull
    @XmlAttribute
    private String term;
    
//    @ManyToOne
//    @JoinColumn(name = "item_id")
//    private Item item;
    
    public Category() {
    }
    
    public Category(String term) {
        this.term = term;
    }

    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getTerm() {
        return term;
    }
    
    public void setTerm(String term) {
        this.term = term;
    }
//    
//    public Item getItem() {
//        return item;
//    }
//    
//    public void setItem(Item item) {
//        this.item = item;
//    }
    
    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", term='" + term + '\'' +
                '}';
    }
}