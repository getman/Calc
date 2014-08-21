package getman.calc;

import java.awt.event.KeyEvent;

public class UserInputScanner {
	//---------Data members-----------
	private Operand operand1 = null;
	private Operand operand2 = null;
	private Operator operator = null;
	private Operand currentFilled = operand1;
	
	//------------Methods-----------
	/**recievs key data from */
	public void receiveKey(KeyEvent keyEvent){
		/**the man idea - if we receive digit then it is an operand,
		 * and if operator +- - it is operator */
		
		String key = String.valueOf(keyEvent.getKeyChar() );
		int intKey = keyEvent.getKeyChar();
		boolean flOperatorTyped = false;
		
		switch (key) {
		case "0":
		case "1":
		case "2":
		case "3":
		case "4":
		case "5":
		case "6":
		case "7":
		case "8":
		case "9":
			flOperatorTyped = false;
			if (operand1 == null){
				operand1 = new Operand();
				currentFilled = operand1;
				
			}else {
				if ((operand1 != null) && (operand1.isFormed() ) && (operand2 == null) ){
					operand2 = new Operand();
					currentFilled = operand2;
				}
			}
			currentFilled.addContent(key);
			break;
			
		case "+":
		case "-":
		case "/":
		case "*":
			operator = new Operator(key);
			flOperatorTyped = true;
			currentFilled.setFormed(true);
			break;
		
		case "=":
			operator.perform(operand1, operand2);
			operand1.claimResult(operator);
			operand2 = null;
			break;
			
		default:
			
			break;
		}
		
		if (intKey == 8){
			if (flOperatorTyped){
				operator = null;
			} else {
				currentFilled.decreaseContent();
			}
			
		}
	}
	
	/**returns the string answer*/
	public String claimAnswer(){
		return operator.getrResult();
	}
	
	public boolean isPerformedCalc(){
		if (operator != null){
			return (operator.isPerformed() );
		} else{
			return false;
		}
	}

}
