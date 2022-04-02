package terlan.spring.calculator;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import terlan.spring.calculator.service.CalculatorService;

@Component
public class Calculator {

	@Autowired
	Map<String, CalculatorService> services;
	
	public CalculatorService getOperationService(String type) {
		return services.get(type);
	}

	public String getGreetingMessage() {
		return String.format("Hi, I'm a calculator. Enable operation: %s", services.keySet().toString());
	}

}
