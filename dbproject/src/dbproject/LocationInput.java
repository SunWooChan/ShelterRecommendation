package dbproject;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*; 

public class LocationInput extends JFrame{
	
	JButton bt= new JButton("확인");
	
	public LocationInput(String title) {
	super(title); 
	
	setBounds(600, 200, 500, 150); 
	setLayout(new BorderLayout()); 
	
	JPanel panel1=new JPanel(); 
	panel1.setLayout(new FlowLayout()); 
	JLabel label1= new JLabel("현재 위치를 입력하세요"); 
	panel1.add(label1); 
	
	JPanel panel2=new JPanel(); 
	panel2.setLayout(new GridLayout(2,2,5,5)); 
	
	JLabel LatiLabel= new JLabel(" 위도 " ,SwingConstants.RIGHT); 
	JTextField  LatiText= new JTextField(15); 
	
	JLabel longiLabel= new JLabel(" 경도 " ,SwingConstants.RIGHT); 
	JTextField longiText= new JTextField(15);
	
	panel2.add(LatiLabel); 
	panel2.add(LatiText);
	
	panel2.add(longiLabel); 
	panel2.add(longiText); 
	
	LatiText.addActionListener(new LocationHandler(LatiText, longiText)); 
	
	MouseListener listener3= new MouseHandler3(); //확인
	bt.addMouseListener(listener3); 
	
	JPanel panel3=new JPanel(); 
	panel3.setLayout(new FlowLayout()); 
	panel3.add(bt); 
	
	add(panel1,BorderLayout.NORTH); 
	add(panel2,BorderLayout.CENTER);
	add(panel3,BorderLayout.SOUTH);
	
	setVisible(true); 
	setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
}
