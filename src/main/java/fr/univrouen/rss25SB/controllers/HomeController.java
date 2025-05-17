package fr.univrouen.rss25SB.controllers;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("projectName", "rss25SB");
		model.addAttribute("version", "1.0.0");
		model.addAttribute("developers", List.of("Celina FEGHOUL", "Chanez ASSOUS"));
		
		return "index";
	}

}