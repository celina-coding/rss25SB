package fr.univrouen.rss25SB.model;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import jakarta.xml.bind.annotation.*;

@Embeddable
@XmlAccessorType(XmlAccessType.FIELD)
public class Image {

    @NotNull
    @XmlAttribute(name = "type", required = true)
    private String imageType; // Formats: GIF, JPEG, JPG, BMP, PNG

    @NotNull
    @XmlAttribute(name = "href", required = true)
    private String href; 

    @NotNull
    @XmlAttribute(name = "alt", required = true)
    private String alt; 

    @XmlAttribute(name = "length")
    private Integer length; 

    public Image() {
    }

    public Image(String imageType, String href, String alt) {
        this.imageType = imageType;
        this.href = href;
        this.alt = alt;
    }

    public Image(String imageType, String href, String alt, Integer length) {
        this.imageType = imageType;
        this.href = href;
        this.alt = alt;
        this.length = length;
    }

    // Getters & Setters
    public String getType() {
        return imageType;
    }

    public void setType(String type) {
        this.imageType = type;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Image{" +
                "type='" + imageType + '\'' +
                ", href='" + href + '\'' +
                ", alt='" + alt + '\'' +
                (length != null ? ", length=" + length : "") +
                '}';
    }
}