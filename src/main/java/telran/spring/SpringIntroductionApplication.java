package telran.spring;

import java.util.Scanner;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringIntroductionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringIntroductionApplication.class, args);
		Scanner scanner = new Scanner(System.in);
		Sender sender = ctx.getBean(Sender.class);
		System.out.println(sender.getSenderGreeting());
		while (true) {
			System.out.println("Enter exit for gracefull shutdown");
			String line = scanner.nextLine();
			if (line.equals("exit")) {
				ctx.close();
				break;
			}
		}
	}
	
	@PostConstruct
	void init() {
		System.out.println("Application context has been created");
	}
	
	@PreDestroy
	void contextClose() {
		System.out.println("Application context is going to be destroyed");
	}

}
