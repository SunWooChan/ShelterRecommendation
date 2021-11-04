

package DB_1;

package dbproject;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;


public class First {

public static void main(String[] args) throws SQLException
{
		
	Scanner scan = new Scanner(System.in);
	string input = "N";
	boolean login = false;
	ResultSet rs = null;
	PreparedStatement p = null;
	Statement stmt = null;
			
	try
		{
			

			System.out.println("Connecting PostgreSQL database");

			try {

				Class.forName("org.postgresql.Driver"); // 
				
				System.out.println("Driver exist");
			} catch(ClassNotFoundException e) {
				System.out.println("Driver not exist");
			}
		
			String url = "jdbc:postgresql://localhost:5432/postgres";
			String user = "postgres";
			String pwd = "5770";			
			
			Connection con = DriverManager.getConnection(url,user,pwd); 
			System.out.println("===>"+con);


			p = con.prepareStatement(statement); // 실행 도구
			rs = p.executeQuery();
			
			L
while(1) {
        	 System.out.println("로그인 하시겠습니까?");
		
        	 Input = sc.next();
	         if(Input == y) {
		        	 String ID;
		        	 int password;
		        	  System.out.print(
		     				 "ID를 입력해주세요\n"
		     		 		);
		        	  ID = sc.next();
		        	  
		        	  System.out.print(
		 	     				 "Password를 입력해주세요\n"
		 	     		 		);
		              password = sc.nextInt();
		              ResultSet rs = stmt.executeQuery( "SELECT * FROM user_id where user_id = " + ID + " and user_password = " + PW );
		              if(!rs.next()) 
		            	  		System.out.println(####);
		              else{
		            	  LOGIN = true;
		            	  System.out.println("###);
		       	       
		              }
		              rs.close();  
	        	 
	          }
  
			
		
	}
}



public class LoginHandler implements ActionListener{

   Scanner sc= new Scanner(System.in); 
   String id; 
   int pw; 
   Statement stm = null;
   boolean LOGIN=false; 
   ResultSet rs;
   
   public LoginHandler (JTextField id, JTextField pw)
   {   
      this.id=(String)id.getText(); 
      this.pw=Integer.parseInt(pw.getText()); 
   }
   
   public void actionPerformed(ActionEvent event) {
      
   
      try {
         rs = stm.executeQuery( "SELECT * FROM user_id where user_id = " +  id+ " and user_password = " + pw);
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
       
      try {
         if(!rs.next()) 
                 System.out.println("로그인실패: " + id +"\t" +pw);
         else{
           LOGIN = true;
           System.out.println("로그인성공: " +  id +"\t" + pw);
            
         }
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
        try {
         rs.close();
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }
}

