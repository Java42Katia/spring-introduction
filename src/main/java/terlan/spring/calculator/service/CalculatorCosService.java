package terlan.spring.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorCosService implements CalculatorService {

	@Override
	public double calculate(double[] operands) {
		if (operands.length != 1) throw new IllegalArgumentException("Incorrect number of operands");
		return Math.cos(operands[0]);
	}

	@Override
	public String getType() {
		return "cos";
	}

}
