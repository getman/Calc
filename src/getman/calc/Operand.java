package getman.calc;

/**@author ParfyonovArtem
 * @version 1.0
 * @since 14-08-2014*/

abstract public class Operand {
	abstract public String getValue();
	abstract public void setValue(String val);
}

class OperandInt extends Operand{
	//--------------Data members------
	private int value;
	
	//--------------Mehods-----------
	@Override
	public String getValue() {
		return String.valueOf(value);
	}

	@Override
	public void setValue(String val) {
		value = Integer.valueOf(val);
	}
	
}