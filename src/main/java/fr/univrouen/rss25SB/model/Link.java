package fr.univrouen.rss25SB.model;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.*;

@Entity
@Table(name = "links")
@XmlAccessorType(XmlAccessType.FIELD)
public class Link {
    @Id
    private Long id;

    @XmlAttribute
    private String href;

 
    @XmlAttribute
    private String rel;

    
    @XmlAttribute
    private String type; 

    // Feeds peut avoir plusieurs links, un link appartient à un seul feed
//    @ManyToOne
//    @JoinColumn(name = "feed_id") 
//    @XmlTransient
//    private Feed feed;

    public Link() {
    }

    public Link(String href, String rel, String type) {
        this.href = href;
        this.rel = rel;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getRel() {
        return rel;
    }

    public void setRel(String rel) {
        if (!rel.equals("self") && !rel.equals("alternate")) {
            throw new IllegalArgumentException("rel doit être 'self' ou 'alternate'");
        }
        this.rel = rel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

//    public Feed getFeed() {
//        return feed;
//    }
//
//    public void setFeed(Feed feed) {
//        this.feed = feed;
//    }

    @Override
    public String toString() {
        return "Link{" +
                "id=" + id +
                ", href='" + href + '\'' +
                ", rel='" + rel + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}