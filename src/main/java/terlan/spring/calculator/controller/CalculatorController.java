package terlan.spring.calculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import terlan.spring.calculator.Calculator;
import terlan.spring.calculator.dto.Request;
import terlan.spring.calculator.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
	
	@Autowired
	Calculator calculator;
	
	@PostMapping
	String calculate(@RequestBody Request request) {
		CalculatorService service = calculator.getOperationService(request.operation);
		if (service == null) return String.format("Service %s is not implemented", service);
		
		try {
			System.out.println(service.calculate(request.operands));
			return "calculation has been done - see logs";
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return e.getMessage();
		}
		
	}

}
