package terlan.spring.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorPowService implements CalculatorService {

	@Override
	public double calculate(double[] operands) {
		if (operands.length > 2 || operands.length < 1) throw new IllegalArgumentException("Incorrect number of operands");
		double exp = operands.length == 2 ? operands[1] : 2;  
		return Math.pow(operands[0], exp);
	}

	@Override
	public String getType() {
		return "^";
	}

}
