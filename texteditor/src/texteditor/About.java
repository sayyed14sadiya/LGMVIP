package texteditor;

import javax.swing.*;
public class About extends JFrame {
	
	About(){
		setBounds(100,100,400,400);
		setTitle("About Text Editor Application");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLayout(null);
		
		JLabel textLabel=new JLabel("<html>WELCOME TO TEXT EDITOR!!<br>This editor is a simple text editing program which enables user to create documents");
		textLabel.setBounds(50,50,300,50);
		
		add(textLabel);
	}
	public static void main(String[] args) {
		new About().setVisible(true);
	}
	

}
