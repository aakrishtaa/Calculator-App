// AAKRISHTAA'S CODE//

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {
	
	double number, answer;
	int calculation;
	
	JFrame frame;
	JLabel label = new JLabel();
	JTextField textField = new JTextField();
	JRadioButton onRadio = new JRadioButton("on");
	JRadioButton offRadio = new JRadioButton("off");
	JButton button0 = new JButton("0");
	JButton button1 = new JButton("1");
	JButton button2 = new JButton("2");
	JButton button3 = new JButton("3");
	JButton button4 = new JButton("4");
	JButton button5 = new JButton("5");
	JButton button6 = new JButton("6");
	JButton button7 = new JButton("7");
	JButton button8 = new JButton("8");
	JButton button9 = new JButton("9");
	JButton buttonDot = new JButton(".");
	JButton buttonC = new JButton("C");
	JButton buttonDel = new JButton("DEL");
	JButton buttonEqual = new JButton("=");
	JButton buttonMult = new JButton("x");
	JButton buttonDiv = new JButton("/");
	JButton buttonAdd = new JButton("+");
	JButton buttonMinus = new JButton("-");
	JButton buttonSquare = new JButton("x**2");
	JButton buttonReciprocal = new JButton("1/x");
	JButton buttonSqrt = new JButton("√");
	JButton buttonCube = new JButton("x**3")
	;
	
	Calculator(){
		prepareGUI();
		addComponents();
		addActionEvent();
		
	}
	
	public void prepareGUI() {
		
		frame = new JFrame();
		frame.setTitle("Calculator App");
		frame.setSize(300,490);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground(Color.black);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public void addComponents () {
		label.setBounds (250,0,50,50);
		label.setForeground(Color.white);
		frame.add(label);
		
		textField.setBounds(10, 40, 270, 40);
		textField.setFont(new Font ("Arial", Font.BOLD, 20));
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		frame.add(textField);
		
		onRadio.setBounds(10, 95, 60, 40);
		onRadio.setSelected(true);
		onRadio.setFont(new Font("Arial", Font.BOLD, 14));
		onRadio.setBackground(Color.black);	
		onRadio.setForeground(Color.white);
		frame.add(onRadio);
		
		offRadio.setBounds(10, 120, 60, 40);
		offRadio.setSelected(true);
		offRadio.setFont(new Font("Arial", Font.BOLD, 14));
		offRadio.setBackground(Color.black);	
		offRadio.setForeground(Color.white);
		frame.add(offRadio);
	
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(onRadio);
		buttonGroup.add(offRadio);
		
		button7.setBounds(10, 230, 60, 40);
		button7.setFont(new Font("Arial", Font.BOLD, 20));
		frame.add(button7);
		
		button8.setBounds(80, 230, 60, 40);
		button8.setFont(new Font("Arial", Font.BOLD, 20));
		frame.add(button8);
		
		button9.setBounds(150, 230, 60, 40);
		button9.setFont(new Font("Arial", Font.BOLD, 20));
		frame.add(button9);
		
		button4.setBounds(10, 290, 60, 40);
		button4.setFont(new Font("Arial", Font.BOLD, 20));
		frame.add(button4);
		
		button5.setBounds(80, 290, 60, 40);
		button5.setFont(new Font("Arial", Font.BOLD, 20));
		frame.add(button5);
	
		button6.setBounds(150, 290, 60, 40);
		button6.setFont(new Font("Arial", Font.BOLD, 20));
		frame.add(button6);
		
		button1.setBounds(10, 350, 60, 40);
		button1.setFont(new Font("Arial", Font.BOLD, 20));
		frame.add(button1);
		
		button2.setBounds(80, 350, 60, 40);
		button2.setFont(new Font("Arial", Font.BOLD, 20));
		frame.add(button2);
		
		button3.setBounds(150, 350, 60, 40);
		button3.setFont(new Font("Arial", Font.BOLD, 20));
		frame.add(button3);
		
		button7.setBounds(10, 230, 60, 40);
		button7.setFont(new Font("Arial", Font.BOLD, 20));
		frame.add(button7);
		
		buttonDot.setBounds(150, 410, 60, 40);
		buttonDot.setFont(new Font("Arial", Font.BOLD, 20));
		frame.add(buttonDot);
		
		button0.setBounds(10, 410, 70, 40);
		button0.setFont(new Font("Arial", Font.BOLD, 20));
		frame.add(button0);
		
		buttonEqual.setBounds(220, 350, 60, 100);
		buttonEqual.setFont(new Font("Arial", Font.BOLD, 20));
		buttonEqual.setBackground(new Color(239,188,2));
		frame.add(buttonEqual);
		
		buttonDiv.setBounds(220, 110, 60, 40);
		buttonDiv.setFont(new Font("Arial", Font.BOLD, 20));
		buttonDiv.setBackground(new Color(239,188,2));
		frame.add(buttonDiv);
		
		buttonSqrt.setBounds(10, 170, 60, 40);
		buttonSqrt.setFont(new Font("Arial", Font.BOLD, 20));
		frame.add(buttonSqrt);
		
		buttonMult.setBounds(220, 230, 60, 40);
		buttonMult.setFont(new Font("Arial", Font.BOLD, 20));
		buttonMult.setBackground(new Color(239,188,2));
		frame.add(buttonMult);
		
		buttonMinus.setBounds(220,170,60,40);
		buttonMinus.setFont(new Font("Arial", Font.BOLD, 20));
		buttonMinus.setBackground(new Color(239,188,2));
		frame.add(buttonMinus);
		
		buttonAdd.setBounds(220, 290, 60, 40);
		buttonAdd.setFont(new Font("Arial", Font.BOLD, 20));
		buttonAdd.setBackground(new Color(239,188,2));
		frame.add(buttonAdd);
		
		buttonSquare.setBounds(80, 170, 60, 40);
		buttonSquare.setFont(new Font("Arial", Font.BOLD, 20));
		frame.add(buttonSquare);
		
		buttonReciprocal.setBounds(150, 170, 60, 40);
		buttonReciprocal.setFont(new Font("Arial", Font.BOLD, 20));
		frame.add(buttonReciprocal);
		
		buttonDel.setBounds(150, 110, 60, 40);
		buttonDel.setFont(new Font("Arial", Font.BOLD, 20));
		buttonDel.setBackground(Color.red);
		buttonDel.setForeground(Color.black);
		frame.add(buttonDel);
		
		buttonC.setBounds(80, 110, 60, 40);
		buttonC.setFont(new Font("Arial", Font.BOLD, 20));
		buttonC.setBackground(new Color(239,188,2));
		frame.add(buttonC);
		
		buttonCube.setBounds(80,410,60,40);
		buttonCube.setFont(new Font("Arial", Font.BOLD, 20));
		buttonMinus.setBackground(new Color(239,188,2));
		frame.add(buttonCube);
	
	}
	
	public void addActionEvent() {
		
		onRadio.addActionListener(this);
		offRadio.addActionListener(this);
		buttonC.addActionListener(this);
		buttonDel.addActionListener(this);
		buttonDiv.addActionListener(this);
		buttonSqrt.addActionListener(this);
		buttonSquare.addActionListener(this);
		buttonReciprocal.addActionListener(this);
		buttonMinus.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		buttonMult.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		buttonAdd.addActionListener(this);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		buttonEqual.addActionListener(this);
		button0.addActionListener(this);
		buttonDot.addActionListener(this);
		buttonCube.addActionListener(this);
		
	
	}
	
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if (source == onRadio) {
			enable();
		} else if (source == offRadio) {
			disable();
			
		} else if (source == buttonC) {
			label.setText("");
			textField.setText("");
			
		} else if (source == buttonDel) {
			int length = textField.getText().length();
			int number = length - 1;
			
			if (length > 0) {
				StringBuilder back = new StringBuilder(textField.getText());
				back.deleteCharAt(number);
				textField.setText(back.toString());
				
			}
			
			if (textField.getText().endsWith("")) {
				label.setText("");
			}
			
		} else if (source == button0) {
			if (textField.getText().equals("0")) {
				
				return;
			} else {
				textField.setText(textField.getText()+"0");
			}
		
		} else if (source == button1) {
			textField.setText(textField.getText()+"1");
		} else if (source == button2) {
			textField.setText(textField.getText()+"2");
		} else if (source == button3) {
			textField.setText(textField.getText()+"3");
		} else if (source == button4) {
			textField.setText(textField.getText()+"4");
		} else if (source == button5) {
			textField.setText(textField.getText()+"5");
		} else if (source == button6) {
			textField.setText(textField.getText()+"6");
		} else if (source == button7) {
			textField.setText(textField.getText()+"7");
		} else if (source == button8) {
			textField.setText(textField.getText()+"8");
		} else if (source == button9) {
			textField.setText(textField.getText()+"9");	
		
		} else if (source == buttonDot) {
			if (textField.getText().contains(".")) {
				return;
			} else {
				textField.setText(textField.getText()+".");
			}
			
		} else if (source == buttonAdd) {
			String Str = textField.getText();
			number = Double.parseDouble(textField.getText());
			textField.setText("");
			label.setText(Str + "+");
			calculation = 1;

		} else if (source == buttonMinus) {
			String Str = textField.getText();
			number = Double.parseDouble(textField.getText());
			textField.setText("");
			label.setText(Str + "-");
			calculation = 2;
			
		} else if (source == buttonMult) {
			String Str = textField.getText();
			number = Double.parseDouble(textField.getText());
			textField.setText("");
			label.setText(Str + "x");
			calculation = 3;
			
		} else if (source == buttonDiv) {
			String Str = textField.getText();
			number = Double.parseDouble(textField.getText());
			textField.setText("");
			label.setText(Str + "/");
			calculation = 4;
			
		} else if (source == buttonSqrt) {
			number = Double.parseDouble(textField.getText());
			Double sqrt = Math.sqrt(number);
			textField.setText(Double.toString(sqrt));
			
		} else if (source == buttonSquare) {
			String Str = textField.getText();
			number = Double.parseDouble(textField.getText());
			double square = Math.pow(number, 2);
			String string = Double.toString(square);
			if (string.endsWith(".0")) {
				textField.setText(string.replace(".0", ""));
			} else {
				textField.setText(string);
			}
		
			label.setText("sqr" + Str);
			
			
		} else if (source == buttonCube) {
			
			String Str = textField.getText();
			number = Double.parseDouble(textField.getText());
			double square = Math.pow(number, 3);
			String string = Double.toString(square);
			if (string.endsWith(".0")) {
				textField.setText(string.replace(".0", ""));
			} else {
				textField.setText(string);
			}
		
			label.setText("cube" + Str);
			
		
		} else if (source == buttonReciprocal) {
			
			number = Double.parseDouble(textField.getText());
			double reciprocal = 1/number;
			textField.setText("");
			String string = Double.toString(reciprocal);
			if (string.endsWith(".0")) {
				textField.setText(string.replace(".0", ""));
			} else {
				textField.setText(string);
			}
	
			
		} else if (source == buttonEqual) {
			switch (calculation) {
			
			
				case 1:
					answer = number + Double.parseDouble(textField.getText());
					if (Double.toString(answer).endsWith(".0")) {
						textField.setText(Double.toString(answer).replace(".0", ""));
					} else {
						textField.setText(Double.toString(answer));
					}
					label.setText("");
					break;
					
					
				case 2:
					answer = number - Double.parseDouble(textField.getText());
					if (Double.toString(answer).endsWith(".0")) {
						textField.setText(Double.toString(answer).replace(".0", ""));
					} else {
						textField.setText(Double.toString(answer));
					}
					label.setText("");
					break;
					
					
				case 3:
					answer = number * Double.parseDouble(textField.getText());
					if (Double.toString(answer).endsWith(".0")) {
						textField.setText(Double.toString(answer).replace(".0", ""));
					} else {
						textField.setText(Double.toString(answer));
					}
					label.setText("");
					break;
					
					
				case 4:
					answer = number / Double.parseDouble(textField.getText());
					if (Double.toString(answer).endsWith(".0")) {
						textField.setText(Double.toString(answer).replace(".0", ""));
					} else {
						textField.setText(Double.toString(answer));
					}
					label.setText("");
					break;
					
					
					
			}
		}
			
			
	}
	
	public void enable() {
		onRadio.setEnabled(false);
		offRadio.setEnabled(true);
		textField.setEditable(true);
		offRadio.setEnabled(true);
		textField.setEditable(true);
		label.setEnabled(true);
		buttonC.setEnabled(true);
		buttonDiv.setEnabled(true);
		buttonMult.setEnabled(true);
		buttonDel.setEnabled(true);
		buttonSquare.setEnabled(true);
		buttonSqrt.setEnabled(true);
		buttonReciprocal.setEnabled(true);
		buttonMinus.setEnabled(true);
		button0.setEnabled(true);
		button1.setEnabled(true);
		button2.setEnabled(true);
		button3.setEnabled(true);
		button4.setEnabled(true);
		button5.setEnabled(true);
		button6.setEnabled(true);
		button7.setEnabled(true);
		button8.setEnabled(true);
		button9.setEnabled(true);
		buttonAdd.setEnabled(true);
		buttonEqual.setEnabled(true);
		buttonDot.setEnabled(true);
		buttonCube.setEnabled(true);

	}
	
	
	public void disable() {
		onRadio.setEnabled(true);
		offRadio.setEnabled(false);
		textField.setEditable(false);
		offRadio.setEnabled(false);
		textField.setEditable(false);
		label.setEnabled(false);
		buttonC.setEnabled(false);
		buttonDiv.setEnabled(false);
		buttonMult.setEnabled(false);
		buttonDel.setEnabled(false);
		buttonSquare.setEnabled(false);
		buttonSqrt.setEnabled(false);
		buttonReciprocal.setEnabled(false);
		buttonMinus.setEnabled(false);
		button0.setEnabled(false);
		button1.setEnabled(false);
		button2.setEnabled(false);
		button3.setEnabled(false);
		button4.setEnabled(false);
		button5.setEnabled(false);
		button6.setEnabled(false);
		button7.setEnabled(false);
		button8.setEnabled(false);
		button9.setEnabled(false);
		buttonAdd.setEnabled(false);
		buttonEqual.setEnabled(false);
		buttonDot.setEnabled(false);
		buttonCube.setEnabled(false);

	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub...
		
		new Calculator();
	}
}

// AAKRISHTAA'S CODE //
