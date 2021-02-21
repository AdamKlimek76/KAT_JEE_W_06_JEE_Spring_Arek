package pl.coderslab;

import java.time.LocalTime;

import org.springframework.stereotype.Component;

@Component
public class CustomWorkingHours implements WorkingHours {

	@Override
	public LocalTime getStart() {
		return LocalTime.of(12, 0);
	}

	@Override
	public LocalTime getEnd() {
		return LocalTime.of(21, 0);
	}
}
