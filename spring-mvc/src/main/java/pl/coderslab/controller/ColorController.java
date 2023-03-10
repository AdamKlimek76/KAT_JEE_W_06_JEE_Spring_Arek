package pl.coderslab.controller;

import java.time.LocalTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ColorController {

	@GetMapping("/color")
	public String getColor(Model model) {
		LocalTime now = LocalTime.of(23, 0);

		if (now.isAfter(LocalTime.of(8, 0)) &&
			now.isBefore(LocalTime.of(20, 0))) {
			model.addAttribute("backgroundColor", "white");
			model.addAttribute("color", "black");
		} else {
			model.addAttribute("backgroundColor", "black");
			model.addAttribute("color", "white");
		}

		return "color";
	}


}
