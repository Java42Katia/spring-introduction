package terlan.spring.calculator.dto;

public class Request {
	
	public String operation;
	public double[] operands;
	
	public Request() {
		
	}

	public Request(String operation, double[] operands) {
		this.operation = operation;
		this.operands = operands;
	}

}
