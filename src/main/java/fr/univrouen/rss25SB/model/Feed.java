package fr.univrouen.rss25SB.model;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.*;


@Entity
@XmlRootElement(name = "feed")
@XmlAccessorType(XmlAccessType.FIELD)
public class Feed {
    
    @Id
    private Long id;
    
    @XmlElement
    private String title;
    
    
    @XmlElement
    private String pubDate;
    
  
    @XmlElement
    private String copyright;

    @XmlAttribute
    private String lang;
    
  
    @XmlAttribute
    private String version = "25"; // La version est à 25 par défaut
    
    // One feed can have one to many links
//    @OneToMany(mappedBy = "feed", cascade = CascadeType.ALL, orphanRemoval = true)
//    @XmlElement(name = "link", required = true)
//    private List<Link> links = new ArrayList<>();
//    
//    // One feed can have one to 10 items
//    @OneToMany(mappedBy = "feed", cascade = CascadeType.ALL, orphanRemoval = true)
//    @XmlElement(name = "item", required = true)
//    private List<Item> items = new ArrayList<>();
    
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
    
    public String getPubDate() {
        return pubDate;
    }
    
    public void setPubDate(String pubDate) {
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
    
//    public List<Link> getLinks() {
//        return links;
//    }
//    
//    public void setLinks(List<Link> links) {
//        this.links = links;
//    }
//    
//    public void addLink(Link link) {
//        links.add(link);
//        link.setFeed(this);
//    }
//    
//    public void removeLink(Link link) {
//        links.remove(link);
//        link.setFeed(null);
//    }
//    
//    public List<Item> getItems() {
//        return items;
//    }
//    
//    public void setItems(List<Item> items) {
//        this.items = items;
//    }
//    
//    public void addItem(Item item) {
//        items.add(item);
//        item.setFeed(this);
//    }
//    
//    public void removeItem(Item item) {
//        items.remove(item);
//        item.setFeed(null);
//    }
//    
    @Override
    public String toString() {
        return "Feed{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", pubDate=" + pubDate +
                ", copyright='" + copyright + '\'' +
                ", lang='" + lang + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}