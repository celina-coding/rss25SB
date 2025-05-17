package fr.univrouen.rss25SB.model;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement(name = "item")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Item{
	@Id
	private Long id;
	
	@XmlElement
	private String guid;
	
	@XmlElement
	private String title;
	
	@XmlElement
	private String published;
	
	@XmlElement
	private String updated;
	
	
	
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

	 public String getPublished() {
		 return published;
	    }

	 public void setPublished(String published) {
        this.published = published;
	    }
	 
	 public String getUpdated() {
		 return updated;
	    }

	 public void setUpdated(String updated) {
        this.updated = updated;
	    }
	
}



//import jakarta.xml.bind.annotation.XmlAccessType;
//import jakarta.xml.bind.annotation.XmlAccessorType;
//import jakarta.xml.bind.annotation.XmlAttribute;
//import jakarta.xml.bind.annotation.XmlElement;
//import jakarta.xml.bind.annotation.XmlRootElement;
//
//@XmlRootElement(name = "item")
//@XmlAccessorType(XmlAccessType.PROPERTY)
//public class Item {
//    @XmlAttribute
//    private String guid;
//    @XmlElement
//    private String title;
//    @XmlElement
//    private String published;
//
//    public Item(String guid, String title, String published) {
//        super();
//        this.guid = guid;
//        this.title = title;
//        this.published = published;
//    }
//
//    public Item() {
//    }
//
//    @Override
//    public String toString() {
//        return ("Article : " + title + "\n(" + guid
//                + ") Le = " + published);
//    }
//}