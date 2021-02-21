package pl.coderslab;

import java.time.LocalTime;

import org.springframework.stereotype.Component;

@Component
public class NormalWorkingHours implements WorkingHours {

	@Override
	public LocalTime getStart() {
		return LocalTime.of(9, 0);
	}

	@Override
	public LocalTime getEnd() {
		return LocalTime.of(17,0);
	}
}
