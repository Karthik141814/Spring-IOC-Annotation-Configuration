package in.karthik.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Robot {
	
	@Autowired
	private Chip chip;

	public Robot() {
		System.out.println("Robot Constructor-O Param Constructor");
	}
	
	public void doWork() {
		String type=chip.ChipType();
		if(type.equals("32-Bit")) {
			System.out.println("Performanc low..");
		}
	}
}
