package getman.calc;

/**@author ParfyonovArtem
 * @version 1.0
 * @since 14-08-2014*/

public class CalcOperation {
	//--------------Data members-----------
	private Operator operator;
	private Operand operand1;
	private Operand operand2;
	
	//------------Methods----------
	
	
	public void performOperation(){
		operator.perform(operand1, operand2);
	}
	
}



/**private int operand1;
	private int operand2;
	private int result;*/