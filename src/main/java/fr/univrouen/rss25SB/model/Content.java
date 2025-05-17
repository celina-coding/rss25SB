package fr.univrouen.rss25SB.model;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import jakarta.xml.bind.annotation.*;

@Embeddable
@XmlAccessorType(XmlAccessType.FIELD)
public class Content {

    @NotNull
    @XmlAttribute(name = "type", required = true)
    private String contentType; // "text" ou "html"

    @XmlAttribute(name = "src")
    private String src;

    @XmlValue
    private String value;

    public Content() {
    }

    public Content(String contentType, String value) {
        this.contentType = contentType;
        this.value = value;
    }

    public Content(String contentType, String src, String value) {
        this.contentType = contentType;
        this.src = src;
        this.value = value;
    }

    public String getType() {
        return contentType;
    }

    public void setType(String contentType) {
        if (!"text".equals(contentType) && !"html".equals(contentType)) {
            throw new IllegalArgumentException("Le type doit être 'text' ou 'html'");
        }
        this.contentType = contentType;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Content{" +
                "type='" + contentType + '\'' +
                (src != null ? ", src='" + src + '\'' : "") +
                ", value='" + (value != null ? value.substring(0, Math.min(20, value.length())) + "..." : "null") +
                '}';
    }
}