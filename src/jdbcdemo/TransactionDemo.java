package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String dburl = "jdbc:mysql://localhost:3306/animated_movies";
		String username = "root";
		String password = "root";
		
		String query1 = "insert into movies values('Toy Story 4','Comedy','dir2','1923')";
		String query2 = "insert into movies values('finding nemo','Comedy','dir3','1926')";
		//String query3 = "insert into movies values('abc23574','Comedy','dir6','1924')";
		String query3 = "update movies set director='James' where title='a'";
		//String query4 = "delete from movies where title=abc1";
		boolean flag = false;
         
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(dburl,username,password);
			Statement stmt = con.createStatement(); // execute query
			con.setAutoCommit(false);
		
			//stmt.addBatch(q3);
			stmt.addBatch(query1);
			stmt.addBatch(query2);
			stmt.addBatch(query3);
			
			int [] result = stmt.executeBatch();
			
			for(int i =0; i<result.length;i++)
			{
				System.out.println(result[i]);
				if(result[i]==0) {
					flag = true;
					break;
				}
			}
			
			if(flag==false) {
				con.commit();
				System.out.println("transaction successful");
			}
			else {
				con.rollback();
				System.out.println("transaction Failure");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("check the steps");
		}

	}

}
