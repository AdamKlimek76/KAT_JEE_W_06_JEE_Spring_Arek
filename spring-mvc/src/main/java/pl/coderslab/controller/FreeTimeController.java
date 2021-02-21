package pl.coderslab.controller;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import pl.coderslab.WorkingHours;

@Controller
@ResponseBody
//@Controller + @ResponseBody = @RestController
public class FreeTimeController {
	private final WorkingHours workingHours;

	public FreeTimeController(WorkingHours customWorkingHours) {
		this.workingHours = customWorkingHours;
	}

	@GetMapping("/time")
	public String workingHours() {
		//LocalDateTime now = LocalDateTime.now();
		LocalDateTime now = LocalDateTime.of(2021, 2, 22, 18, 0);
		DayOfWeek dayOfWeek = now.getDayOfWeek();

		switch (dayOfWeek) {
			case SUNDAY:
			case SATURDAY:
				return "Wolne";
			default:
				LocalTime time = now.toLocalTime();
				return workingDay(time);
		}
	}

	private String workingDay(LocalTime time) {
		if (time.isBefore(workingHours.getStart()) || time.isAfter(workingHours.getEnd())) {
			return "Robie zadania domowe ze Springa";
		}

		return "W trakcie pracy";
	}
}
