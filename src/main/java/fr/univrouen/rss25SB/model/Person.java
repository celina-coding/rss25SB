package fr.univrouen.rss25SB.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import jakarta.validation.constraints.*;
import jakarta.xml.bind.annotation.*;

@Entity
@Table(name = "persons")
@XmlAccessorType(XmlAccessType.FIELD)
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @XmlTransient
    private Long id;
    
    @NotNull
    @Size(max = 64)
    @XmlElement(name = "name", required = true)
    private String name;
    
    @XmlElement(name = "email")
    private String email;
    
   
    @XmlElement(name = "uri")
    private String uri;
    
    @NotNull
    @XmlTransient
    private String role;
    
    @ManyToOne
    @JoinColumn(name = "item_id")
    @XmlTransient
    private Item item;
    
    public Person() {
    }
    
    public Person(String name, String role) {
        this.name = name;
        this.role = role;
    }
    
    public Person(String name, String email, String uri, String role) {
        this.name = name;
        this.email = email;
        this.uri = uri;
        this.role = role;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getUri() {
        return uri;
    }
    
    public void setUri(String uri) {
        this.uri = uri;
    }
    
    public String getRole() {
        return role;
    }
    
    public void setRole(String role) {
        if (!role.equals("AUTHOR") && !role.equals("CONTRIBUTOR")) {
            throw new IllegalArgumentException("Le rôle doit être soit 'AUTHOR' ou 'CONTRIBUTOR'");
        }
        this.role = role;
    }
    
    public Item getItem() {
        return item;
    }
    
    public void setItem(Item item) {
        this.item = item;
    }
    
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", uri='" + uri + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}