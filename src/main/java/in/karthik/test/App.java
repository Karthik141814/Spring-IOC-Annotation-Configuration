package in.karthik.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.karthik.config.AppConfig;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext ctxt = new AnnotationConfigApplicationContext(AppConfig.class);
	}
}
