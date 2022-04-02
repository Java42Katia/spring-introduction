package terlan.spring.calculator;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import terlan.spring.calculator.service.CalculatorService;

@Component
public class Calculator {

	Map<String, CalculatorService> services;
	
	@Autowired
	public Calculator(List<CalculatorService> list) {
		services = list.stream().collect(Collectors.toMap(CalculatorService::getType, s -> s));
	}
	
	public CalculatorService getOperationService(String type) {
		return services.get(type);
	}

	public String getGreetingMessage() {
		return String.format("Hi, I'm a calculator. Enable operation: %s", services.keySet().toString());
	}

}
