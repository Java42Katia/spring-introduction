package terlan.spring.calculator.service;

import org.springframework.stereotype.Service;

@Service("sqrt")
public class CalculatorSqrtService implements CalculatorService {

	@Override
	public double calculate(double[] operands) {
		if (operands.length > 1) throw new IllegalArgumentException("Incorrect number of operands > 1");
		return Math.sqrt(operands[0]);
	}

}
