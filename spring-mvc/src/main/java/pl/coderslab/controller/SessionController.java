package pl.coderslab.controller;

import java.time.LocalDateTime;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SessionController {

	@GetMapping("/session")
	@ResponseBody
	public String loginStart(HttpSession httpSession) {
		Object loginStart = httpSession.getAttribute("loginStart");

		if (loginStart == null) {
			loginStart = LocalDateTime.now();
			httpSession.setAttribute("loginStart", loginStart);
		}

		return String.valueOf(loginStart);
	}
}
