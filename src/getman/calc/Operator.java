package getman.calc;

/**@author ParfyonovArtem
 * @version 1.0
 * @since 14-08-2014*/

enum OperatorType{
	Addition, Subtraction, Multiplication, Division
}

public class Operator {
	//-----------Data members--------------
	private OperatorType type;
	private String result = null;
	
	//-----------Methods-----------
	/**Parameter constructor*/
	public Operator(String operator){
		switch (operator) {
		case "+":
			type = OperatorType.Addition;
			break;
		case "-":
			type = OperatorType.Subtraction;
			break;
		case "*":
			type = OperatorType.Multiplication;			
			break;
		case "/":
			type = OperatorType.Division;			
			break;
		default:
			break;
		}
		
	}
	
	public void perform(Operand oper1, Operand oper2){
		switch (type) {
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
	
	public String getrResult(){
		return result;
	}
	
	public OperatorType getType(){
		return this.type;
	}
	
	public boolean isPerformed(){
		return (result != null);
	}
}
