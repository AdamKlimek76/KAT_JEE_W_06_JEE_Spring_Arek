package pl.coderslab.controller;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @Controller + @ResponseBody
public class RandomController {

	@GetMapping("/random/{min}/{max}")
	public String random(
			@PathVariable int min,
			@PathVariable int max) {
		return String.valueOf(new Random().nextInt(max - min + 1) + min);
	}
	
}
