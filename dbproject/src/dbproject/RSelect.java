package dbproject;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*; 

public class RSelect extends JFrame{
	
	JTextArea textArea=new JTextArea(20, 25);
	JButton bt= new JButton("확인");
	
	public RSelect(String title) {
	super(title); 
	
	setBounds(700, 200, 500, 300); 
	setLayout(new BorderLayout()); 
	
	JPanel panel1=new JPanel(); 
	panel1.setLayout(new FlowLayout()); 
	JLabel label1= new JLabel("무더위 쉼터를 선택하세요."); 
	panel1.add(label1); 

    Border border=BorderFactory.createEtchedBorder();
	
	JScrollPane panel2=new JScrollPane(textArea);	
	Border textBorder=BorderFactory.createTitledBorder(border, "무더위 쉼터");
	panel2.setBorder(textBorder);
	
	JPanel panel3=new JPanel(); 
	panel3.setLayout(new GridLayout(1,2,5,5)); 
	
	JLabel SinLabel= new JLabel(" 무더위 쉼터 선택 " ,SwingConstants.RIGHT); 
	JTextField SinText= new JTextField(15); 
	
	panel3.add(SinLabel); 
	panel3.add(SinText);
	panel3.add(bt); 
	
	MouseListener listener= new MouseHandler7(); //확인 버튼
	bt.addMouseListener(listener); 
	SinText.addActionListener(new RselectHandler(SinText)); 
	
	add(panel1,BorderLayout.NORTH); 
	add(panel2, BorderLayout.CENTER);
	add(panel3, BorderLayout.SOUTH);
	
    setVisible(true);
	setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);	
 }
}