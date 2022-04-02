package terlan.spring.calculator.service;

import org.springframework.stereotype.Service;

@Service("/")
public class CalculatorDivideService implements CalculatorService {
	

	@Override
	public double calculate(double[] operands) {
		if (operands.length != 2) throw new IllegalArgumentException("Incorrect number of operands, not equals two");
		/* V.R
		 * To compare operands[1] with 0.0 and to throw suitable exception
		 * is the good idea
		 */
		return operands[0] / operands[1];
	}

}
