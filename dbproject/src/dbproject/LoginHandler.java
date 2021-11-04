package dbproject;
import java.awt.*;

import java.awt.event.*;
import javax.swing.*; 

public class LoginHandler implements ActionListener{

	JTextField id; 
	JPasswordField pw; 
	
	public LoginHandler (JTextField id, JPasswordField pw)
	{	
		this.id=id; 
		this.pw=pw; 
	}
	
	public void actionPerformed(ActionEvent event) {
		/*
		System.out.println("ID: "+id.getText()); 		
		System.out.println("Password: "+new String(pw.getPassword()));
		id.setText(""); 
		pw.setText("");
		*/ 
		//DB¿¡ INSERT 
	}

}
