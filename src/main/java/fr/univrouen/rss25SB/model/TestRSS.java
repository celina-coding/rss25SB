package fr.univrouen.rss25SB.model;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;

public class TestRSS {
		
	public String loadFileXML() {
		Resource resource = new DefaultResourceLoader()
                .getResource("classpath:xml/item.xml");
		 try (InputStream inputStream = resource.getInputStream()) {
	            return new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
	}catch (IOException e) {
		return "Erreur lors de la lecture du fichier"+ e.getMessage();
	}
	}
	}
