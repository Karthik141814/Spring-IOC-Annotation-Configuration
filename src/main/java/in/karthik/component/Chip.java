package in.karthik.component;

import org.springframework.stereotype.Component;

@Component
public class Chip {

	
public Chip() {
	System.out.println("Chip Constructor -0 param ");
}	

public String ChipType() {
	return "32-Bit";
}
}
