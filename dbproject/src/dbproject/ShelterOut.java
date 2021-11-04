package dbproject;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*; 

public class ShelterOut  extends JFrame{
	
	JTextArea textArea=new JTextArea(20, 25);

	JButton bt1= new JButton("정보 보기");
	JButton bt2= new JButton("길 안내");
	
	public ShelterOut(String title) {
	super(title); 
	
	setBounds(700, 200, 500, 300); 
	setLayout(new BorderLayout()); 
	
	JPanel panel1=new JPanel(); 
	panel1.setLayout(new FlowLayout()); 
	JLabel label1= new JLabel("현재 위치에서 가까운 무더위 쉼터"); 
	panel1.add(label1); 

    Border border=BorderFactory.createEtchedBorder();
	
	JScrollPane panel2=new JScrollPane(textArea);	
	Border textBorder=BorderFactory.createTitledBorder(border, "무더위 쉼터");
	panel2.setBorder(textBorder);
	
	MouseListener listener1= new MouseHandler4(); //정보 보기 
	bt1.addMouseListener(listener1); 
	
	MouseListener listener2= new MouseHandler5(); //길 안내 
	bt2.addMouseListener(listener2);
	
	JPanel panel3=new JPanel(); 
	panel3.setLayout(new FlowLayout()); 
	panel3.add(bt1); 
	panel3.add(bt2);
	
	add(panel1,BorderLayout.NORTH); 
	add(panel2, BorderLayout.CENTER);
	add(panel3, BorderLayout.SOUTH);
	
    setVisible(true);
	setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);	
 }
}