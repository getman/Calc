package getman.calc;

import java.awt.Button;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.TextArea;

import javax.swing.JFrame;

/**@author ParfyonovArtem
 * @version 1.0
 * @since 12-08-2014*/

public class MainWindow extends JFrame{
	//-----------Data members-----------
	/**calc screen*/
	TextArea calcScreen;
	/**"1" button*/
	
	/**"7" button*/
	private Button btn7;
	private Button btn8;
	private Button btn9;
	/**"+" button*/
	private Button btnPlus;
	/**"4" button*/
	private Button btn4;
	private Button btn5;
	private Button btn6;
	private Button btnMinus;
	
	/**"1" button*/
	private Button btn1;
	private Button btn2;
	private Button btn3;
	private Button btnMultipl;
	
	/**"0" button*/
	private Button btn0;
	private Button btnComma;
	private Button btnDivision;
	private Button btnCalc;
	
	//------------Methods--------------
	
	/**Parameter constructor
	 * @param title String - the name of the window showed on the top*/
	public MainWindow(String title) {
		JFrame.setDefaultLookAndFeelDecorated(false);
		
		JFrame mainFrame = new JFrame(title);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mainFrame.setPreferredSize(new Dimension(400, 350));
		
		Container contentPane = mainFrame.getContentPane();
		
		createControls(mainFrame);
		
		mainFrame.pack();
		mainFrame.setVisible(true);
	}
	
	/**Creates all components on the frame*/
	private void createControls(JFrame frame){
		//creating layout manager
		GridBagLayout gbl = new GridBagLayout();
		frame.setLayout(gbl);
		
		//calc screen
		calcScreen = new TextArea();
		GridBagConstraints gbcCalsScreen = new GridBagConstraints();
		gbcCalsScreen.gridx = 0;
		gbcCalsScreen.gridy = 0;
		gbcCalsScreen.gridwidth = 4;
		gbcCalsScreen.gridheight = 1;
		gbcCalsScreen.fill = GridBagConstraints.HORIZONTAL;
		gbcCalsScreen.weightx = 1.0;
		gbcCalsScreen.weighty = 0.0;
//		gbcCalsScreen.ipadx = 10;
//		gbcCalsScreen.ipady = 10;
		gbcCalsScreen.anchor = GridBagConstraints.FIRST_LINE_END;
		frame.add(calcScreen, gbcCalsScreen);
		
		//standart button dimension
		Dimension stdBtnDim = new Dimension(45, 45);
		
		//"7" button
		btn7 = new Button("7");
		btn7.setSize(stdBtnDim);
		GridBagConstraints gbcBtn7 = new GridBagConstraints();
		gbcBtn7.gridx = 0;
		gbcBtn7.gridy = 1;
		gbcBtn7.gridwidth = 1;
		gbcBtn7.gridheight = 1;
		gbcBtn7.fill = GridBagConstraints.NONE;
		gbcBtn7.weightx = 0.1;
		gbcBtn7.weighty = 0.0;
		gbcBtn7.anchor = GridBagConstraints.FIRST_LINE_END;
		frame.add(btn7, gbcBtn7);
		
		//"8" button
		btn8 = new Button("8");
		btn8.setSize(stdBtnDim);
		GridBagConstraints gbcBtn8 = new GridBagConstraints();
		gbcBtn8.gridx = 1;
		gbcBtn8.gridy = 1;
		gbcBtn8.gridwidth = 1;
		gbcBtn8.gridheight = 1;
		gbcBtn8.fill = GridBagConstraints.NONE;
		gbcBtn8.weightx = 0.0;
		gbcBtn8.weighty = 0.0;
		gbcBtn8.anchor = GridBagConstraints.FIRST_LINE_END;
		frame.add(btn8, gbcBtn8);
		
		//"9" button
		btn9 = new Button("9");
		btn9.setSize(stdBtnDim);
		GridBagConstraints gbcBtn9 = new GridBagConstraints();
		gbcBtn9.gridx = 2;
		gbcBtn9.gridy = 1;
		gbcBtn9.gridwidth = 1;
		gbcBtn9.gridheight = 1;
		gbcBtn9.fill = GridBagConstraints.NONE;
		gbcBtn9.weightx = 0.0;
		gbcBtn9.weighty = 0.0;
		gbcBtn9.anchor = GridBagConstraints.FIRST_LINE_END;
		frame.add(btn9, gbcBtn9);
		
		//"+" button
		btnPlus = new Button("+");
		btnPlus.setSize(stdBtnDim);
		GridBagConstraints gbcBtnPlus = new GridBagConstraints();
		gbcBtnPlus.gridx = 3;
		gbcBtnPlus.gridy = 1;
		gbcBtnPlus.gridwidth = 1;
		gbcBtnPlus.gridheight = 1;
		gbcBtnPlus.fill = GridBagConstraints.NONE;
		gbcBtnPlus.weightx = 0.0;
		gbcBtnPlus.weighty = 0.0;
		gbcBtnPlus.anchor = GridBagConstraints.FIRST_LINE_END;
		frame.add(btnPlus, gbcBtnPlus);
		
		//"4" button
		btn4 = new Button("4");
		btn4.setSize(stdBtnDim);
		GridBagConstraints gbcBtn4 = new GridBagConstraints();
		gbcBtn4.gridx = 0;
		gbcBtn4.gridy = 2;
		gbcBtn4.gridwidth = 1;
		gbcBtn4.gridheight = 1;
		gbcBtn4.fill = GridBagConstraints.NONE;
		gbcBtn4.weightx = 0.1;
		gbcBtn4.weighty = 0.0;
		gbcBtn4.anchor = GridBagConstraints.FIRST_LINE_END;
		frame.add(btn4, gbcBtn4);
		
		//"5" button
		btn5 = new Button("5");
		btn5.setSize(stdBtnDim);
		GridBagConstraints gbcBtn5 = new GridBagConstraints();
		gbcBtn5.gridx = 1;
		gbcBtn5.gridy = 2;
		gbcBtn5.gridwidth = 1;
		gbcBtn5.gridheight = 1;
		gbcBtn5.fill = GridBagConstraints.NONE;
		gbcBtn5.weightx = 0.0;
		gbcBtn5.weighty = 0.0;
		gbcBtn5.anchor = GridBagConstraints.FIRST_LINE_END;
		frame.add(btn5, gbcBtn5);
		
		//"6" button
		btn6 = new Button("6");
		btn6.setSize(stdBtnDim);
		GridBagConstraints gbcBtn6 = new GridBagConstraints();
		gbcBtn6.gridx = 2;
		gbcBtn6.gridy = 2;
		gbcBtn6.gridwidth = 1;
		gbcBtn6.gridheight = 1;
		gbcBtn6.fill = GridBagConstraints.NONE;
		gbcBtn6.weightx = 0.0;
		gbcBtn6.weighty = 0.0;
		gbcBtn6.anchor = GridBagConstraints.FIRST_LINE_END;
		frame.add(btn6, gbcBtn6);
		
		//"-" button
		btnMinus = new Button("-");
		btnMinus.setSize(stdBtnDim);
		GridBagConstraints gbcBtnMinus = new GridBagConstraints();
		gbcBtnMinus.gridx = 3;
		gbcBtnMinus.gridy = 2;
		gbcBtnMinus.gridwidth = 1;
		gbcBtnMinus.gridheight = 1;
		gbcBtnMinus.fill = GridBagConstraints.NONE;
		gbcBtnMinus.weightx = 0.0;
		gbcBtnMinus.weighty = 0.0;
		gbcBtnMinus.anchor = GridBagConstraints.FIRST_LINE_END;
		frame.add(btnMinus, gbcBtnMinus);
		
		//"1" button
		btn1 = new Button("1");
		btn1.setSize(stdBtnDim);
		GridBagConstraints gbcBtn1 = new GridBagConstraints();
		gbcBtn1.gridx = 0;
		gbcBtn1.gridy = 3;
		gbcBtn1.gridwidth = 1;
		gbcBtn1.gridheight = 1;
		gbcBtn1.fill = GridBagConstraints.NONE;
		gbcBtn1.weightx = 0.1;
		gbcBtn1.weighty = 0.0;
		gbcBtn1.anchor = GridBagConstraints.FIRST_LINE_END;
		frame.add(btn1, gbcBtn1);
		
		//"2" button
		btn2 = new Button("2");
		btn2.setSize(stdBtnDim);
		GridBagConstraints gbcBtn2 = new GridBagConstraints();
		gbcBtn2.gridx = 1;
		gbcBtn2.gridy = 3;
		gbcBtn2.gridwidth = 1;
		gbcBtn2.gridheight = 1;
		gbcBtn2.fill = GridBagConstraints.NONE;
		gbcBtn2.weightx = 0.0;
		gbcBtn2.weighty = 0.0;
		gbcBtn2.anchor = GridBagConstraints.FIRST_LINE_END;
		frame.add(btn2, gbcBtn2);		
		
		//"3" button
		btn3 = new Button("3");
		btn3.setSize(stdBtnDim);
		GridBagConstraints gbcBtn3 = new GridBagConstraints();
		gbcBtn3.gridx = 2;
		gbcBtn3.gridy = 3;
		gbcBtn3.gridwidth = 1;
		gbcBtn3.gridheight = 1;
		gbcBtn3.fill = GridBagConstraints.NONE;
		gbcBtn3.weightx = 0.0;
		gbcBtn3.weighty = 0.0;
		gbcBtn3.anchor = GridBagConstraints.FIRST_LINE_END;
		frame.add(btn3, gbcBtn3);
		
		//"*" button
		btnMultipl = new Button("*");
		btnMultipl.setSize(stdBtnDim);
		GridBagConstraints gbcBtnMultipl = new GridBagConstraints();
		gbcBtnMultipl.gridx = 3;
		gbcBtnMultipl.gridy = 3;
		gbcBtnMultipl.gridwidth = 1;
		gbcBtnMultipl.gridheight = 1;
		gbcBtnMultipl.fill = GridBagConstraints.NONE;
		gbcBtnMultipl.weightx = 0.0;
		gbcBtnMultipl.weighty = 0.0;
		gbcBtnMultipl.anchor = GridBagConstraints.FIRST_LINE_END;
		frame.add(btnMultipl, gbcBtnMultipl);
		
		//"0" button
		btn0 = new Button("0");
		btn0.setSize(stdBtnDim);
		GridBagConstraints gbcBtn0 = new GridBagConstraints();
		gbcBtn0.gridx = 0;
		gbcBtn0.gridy = 4;
		gbcBtn0.gridwidth = 1;
		gbcBtn0.gridheight = 1;
		gbcBtn0.fill = GridBagConstraints.NONE;
		gbcBtn0.weightx = 0.1;
		gbcBtn0.weighty = 0.5;
		gbcBtn0.anchor = GridBagConstraints.FIRST_LINE_END;
		frame.add(btn0, gbcBtn0);
		
		//"." button
		btnComma = new Button(",");
		btnComma.setSize(stdBtnDim);
		GridBagConstraints gbcBtnComma = new GridBagConstraints();
		gbcBtnComma.gridx = 1;
		gbcBtnComma.gridy = 4;
		gbcBtnComma.gridwidth = 1;
		gbcBtnComma.gridheight = 1;
		gbcBtnComma.fill = GridBagConstraints.NONE;
		gbcBtnComma.weightx = 0.0;
		gbcBtnComma.weighty = 0.5;
		gbcBtnComma.anchor = GridBagConstraints.FIRST_LINE_END;
		frame.add(btnComma, gbcBtnComma);
		
		//"/" button
		btnDivision = new Button("/");
		btnDivision.setSize(stdBtnDim);
		GridBagConstraints gbcBtnDivision = new GridBagConstraints();
		gbcBtnDivision.gridx = 2;
		gbcBtnDivision.gridy = 4;
		gbcBtnDivision.gridwidth = 1;
		gbcBtnDivision.gridheight = 1;
		gbcBtnDivision.fill = GridBagConstraints.NONE;
		gbcBtnDivision.weightx = 0.0;
		gbcBtnDivision.weighty = 0.5;
		gbcBtnDivision.anchor = GridBagConstraints.FIRST_LINE_END;
		frame.add(btnDivision, gbcBtnDivision);
		
		//"=" button
		btnCalc = new Button("=");
		btnCalc.setSize(stdBtnDim);
		GridBagConstraints gbcBtnCalc = new GridBagConstraints();
		gbcBtnCalc.gridx = 3;
		gbcBtnCalc.gridy = 4;
		gbcBtnCalc.gridwidth = 1;
		gbcBtnCalc.gridheight = 1;
		gbcBtnCalc.fill = GridBagConstraints.NONE;
		gbcBtnCalc.weightx = 0.0;
		gbcBtnCalc.weighty = 0.5;
		gbcBtnCalc.anchor = GridBagConstraints.FIRST_LINE_END;
		frame.add(btnCalc, gbcBtnCalc);
	}
}
