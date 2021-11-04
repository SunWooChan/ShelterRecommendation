
package dbproject;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 

public class RselectHandler implements ActionListener{

		JTextField ShelterIdx;  
		
		public RselectHandler (JTextField ShelterIdx)
		{	
			this.ShelterIdx=ShelterIdx; 
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//인덱스 번호로 쉼터 찾아가는 길 선택
		}

	}