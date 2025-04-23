package fr.univrouen.rss25SB.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetController {

	@GetMapping("/resume") //Mappe une méthode à une requête HTTP GET
	public String getListRSSinXML() {
		return "Envoi de la liste des flux RSS";
	}
	
	@GetMapping("/guid")
	public String getRSSinXML(
			@RequestParam(value = "guid") String texte //Récupère un paramètre de l'URL
			) {
		return "Détail du contenu RSS demandé " + texte;
	}
	
	@GetMapping("/test")
	public String testFlux(
			@RequestParam(value = "nb") Integer number,
			@RequestParam(value = "search") String texte
			) {
		return "Test : \n " +"guid = " + number +"\n"+ "titre = " + texte;
	}
}
