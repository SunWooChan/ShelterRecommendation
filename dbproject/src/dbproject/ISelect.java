package dbproject;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*; 

public class ISelect extends JFrame{
	
	JTextArea textArea=new JTextArea(20, 25);
	JButton bt= new JButton("Ȯ��");
	
	public ISelect(String title) {
	super(title); 
	
	setBounds(700, 200, 500, 300); 
	setLayout(new BorderLayout()); 
	
	JPanel panel1=new JPanel(); 
	panel1.setLayout(new FlowLayout()); 
	JLabel label1= new JLabel("������ ���͸� �����ϼ���."); 
	panel1.add(label1); 

    Border border=BorderFactory.createEtchedBorder();
	
	JScrollPane panel2=new JScrollPane(textArea);	
	Border textBorder=BorderFactory.createTitledBorder(border, "������ ����");
	panel2.setBorder(textBorder);
	
	JPanel panel3=new JPanel(); 
	panel3.setLayout(new GridLayout(1,2,5,5)); 
	
	JLabel SinLabel= new JLabel(" ������ ���� ���� " ,SwingConstants.RIGHT); 
	JTextField SinText= new JTextField(15); 
	
	panel3.add(SinLabel); 
	panel3.add(SinText);
	panel3.add(bt); 
	
	MouseListener listener= new MouseHandler6(); //Ȯ�� ��ư
	bt.addMouseListener(listener); 
	SinText.addActionListener(new IselectHandler(SinText)); 
	
	add(panel1,BorderLayout.NORTH); 
	add(panel2, BorderLayout.CENTER);
	add(panel3, BorderLayout.SOUTH);
	
    setVisible(true);
	setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);	
 }
}