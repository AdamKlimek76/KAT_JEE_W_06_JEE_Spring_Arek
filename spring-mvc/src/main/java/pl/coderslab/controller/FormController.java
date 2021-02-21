package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FormController {

	@GetMapping("/form")
	public String getForm() {
		return "form.jsp";
	}

	@PostMapping("/form")
	@ResponseBody
	public String postForm(@RequestParam String paramName) {
		return "Server odpowiada: " + paramName;
	}
}
