package terlan.spring.calculator.service;

import org.springframework.stereotype.Service;

@Service("cos")
public class CalculatorCosService implements CalculatorService {

	@Override
	public double calculate(double[] operands) {
		// V.R. '!=' has to be used instead of '>'
		if (operands.length > 1) throw new IllegalArgumentException("Incorrect number of operands > 1");
		return Math.cos(operands[0]);
	}

}
