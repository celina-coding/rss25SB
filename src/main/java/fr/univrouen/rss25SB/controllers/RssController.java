//package fr.univrouen.rss25SB.controllers;
//
//import org.springframework.http.MediaType;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import fr.univrouen.rss25SB.model.Item;
//
//@RestController //marque une classe comme etant un controller rest 
//public class RssController {
//	//@RequestMapping quand on ne specifie pas la methode ça repond uniquement aux requetes GET
//	@RequestMapping(value = "/xml", produces = MediaType.APPLICATION_XML_VALUE)
//	//Lit le corps d'une requête
//	public @ResponseBody Item getXML() {
//		Item it = new Item("12345678","Test item","2022-05-01T11:22:33");
//		return it;
//	}
//	//@ResponseBody	Indique que la valeur retournée doit être convertie en XML/JSON.
//}
