package dbproject;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*; 

public class Route extends JFrame {
	JTextArea textArea=new JTextArea(20, 25);
	 JButton bt= new JButton("����");
			 
	public Route(String title) {
		super(title); 
		
		setBounds(700, 200, 500, 300); 
		setLayout(new BorderLayout()); 
		
		JPanel panel1=new JPanel(); 
		panel1.setLayout(new FlowLayout()); 
		JLabel label1= new JLabel("������ ���� �� �ȳ�"); 
		panel1.add(label1); 

	    Border border=BorderFactory.createEtchedBorder();
		
		JScrollPane panel2=new JScrollPane(textArea);	
		Border textBorder=BorderFactory.createTitledBorder(border, "ã�ư��� ��");
		panel2.setBorder(textBorder);
		
		MouseListener listener= new MouseHandler8(); //����
		bt.addMouseListener(listener);
		
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