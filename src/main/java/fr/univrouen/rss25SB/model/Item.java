package fr.univrouen.rss25SB.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.xml.bind.annotation.*;
import java.time.OffsetDateTime;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;

@Entity
@Table(name = "items")
@XmlRootElement(name = "item")
@XmlAccessorType(XmlAccessType.FIELD)
public class Item {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @XmlTransient
    private Long id;
    
    @NotNull
    @Column(unique = true)
    @XmlElement(required = true)
    private String guid;
    
    @NotNull
    @Size(max = 128)
    @XmlElement(required = true)
    private String title;
    
    @NotNull
    @XmlElement(name = "published", required = true)
    private OffsetDateTime published;
    
//    @XmlElement(name = "updated")
//    private OffsetDateTime updated;
//    
//    @ManyToOne
//    @JoinColumn(name = "feed_id")
//    @XmlTransient
//    private Feed feed;
//    
//    // Un item peut avoir 1 à plusieurs catégories
//    @OneToMany(mappedBy = "item", cascade = CascadeType.ALL, orphanRemoval = true)
//    @XmlElement(name = "category", required = true)
//    private List<Category> categories = new ArrayList<>();
//    
//    // Un item peut avoir 1 à plusieurs auteurs ou contributeurs
//    @OneToMany(mappedBy = "item", cascade = CascadeType.ALL, orphanRemoval = true)
//    @XmlTransient
//    private List<Person> persons = new ArrayList<>();
//    
//    @Embedded
//    @XmlElement(name = "image")
//    private Image image;
//    
//    @Embedded
//    @NotNull
//    @XmlElement(name = "content", required = true)
//    private Content content;
//    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public OffsetDateTime getPublished() {
        return published;
    }

    public void setPublished(OffsetDateTime published) {
        this.published = published;
    }

//    public OffsetDateTime getUpdated() {
//        return updated;
//    }
//
//    public void setUpdated(OffsetDateTime updated) {
//        this.updated = updated;
//    }
//
//    public Feed getFeed() {
//        return feed;
//    }
//
//    public void setFeed(Feed feed) {
//        this.feed = feed;
//    }
//
//    public List<Category> getCategories() {
//        return categories;
//    }
//
//    public void setCategories(List<Category> categories) {
//        this.categories = categories;
//    }
//    
//    @XmlElement(name = "author", required = true)
//    public List<Person> getAuthors() {
//        return persons.stream()
//                .filter(p -> "AUTHOR".equals(p.getRole()))
//                .collect(Collectors.toList());
//    }
//    
//    @XmlElement(name = "contributor", required = true)
//    public List<Person> getContributors() {
//        return persons.stream()
//                .filter(p -> "CONTRIBUTOR".equals(p.getRole()))
//                .collect(Collectors.toList());
//    }
//
//    public List<Person> getAllPersons() {
//        return persons;
//    }
//
//    public void setPersons(List<Person> persons) {
//        this.persons = persons;
//    }
//
//    public Image getImage() {
//        return image;
//    }
//
//    public void setImage(Image image) {
//        this.image = image;
//    }
//
//    public Content getContent() {
//        return content;
//    }
//
//    public void setContent(Content content) {
//        this.content = content;
//    }
//
//    // Méthodes utilitaires
//    public void addCategory(Category category) {
//        this.categories.add(category);
//        category.setItem(this);
//    }
//
//    public void removeCategory(Category category) {
//        this.categories.remove(category);
//        category.setItem(null);
//    }
//    
//    public void addPerson(Person person) {
//        this.persons.add(person);
//        person.setItem(this);
//    }
//    
//    public void removePerson(Person person) {
//        this.persons.remove(person);
//        person.setItem(null);
//    }
//    
//    @PrePersist
//    @PreUpdate
//    private void validate() {
//        if (content != null && "html".equals(content.getType()) && content.getSrc() == null) {
//            throw new IllegalStateException("L'attribut src est requis quand content.type='html'");
//        }
//        
//        // Vérifier qu'il y a au moins un auteur/contributeur
//        if (persons.isEmpty()) {
//            throw new IllegalStateException("Un item doit avoir au moins un auteur ou contributeur");
//        }
//    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", guid='" + guid + '\'' +
                ", title='" + title + '\'' +
                ", published=" + published +
                '}';
    }
}