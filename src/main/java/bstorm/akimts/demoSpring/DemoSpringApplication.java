package bstorm.akimts.demoSpring;

import bstorm.akimts.demoSpring.presentation.InterfaceConsole;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoSpringApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DemoSpringApplication.class, args);
	}

}
