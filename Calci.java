import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Calci {

	private JFrame frame;
	private JTextField textField;
	
	double firstNum;
	double secondNum;
	double result;
	String operation;
	String answer;
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calci window = new Calci();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Calci() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 402, 544);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("  Scientific Calculator ");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 39));
		lblNewLabel.setBounds(10, 11, 371, 34);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(10, 43, 364, 49);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("sqrt");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(18, 129, 61, 49);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("1/X");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=1/(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1.setBounds(18, 180, 61, 49);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("X^Y");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="X^Y";
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1_1.setBounds(18, 231, 61, 49);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("X^3");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=(Double.parseDouble(textField.getText()));
				a=a*a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1_1_1.setBounds(18, 282, 61, 49);
		frame.getContentPane().add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("X^2");
		btnNewButton_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=(Double.parseDouble(textField.getText()));
				a=a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1_1_1_1.setBounds(18, 333, 61, 49);
		frame.getContentPane().add(btnNewButton_1_1_1_1);
		
		JButton btnNewButton_1_1_1_1_1 = new JButton("n!");
		btnNewButton_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(textField.getText());
				double fact=1;
				while(a!=0) {
					fact=fact*a;
					a--;
				}
				textField.setText("");
				textField.setText(textField.getText()+fact);
			}
		});
		btnNewButton_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_1_1_1_1.setBounds(18, 384, 61, 49);
		frame.getContentPane().add(btnNewButton_1_1_1_1_1);
		
		JButton btnPlusMinus = new JButton("+/-");
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(String.valueOf(textField.getText()));
				a=a*(-1);
				textField.setText(String.valueOf(a));
			}
		});
		btnPlusMinus.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnPlusMinus.setBounds(18, 435, 61, 49);
		frame.getContentPane().add(btnPlusMinus);
		
		JButton btnEx = new JButton("e^x");
		btnEx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnEx.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnEx.setBounds(89, 129, 61, 49);
		frame.getContentPane().add(btnEx);
		
		JButton btnNewButton_1_2 = new JButton("Log");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1_2.setBounds(89, 180, 61, 49);
		frame.getContentPane().add(btnNewButton_1_2);
		
		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnPercent.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPercent.setBounds(89, 231, 61, 49);
		frame.getContentPane().add(btnPercent);
		
		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+button7.getText();
				textField.setText(number);
			}
		});
		button7.setFont(new Font("Tahoma", Font.BOLD, 20));
		button7.setBounds(89, 282, 61, 49);
		frame.getContentPane().add(button7);
		
		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+button4.getText();
				textField.setText(number);
			}
		});
		button4.setFont(new Font("Tahoma", Font.BOLD, 20));
		button4.setBounds(89, 333, 61, 49);
		frame.getContentPane().add(button4);
		
		JButton button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+button1.getText();
				textField.setText(number);
			}
		});
		button1.setFont(new Font("Tahoma", Font.BOLD, 20));
		button1.setBounds(89, 384, 61, 49);
		frame.getContentPane().add(button1);
		
		JButton btnNewButton_2_1 = new JButton("Sin");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
				
			}
		});
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_2_1.setBounds(160, 129, 61, 49);
		frame.getContentPane().add(btnNewButton_2_1);
		
		JButton btnNewButton_1_2_1 = new JButton("Sinh");
		btnNewButton_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1_2_1.setBounds(160, 180, 61, 49);
		frame.getContentPane().add(btnNewButton_1_2_1);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnClear.setBounds(160, 231, 61, 49);
		frame.getContentPane().add(btnClear);
		
		JButton button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+button8.getText();
				textField.setText(number);
			}
		});
		button8.setFont(new Font("Tahoma", Font.BOLD, 20));
		button8.setBounds(160, 282, 61, 49);
		frame.getContentPane().add(button8);
		
		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+button5.getText();
				textField.setText(number);
			}
		});
		button5.setFont(new Font("Tahoma", Font.BOLD, 20));
		button5.setBounds(160, 333, 61, 49);
		frame.getContentPane().add(button5);
		
		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+button2.getText();
				textField.setText(number);
			}
		});
		button2.setFont(new Font("Tahoma", Font.BOLD, 20));
		button2.setBounds(160, 384, 61, 49);
		frame.getContentPane().add(button2);
		
		JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+button0.getText();
				textField.setText(number);
			}
		});
		button0.setFont(new Font("Tahoma", Font.BOLD, 16));
		button0.setBounds(89, 435, 132, 49);
		frame.getContentPane().add(button0);
		
		JButton btnNewButton_2_1_1 = new JButton("Cos");
		btnNewButton_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_2_1_1.setBounds(231, 129, 61, 49);
		frame.getContentPane().add(btnNewButton_2_1_1);
		
		JButton btnNewButton_1_2_1_1 = new JButton("Cosh");
		btnNewButton_1_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton_1_2_1_1.setBounds(231, 180, 61, 49);
		frame.getContentPane().add(btnNewButton_1_2_1_1);
		
		JButton btnBack = new JButton("\uF0E7");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				
				if(textField.getText().length()>0) {
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace=str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnBack.setFont(new Font("Wingdings", Font.PLAIN, 20));
		btnBack.setBounds(231, 231, 61, 49);
		frame.getContentPane().add(btnBack);
		
		JButton button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+button9.getText();
				textField.setText(number);
			}
		});
		button9.setFont(new Font("Tahoma", Font.BOLD, 20));
		button9.setBounds(231, 282, 61, 49);
		frame.getContentPane().add(button9);
		
		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+button6.getText();
				textField.setText(number);
			}
		});
		button6.setFont(new Font("Tahoma", Font.BOLD, 20));
		button6.setBounds(231, 333, 61, 49);
		frame.getContentPane().add(button6);
		
		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+button3.getText();
				textField.setText(number);
			}
		});
		button3.setFont(new Font("Tahoma", Font.BOLD, 20));
		button3.setBounds(231, 384, 61, 49);
		frame.getContentPane().add(button3);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDot.setBounds(231, 435, 61, 49);
		frame.getContentPane().add(btnDot);
		
		JButton btnNewButton_2_1_1_1 = new JButton("Tan");
		btnNewButton_2_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_2_1_1_1.setBounds(302, 129, 61, 49);
		frame.getContentPane().add(btnNewButton_2_1_1_1);
		
		JButton btnNewButton_1_2_1_1_1 = new JButton("Tanh");
		btnNewButton_1_2_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_1_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton_1_2_1_1_1.setBounds(302, 180, 61, 49);
		frame.getContentPane().add(btnNewButton_1_2_1_1_1);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAdd.setBounds(302, 231, 61, 49);
		frame.getContentPane().add(btnAdd);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSub.setBounds(302, 282, 61, 49);
		frame.getContentPane().add(btnSub);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDivide.setBounds(302, 384, 61, 49);
		frame.getContentPane().add(btnDivide);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnMul.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnMul.setBounds(302, 333, 61, 49);
		frame.getContentPane().add(btnMul);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondNum=Double.parseDouble(textField.getText());
				if(operation=="+") {
					result=firstNum+secondNum;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="-") {
					result=firstNum-secondNum;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="*") {
					result=firstNum*secondNum;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="/") {
					result=firstNum/secondNum;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				if(operation=="%") {
					result=firstNum%secondNum;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="X^Y") {
						double result=1;
						for(int i=0;i<secondNum;i++)
						{
							result=firstNum*result;
						}
						answer=String.format("%.2f", result);
						textField.setText(answer);
						
				}
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEqual.setBounds(302, 433, 61, 49);
		frame.getContentPane().add(btnEqual);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setText("");
		formattedTextField.setBounds(122, 144, 7, 20);
		frame.getContentPane().add(formattedTextField);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("ON");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button1.setEnabled(true);
				button0.setEnabled(true);
				button2.setEnabled(true);
				button3.setEnabled(true);
				button4.setEnabled(true);
				button5.setEnabled(true);
				button6.setEnabled(true);
				button7.setEnabled(true);
				button8.setEnabled(true);
				button9.setEnabled(true);
				btnDot.setEnabled(true);
				btnAdd.setEnabled(true);
				btnMul.setEnabled(true);
				btnDivide.setEnabled(true);
				btnPercent.setEnabled(true);
				btnSub.setEnabled(true);
				btnBack.setEnabled(true);
				btnClear.setEnabled(true);
				btnNewButton.setEnabled(true);
				btnEx.setEnabled(true);
				btnNewButton_2_1.setEnabled(true);
				btnNewButton_2_1_1.setEnabled(true);
				btnNewButton_2_1_1_1.setEnabled(true);
				btnNewButton_1.setEnabled(true);
				btnNewButton_1_2.setEnabled(true);
				btnNewButton_1_2_1.setEnabled(true);
				btnNewButton_1_2_1_1_1.setEnabled(true);
				btnNewButton_1_1.setEnabled(true);
				btnNewButton_1_1_1.setEnabled(true);
				btnNewButton_1_1_1_1.setEnabled(true);
				btnNewButton_1_1_1_1_1.setEnabled(true);
				btnPlusMinus.setEnabled(true);
				btnNewButton_1_2_1_1.setEnabled(true);
				btnEqual.setEnabled(true);
				textField.setEnabled(true);
			}
		});
		buttonGroup_2.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(22, 99, 61, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("OFF");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				button1.setEnabled(false);
				button0.setEnabled(false);
				button2.setEnabled(false);
				button3.setEnabled(false);
				button4.setEnabled(false);
				button5.setEnabled(false);
				button6.setEnabled(false);
				button7.setEnabled(false);
				button8.setEnabled(false);
				button9.setEnabled(false);
				btnDot.setEnabled(false);
				btnAdd.setEnabled(false);
				btnMul.setEnabled(false);
				btnDivide.setEnabled(false);
				btnPercent.setEnabled(false);
				btnSub.setEnabled(false);
				btnBack.setEnabled(false);
				btnClear.setEnabled(false);
				btnNewButton.setEnabled(false);
				btnEx.setEnabled(false);
				btnNewButton_2_1.setEnabled(false);
				btnNewButton_2_1_1.setEnabled(false);
				btnNewButton_2_1_1_1.setEnabled(false);
				btnNewButton_1.setEnabled(false);
				btnNewButton_1_2.setEnabled(false);
				btnNewButton_1_2_1.setEnabled(false);
				btnNewButton_1_2_1_1_1.setEnabled(false);
				btnNewButton_1_1.setEnabled(false);
				btnNewButton_1_1_1.setEnabled(false);
				btnNewButton_1_1_1_1.setEnabled(false);
				btnNewButton_1_1_1_1_1.setEnabled(false);
				btnPlusMinus.setEnabled(false);
				btnNewButton_1_2_1_1.setEnabled(false);
				btnEqual.setEnabled(false);
				textField.setEnabled(false);
			}
		});
		buttonGroup_2.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(89, 99, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
	}
}
