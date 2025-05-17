package fr.univrouen.rss25SB.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.xml.bind.annotation.*;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "feeds")
@XmlRootElement(name = "feed")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"title", "pubDate", "copyright", "links", "items"})
public class Feed {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @XmlTransient
    private Long id;
    
    @NotNull
    @Size(max = 128)
    @XmlElement(required = true)
    private String title;
    
    @NotNull
    @XmlElement(required = true)
    private OffsetDateTime pubDate;
    
    @NotNull
    @Size(max = 128)
    @XmlElement(required = true)
    private String copyright;
    
    @NotNull
    @XmlAttribute(required = true)
    private String lang;
    
    @NotNull
    @XmlAttribute(required = true)
    private String version = "25"; // La version est à 25 par défaut
    
    // One feed can have one to many links
    @OneToMany(mappedBy = "feed", cascade = CascadeType.ALL, orphanRemoval = true)
    @XmlElement(name = "link", required = true)
    private List<Link> links = new ArrayList<>();
    
    // One feed can have one to 10 items
    @OneToMany(mappedBy = "feed", cascade = CascadeType.ALL, orphanRemoval = true)
    @XmlElement(name = "item", required = true)
    private List<Item> items = new ArrayList<>();
    
    public Feed() {
    }
    
    // Getters and setters
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public OffsetDateTime getPubDate() {
        return pubDate;
    }
    
    public void setPubDate(OffsetDateTime pubDate) {
        this.pubDate = pubDate;
    }
    
    public String getCopyright() {
        return copyright;
    }
    
    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }
    
    public String getLang() {
        return lang;
    }
    
    public void setLang(String lang) {
        this.lang = lang;
    }
    
    public String getVersion() {
        return version;
    }
    
    public void setVersion(String version) {
        this.version = version;
    }
    
    public List<Link> getLinks() {
        return links;
    }
    
    public void setLinks(List<Link> links) {
        this.links = links;
    }
    
    public void addLink(Link link) {
        links.add(link);
        link.setFeed(this);
    }
    
    public void removeLink(Link link) {
        links.remove(link);
        link.setFeed(null);
    }
    
    public List<Item> getItems() {
        return items;
    }
    
    public void setItems(List<Item> items) {
        this.items = items;
    }
    
    public void addItem(Item item) {
        items.add(item);
//        item.setFeed(this);
    }
    
    public void removeItem(Item item) {
        items.remove(item);
//        item.setFeed(null);
    }
    
    @PrePersist
    @PreUpdate
    private void validate() {
        if (links.isEmpty()) {
            throw new IllegalStateException("Un feed doit avoir au moins un lien");
        }
        
        if (items.isEmpty()) {
            throw new IllegalStateException("Un feed doit avoir au moins un item");
        }
        
        if (items.size() > 10) {
            throw new IllegalStateException("Un feed ne peut pas avoir plus de 10 items");
        }
    }
    
    @Override
    public String toString() {
        return "Feed{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", pubDate=" + pubDate +
                ", copyright='" + copyright + '\'' +
                ", lang='" + lang + '\'' +
                ", version='" + version + '\'' +
                ", links=" + links.size() +
                ", items=" + items.size() +
                '}';
    }
}