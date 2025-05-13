package fr.univrouen.rss25SB.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.univrouen.rss25SB.Repository.ItemRepository;
import fr.univrouen.rss25SB.model.Item;

@RestController
@RequestMapping("/items")
public class GetController {
	
	private final ItemRepository itemRepository;
	
	public GetController(ItemRepository itemRepository) {
		
		this.itemRepository = itemRepository;
	}

	@GetMapping //Mappe une méthode à une requête HTTP GET
	public List<Item> getAllItems() {
        return itemRepository.findAll();
    }
	
//	@GetMapping("/guid")
//	public String getRSSinXML(
//			@RequestParam(value = "guid") String texte //Récupère un paramètre de l'URL
//			) {
//		return "Détail du contenu RSS demandé " + texte;
//	}
//	
//	@GetMapping("/test")
//	public String testFlux(
//			@RequestParam(value = "nb") Integer number,
//			@RequestParam(value = "search") String texte
//			) {
//		return "Test : \n " +"guid = " + number +"\n"+ "titre = " + texte;
//	}
}
