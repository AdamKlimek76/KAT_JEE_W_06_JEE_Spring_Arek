package pl.coderslab.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ParamController {


	@GetMapping("/oldparam")
	@ResponseBody
	public String oldParam(HttpServletRequest httpServletRequest) {
		String age = httpServletRequest.getParameter("age");
		return String.format("You are %s years old", age);
	}

	@GetMapping("/param")
	@ResponseBody
	public String param(@RequestParam(defaultValue = "0") Integer age) {
		return String.format("You are %d years old", age);
	}

	@GetMapping("/book/{id}")
	@ResponseBody
	public String book(@PathVariable int id) {
		return "Pobrano ksiazke o id : " + id;
	}

	@GetMapping("/pattern/*")
	@ResponseBody
	public String patterns() {
		return "przyjme cokolwiek";
	}

	@GetMapping("/browser")
	@ResponseBody
	public String browser(@RequestHeader("user-agent") String agent) {
		return "Twoj klient to: " + agent;
	}

}
