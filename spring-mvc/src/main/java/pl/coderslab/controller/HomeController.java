package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	//@RequestMapping("/hello")
	@GetMapping("/hello")
	public String hello() {
		return "index.jsp";
	}

	@GetMapping("/body")
	@ResponseBody // bez tego szuka widoku
	public String body() {
		return "Nie strona a czysty napis";
	}

	@GetMapping("/mbank/bad")
	@ResponseBody
	public String mBankBad() {
		return "ęśąćż";
	}

	@GetMapping(path = "/mbank/good", produces = "text/plain;charset=UTF-8")
	@ResponseBody
	public String mBankGood() {
		return "ęśąćż";
	}
}
