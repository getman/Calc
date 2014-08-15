package getman.calc;

/**@author ParfyonovArtem
 * @version 1.0
 * @since 14-08-2014*/

enum OperatorType{
	Addition, Subtraction, Multiplication, Division
}

public class Operator {
	//-----------Data members--------------
	private OperatorType operatorType;
	private String result;
	
	//-----------Methods-----------
	public void perform(Operand oper1, Operand oper2){
		switch (operatorType) {
			case Addition:
				result = String.valueOf(Integer.valueOf(oper1.getValue() ) + Integer.valueOf(oper2.getValue() ) );
				break;

			case Subtraction:
				result = String.valueOf(Integer.valueOf(oper1.getValue() ) - Integer.valueOf(oper2.getValue() ) );
				break;

				
			default:
				break;
		}
	}
	
}
