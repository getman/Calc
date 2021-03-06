package getman.calc;

import java.awt.Button;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

/**@author ParfyonovArtem
 * @version 1.0
 * @since 12-08-2014*/

/**represents main window of the calculator app*/
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
	
	private UserInputScanner userIntput = new UserInputScanner();
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
		setupListeners();
		
		mainFrame.pack();
		mainFrame.setVisible(true);
	}
	
	/**Creates all components on the frame*/
	private void createControls(JFrame frame){
		//creating layout manager
		GridBagLayout gbl = new GridBagLayout();
		frame.setLayout(gbl);
		
		//standart button dimension
		Dimension stdBtnDim = new Dimension(40, 40);
		
		//calc screen
		calcScreen = new TextArea();
		calcScreen.setPreferredSize(new Dimension(100, 100));
		GridBagConstraints gbcCalsScreen = new GridBagConstraints();
		gbcCalsScreen.gridx = 0;
		gbcCalsScreen.gridy = 0;
		gbcCalsScreen.gridwidth = 4;
		gbcCalsScreen.gridheight = 1;
		gbcCalsScreen.fill = GridBagConstraints.HORIZONTAL;
		gbcCalsScreen.weightx = 0.1;
		gbcCalsScreen.weighty = 0.0;
//		gbcCalsScreen.ipadx = 10;
//		gbcCalsScreen.ipady = 10;
		gbcCalsScreen.anchor = GridBagConstraints.NORTHWEST;
		frame.add(calcScreen, gbcCalsScreen);
		
		//"7" button
		btn7 = new Button("7");
//		btn7.setSize(stdBtnDim);
		btn7.setPreferredSize(stdBtnDim);
		GridBagConstraints gbcBtn7 = new GridBagConstraints();
		gbcBtn7.gridx = 0;
		gbcBtn7.gridy = 1;
		gbcBtn7.gridwidth = 1;
		gbcBtn7.gridheight = 1;
		gbcBtn7.fill = GridBagConstraints.NONE;
		gbcBtn7.weightx = 0.1;
		gbcBtn7.weighty = 0.0;
//		gbcBtn7.ipadx = 10;
//		gbcBtn7.ipady = 10;
		gbcBtn7.anchor = GridBagConstraints.NORTHEAST;
		frame.add(btn7, gbcBtn7);
		
		//"8" button
		btn8 = new Button("8");
		btn8.setPreferredSize(stdBtnDim);
		GridBagConstraints gbcBtn8 = new GridBagConstraints();
		gbcBtn8.gridx = 1;
		gbcBtn8.gridy = 1;
		gbcBtn8.gridwidth = 1;
		gbcBtn8.gridheight = 1;
		gbcBtn8.fill = GridBagConstraints.NONE;
		gbcBtn8.weightx = 0.0;
		gbcBtn8.weighty = 0.0;
//		gbcBtn8.ipadx = 10;
//		gbcBtn8.ipady = 10;
		gbcBtn8.anchor = GridBagConstraints.NORTHEAST;
		frame.add(btn8, gbcBtn8);
		
		//"9" button
		btn9 = new Button("9");
		btn9.setPreferredSize(stdBtnDim);
		GridBagConstraints gbcBtn9 = new GridBagConstraints();
		gbcBtn9.gridx = 2;
		gbcBtn9.gridy = 1;
		gbcBtn9.gridwidth = 1;
		gbcBtn9.gridheight = 1;
		gbcBtn9.fill = GridBagConstraints.NONE;
		gbcBtn9.weightx = 0.0;
		gbcBtn9.weighty = 0.0;
//		gbcBtn9.ipadx = 10;
//		gbcBtn9.ipady = 10;
		gbcBtn9.anchor = GridBagConstraints.NORTHEAST;
		frame.add(btn9, gbcBtn9);
		
		//"+" button
		btnPlus = new Button("+");
		btnPlus.setPreferredSize(stdBtnDim);
		GridBagConstraints gbcBtnPlus = new GridBagConstraints();
		gbcBtnPlus.gridx = 3;
		gbcBtnPlus.gridy = 1;
		gbcBtnPlus.gridwidth = 1;
		gbcBtnPlus.gridheight = 1;
		gbcBtnPlus.fill = GridBagConstraints.NONE;
		gbcBtnPlus.weightx = 0.0;
		gbcBtnPlus.weighty = 0.0;
//		gbcBtnPlus.ipadx = 10;
//		gbcBtnPlus.ipady = 10;
		gbcBtnPlus.anchor = GridBagConstraints.NORTHEAST;
		frame.add(btnPlus, gbcBtnPlus);
		
		//"4" button
		btn4 = new Button("4");
		btn4.setPreferredSize(stdBtnDim);
		GridBagConstraints gbcBtn4 = new GridBagConstraints();
		gbcBtn4.gridx = 0;
		gbcBtn4.gridy = 2;
		gbcBtn4.gridwidth = 1;
		gbcBtn4.gridheight = 1;
		gbcBtn4.fill = GridBagConstraints.NONE;
		gbcBtn4.weightx = 0.1;
		gbcBtn4.weighty = 0.0;
//		gbcBtn4.ipadx = 10;
//		gbcBtn4.ipady = 10;
		gbcBtn4.anchor = GridBagConstraints.NORTHEAST;
		frame.add(btn4, gbcBtn4);
		
		//"5" button
		btn5 = new Button("5");
		btn5.setPreferredSize(stdBtnDim);
		GridBagConstraints gbcBtn5 = new GridBagConstraints();
		gbcBtn5.gridx = 1;
		gbcBtn5.gridy = 2;
		gbcBtn5.gridwidth = 1;
		gbcBtn5.gridheight = 1;
		gbcBtn5.fill = GridBagConstraints.NONE;
		gbcBtn5.weightx = 0.0;
		gbcBtn5.weighty = 0.0;
//		gbcBtn5.ipadx = 10;
//		gbcBtn5.ipady = 10;
		gbcBtn5.anchor = GridBagConstraints.NORTHEAST;
		frame.add(btn5, gbcBtn5);
		
		//"6" button
		btn6 = new Button("6");
		btn6.setPreferredSize(stdBtnDim);
		GridBagConstraints gbcBtn6 = new GridBagConstraints();
		gbcBtn6.gridx = 2;
		gbcBtn6.gridy = 2;
		gbcBtn6.gridwidth = 1;
		gbcBtn6.gridheight = 1;
		gbcBtn6.fill = GridBagConstraints.NONE;
		gbcBtn6.weightx = 0.0;
		gbcBtn6.weighty = 0.0;
//		gbcBtn6.ipadx = 10;
//		gbcBtn6.ipady = 10;
		gbcBtn6.anchor = GridBagConstraints.NORTHEAST;
		frame.add(btn6, gbcBtn6);
		
		//"-" button
		btnMinus = new Button("-");
		btnMinus.setPreferredSize(stdBtnDim);
		GridBagConstraints gbcBtnMinus = new GridBagConstraints();
		gbcBtnMinus.gridx = 3;
		gbcBtnMinus.gridy = 2;
		gbcBtnMinus.gridwidth = 1;
		gbcBtnMinus.gridheight = 1;
		gbcBtnMinus.fill = GridBagConstraints.NONE;
		gbcBtnMinus.weightx = 0.0;
		gbcBtnMinus.weighty = 0.0;
//		gbcBtnMinus.ipadx = 10;
//		gbcBtnMinus.ipady = 10;
		gbcBtnMinus.anchor = GridBagConstraints.NORTHEAST;
		frame.add(btnMinus, gbcBtnMinus);
		
		//"1" button
		btn1 = new Button("1");
		btn1.setPreferredSize(stdBtnDim);
		GridBagConstraints gbcBtn1 = new GridBagConstraints();
		gbcBtn1.gridx = 0;
		gbcBtn1.gridy = 3;
		gbcBtn1.gridwidth = 1;
		gbcBtn1.gridheight = 1;
		gbcBtn1.fill = GridBagConstraints.NONE;
		gbcBtn1.weightx = 0.1;
		gbcBtn1.weighty = 0.0;
//		gbcBtn1.ipadx = 10;
//		gbcBtn1.ipady = 10;
		gbcBtn1.anchor = GridBagConstraints.NORTHEAST;
		frame.add(btn1, gbcBtn1);
		
		//"2" button
		btn2 = new Button("2");
		btn2.setPreferredSize(stdBtnDim);
		GridBagConstraints gbcBtn2 = new GridBagConstraints();
		gbcBtn2.gridx = 1;
		gbcBtn2.gridy = 3;
		gbcBtn2.gridwidth = 1;
		gbcBtn2.gridheight = 1;
		gbcBtn2.fill = GridBagConstraints.NONE;
		gbcBtn2.weightx = 0.0;
		gbcBtn2.weighty = 0.0;
//		gbcBtn2.ipadx = 10;
//		gbcBtn2.ipady = 10;
		gbcBtn2.anchor = GridBagConstraints.NORTHEAST;
		frame.add(btn2, gbcBtn2);		
		
		//"3" button
		btn3 = new Button("3");
		btn3.setPreferredSize(stdBtnDim);
		GridBagConstraints gbcBtn3 = new GridBagConstraints();
		gbcBtn3.gridx = 2;
		gbcBtn3.gridy = 3;
		gbcBtn3.gridwidth = 1;
		gbcBtn3.gridheight = 1;
		gbcBtn3.fill = GridBagConstraints.NONE;
		gbcBtn3.weightx = 0.0;
		gbcBtn3.weighty = 0.0;
//		gbcBtn3.ipadx = 10;
//		gbcBtn3.ipady = 10;
		gbcBtn3.anchor = GridBagConstraints.NORTHEAST;
		frame.add(btn3, gbcBtn3);
		
		//"*" button
		btnMultipl = new Button("*");
		btnMultipl.setPreferredSize(stdBtnDim);
		GridBagConstraints gbcBtnMultipl = new GridBagConstraints();
		gbcBtnMultipl.gridx = 3;
		gbcBtnMultipl.gridy = 3;
		gbcBtnMultipl.gridwidth = 1;
		gbcBtnMultipl.gridheight = 1;
		gbcBtnMultipl.fill = GridBagConstraints.NONE;
		gbcBtnMultipl.weightx = 0.0;
		gbcBtnMultipl.weighty = 0.0;
//		gbcBtnMultipl.ipadx = 10;
//		gbcBtnMultipl.ipady = 10;
		gbcBtnMultipl.anchor = GridBagConstraints.NORTHEAST;
		frame.add(btnMultipl, gbcBtnMultipl);
		
		//"0" button
		btn0 = new Button("0");
		btn0.setPreferredSize(stdBtnDim);
		GridBagConstraints gbcBtn0 = new GridBagConstraints();
		gbcBtn0.gridx = 0;
		gbcBtn0.gridy = 4;
		gbcBtn0.gridwidth = 1;
		gbcBtn0.gridheight = 1;
		gbcBtn0.fill = GridBagConstraints.NONE;
		gbcBtn0.weightx = 0.1;
		gbcBtn0.weighty = 0.1;
//		gbcBtn0.ipadx = 10;
//		gbcBtn0.ipady = 10;
		gbcBtn0.anchor = GridBagConstraints.NORTHEAST;
		frame.add(btn0, gbcBtn0);
		
		//"." button
		btnComma = new Button(",");
		btnComma.setPreferredSize(stdBtnDim);
		GridBagConstraints gbcBtnComma = new GridBagConstraints();
		gbcBtnComma.gridx = 1;
		gbcBtnComma.gridy = 4;
		gbcBtnComma.gridwidth = 1;
		gbcBtnComma.gridheight = 1;
		gbcBtnComma.fill = GridBagConstraints.NONE;
		gbcBtnComma.weightx = 0.0;
		gbcBtnComma.weighty = 0.1;
//		gbcBtnComma.ipadx = 10;
//		gbcBtnComma.ipady = 10;
		gbcBtnComma.anchor = GridBagConstraints.NORTHEAST;
		frame.add(btnComma, gbcBtnComma);
		
		//"/" button
		btnDivision = new Button("/");
		btnDivision.setPreferredSize(stdBtnDim);
		GridBagConstraints gbcBtnDivision = new GridBagConstraints();
		gbcBtnDivision.gridx = 2;
		gbcBtnDivision.gridy = 4;
		gbcBtnDivision.gridwidth = 1;
		gbcBtnDivision.gridheight = 1;
		gbcBtnDivision.fill = GridBagConstraints.NONE;
		gbcBtnDivision.weightx = 0.0;
		gbcBtnDivision.weighty = 0.1;
//		gbcBtnDivision.ipadx = 10;
//		gbcBtnDivision.ipady = 10;
		gbcBtnDivision.anchor = GridBagConstraints.NORTHEAST;
		frame.add(btnDivision, gbcBtnDivision);
		
		//"=" button
		btnCalc = new Button("=");
		btnCalc.setPreferredSize(stdBtnDim);
		GridBagConstraints gbcBtnCalc = new GridBagConstraints();
		gbcBtnCalc.gridx = 3;
		gbcBtnCalc.gridy = 4;
		gbcBtnCalc.gridwidth = 1;
		gbcBtnCalc.gridheight = 1;
		gbcBtnCalc.fill = GridBagConstraints.NONE;
		gbcBtnCalc.weightx = 0.0;
		gbcBtnCalc.weighty = 0.1;
//		gbcBtnCalc.ipadx = 10;
//		gbcBtnCalc.ipady = 10;
		gbcBtnCalc.anchor = GridBagConstraints.NORTHEAST;
		frame.add(btnCalc, gbcBtnCalc);
	}
	
	/**set up button listeners*/
	private void setupListeners(){
		btn0.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				calcScreen.append("0");
			}
		});
		
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				calcScreen.append("1");
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				calcScreen.append("2");
			}
		});
		
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				calcScreen.append("3");
			}
		});
		
		btn4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				calcScreen.append("4");
			}
		});
		
		btn5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				calcScreen.append("5");
			}
		});
		
		btn6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				calcScreen.append("6");
			}
		});
		
		btn7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				calcScreen.append("7");
			}
		});
		
		btn8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				calcScreen.append("8");
			}
		});
		
		btn9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				calcScreen.append("9");
			}
		});
		
		btnPlus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				calcScreen.append("+");
			}
		});
		
		btnMinus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				calcScreen.append("-");
			}
		});
		
		btnMultipl.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				calcScreen.append("*");
			}
		});
		
		btnDivision.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				calcScreen.append("/");
			}
		});
		
		btnComma.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				calcScreen.append(".");
			}
		});
		
		btnCalc.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				calcScreen.append("=");
			}
		});
		
		calcScreen.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
//				System.out.println(e.getKeyChar() + " pressed");
				filterKeys(e);
			}

			@Override
			public void keyReleased(KeyEvent e) {
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
			}
		});
	}
	
	/**provides filtering for user input*/
	private void filterKeys(KeyEvent e){
		String key = String.valueOf(e.getKeyChar() );
		int intKey = e.getKeyChar();
//		System.out.print(key + "/" + intkey + " ");
		if (key.equals("0") || 
			key.equals("1") ||
			key.equals("2") ||
			key.equals("3") ||
			key.equals("4") ||
			key.equals("5") ||
			key.equals("6") ||
			key.equals("7") ||
			key.equals("8") ||
			key.equals("9") ||
			key.equals(".") ||
			key.equals("+") ||
			key.equals("-") ||
			key.equals("=") ||
			key.equals("/") ||
			key.equals("*") ||
			(intKey == 8) /**backspace*/
			){
			//ok, can be typed
			userIntput.receiveKey(e);
			if (userIntput.isPerformedCalc() ){
				calcScreen.append("=\n" + userIntput.claimAnswer() );
				e.consume();
			}
		} else {
			e.consume();
		}
		
	}
	
}
