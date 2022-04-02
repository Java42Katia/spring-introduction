package terlan.spring.calculator.service;

import org.springframework.stereotype.Service;

@Service("^2")
public class CalculatorPowService implements CalculatorService {

	@Override
	public double calculate(double[] operands) {
		/* V.R.
		 * operands[1] has to be the exponent. In this case
		 * exception is redundant.
		 */
		if (operands.length > 1) throw new IllegalArgumentException("Incorrect number of operands > 1");
		return Math.pow(operands[0], 2);
	}

}
