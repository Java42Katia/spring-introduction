package terlan.spring.calculator;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class WebCalculatorApp {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(WebCalculatorApp.class, args);
		Scanner scanner = new Scanner(System.in);
		Calculator calculator = ctx.getBean(Calculator.class);
		System.out.println(calculator.getGreetingMessage());
		
		while (true) {
			System.out.println("Enter exit for graceful shutdown");
			String line = scanner.nextLine();
			if (line.equals("exit")) {
				ctx.close();
				break;
			}
		}
		
		scanner.close();

	}

}
