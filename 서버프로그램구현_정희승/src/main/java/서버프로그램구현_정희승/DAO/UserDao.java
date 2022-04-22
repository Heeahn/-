package 서버프로그램구현_정희승.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDao { // DB 접근객체
	
	private Connection con; // DB연동시 사용되는 클래스 : DB연동클래스
	private PreparedStatement ps; // 연결된 DB내 SQL 조작 할때 사용되는 인터페이스 : DB조작인터페이스
	private ResultSet rs; // 결과물을 조작하는 인터페이스 
	
	public static UserDao userDao = new UserDao(); // DB 연동 객체;

	public UserDao() {
		try {
			// DB연동 
			Class.forName("com.mysql.cj.jdbc.Driver"); // 1. DB 드라이버 가져오기
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/user?serverTimezone=UTC",
					"root","1234"); // 2. DB 주소 연결 
		}
		catch(Exception e ) { System.out.println( "[DB 연동 오류]"+e  ); }
	}
}