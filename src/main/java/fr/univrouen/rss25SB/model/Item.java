package fr.univrouen.rss25SB.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.xml.bind.annotation.*;
import java.time.OffsetDateTime;

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