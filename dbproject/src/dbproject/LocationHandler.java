package dbproject;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 

public class LocationHandler implements ActionListener{

	JTextField Lati; 
	JTextField longi; 
	
	public LocationHandler (JTextField Lati, JTextField longi)
	{	
		this.Lati=Lati; 
		this.longi=longi; 
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//무더위 쉼터 테이블과 비교
		//현재 위치에서 가까운 무더위 쉼터 찾기
	}

}