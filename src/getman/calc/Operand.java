package getman.calc;

/**@author ParfyonovArtem
 * @version 1.0
 * @since 14-08-2014*/

public class Operand {
	//-----------Data members----------
	/**means that while you are typing the current operator increases before operator not occurs*/
	private boolean flFormed = false;
	private int value;
	
	//--------------Mehods-----------
	public String getValue() {
		return String.valueOf(value);
	}

	public void setValue(String val) {
		value = Integer.valueOf(val);
	}

	public void addContent(String contentAdditionalBit) {
		//current content
		String currentVal = String.valueOf(value);
		currentVal += contentAdditionalBit;
		value = Integer.valueOf(currentVal);
	}

	public void decreaseContent() {
		String currentVal = String.valueOf(value);
		currentVal = currentVal.substring(0, currentVal.length() - 2);
		value = Integer.valueOf(currentVal);
	}
	
	public boolean isFormed(){
		return flFormed;
	}
	
	public void setFormed(boolean fl){
		flFormed = fl;
	}
	
	/**claims the result of operation from Operator object for further calculations*/
	public void claimResult(Operator operator){
		String result = operator.getrResult();
		switch (operator.getType() ) {
		case Addition:
		case Subtraction:
			this.value = Integer.valueOf(result);
			this.flFormed = true;
			break;

		default:
			break;
		}
	}
}