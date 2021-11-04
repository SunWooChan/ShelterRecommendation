package dbproject;
import java.awt.*;

import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame{

	JButton bt1= new JButton("확인");
    JButton bt2= new JButton("종료");
    
		public Login(String title) {
			
		super(title); 
			
		setBounds(600, 200, 500, 150); 
		setLayout(new BorderLayout()); 
		
		JPanel panel1=new JPanel(); 
		panel1.setLayout(new FlowLayout()); 
		JLabel label1= new JLabel("무더위쉼터 추천 서비스 Login"); 
		panel1.add(label1); 
		
		JPanel panel2=new JPanel(); 
		panel2.setLayout(new GridLayout(2,2,5,5)); 
		
		JLabel idLabel= new JLabel(" ID " ,SwingConstants.RIGHT); 
		JTextField idText= new JTextField(15); 
		
		JLabel pwLabel= new JLabel(" Password " ,SwingConstants.RIGHT); 
		JPasswordField pwText= new JPasswordField(15);
		pwText.setEchoChar('*');
		
		panel2.add(idLabel); 
		panel2.add(idText);
		
		
		panel2.add(pwLabel); 
		panel2.add(pwText); 
		
		pwText.addActionListener(new LoginHandler(idText, pwText)); 
		
		MouseListener listener1= new MouseHandler1(); //확인
		bt1.addMouseListener(listener1); 
		
		MouseListener listener2= new MouseHandler2(); //종료
		bt2.addMouseListener(listener2);
		
		JPanel panel3=new JPanel(); 
		panel3.setLayout(new FlowLayout()); 
		panel3.add(bt1); 
		panel3.add(bt2);
		
		add(panel1,BorderLayout.NORTH); 
		add(panel2,BorderLayout.CENTER);
		add(panel3,BorderLayout.SOUTH);
		
		setVisible(true); 
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
	}
}
