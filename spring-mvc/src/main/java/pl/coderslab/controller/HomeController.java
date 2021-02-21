package pl.coderslab.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	private static final Logger log = LoggerFactory.getLogger(HomeController.class);
	private final Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());

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

	@GetMapping("/log")
	@ResponseBody
	public String log() {
		//System.out.println("Somebody requested log");
		log.info("Somebody requested log");
		log.debug("{} + {} = {}", 2, 2, 4);
		return "logged.";
	}


	@GetMapping("/exception")
	@ResponseBody
	public String exception() {
		String notInitialized = null;

		try {
			notInitialized.toUpperCase();
			return "good";
		} catch(NullPointerException e) {
			log.error("Not initialized string", e);
			return "error";
		}
	}
}
