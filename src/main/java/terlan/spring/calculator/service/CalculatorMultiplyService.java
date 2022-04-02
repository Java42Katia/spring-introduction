package terlan.spring.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorMultiplyService implements CalculatorService {

	@Override
	public double calculate(double[] operands) {
		if (operands.length != 2) throw new IllegalArgumentException("Incorrect number of operands, not equals two");
		return operands[0] * operands[1];
	}

	@Override
	public String getType() {
		return "*";
	}

}
