package terlan.spring.calculator.service;

import org.springframework.stereotype.Service;

@Service("sqrt")
public class CalculatorSqrtService implements CalculatorService {

	@Override
	public double calculate(double[] operands) {
		// V.R. operands.length != 1 looks much better
		if (operands.length > 1) throw new IllegalArgumentException("Incorrect number of operands > 1");
		/* V.R. 
		 *  if(operands[0]<0) throw new IllegalArgumentException("negative operand");
		 */
		return Math.sqrt(operands[0]);
	}

}
