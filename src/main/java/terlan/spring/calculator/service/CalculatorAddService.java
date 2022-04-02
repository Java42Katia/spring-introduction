package terlan.spring.calculator.service;

import java.util.Arrays;

import org.springframework.stereotype.Service;

@Service("+")
public class CalculatorAddService implements CalculatorService {

	@Override
	public double calculate(double[] operands) {
		
		return Arrays.stream(operands).sum();
	}

}
