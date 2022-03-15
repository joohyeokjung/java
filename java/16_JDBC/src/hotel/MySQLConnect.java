package hotel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnect {
	// 싱글톤 방식
	// 데이터 베이스를 스태틱으로 한번 올려놓고 계속 사용하는 방식
	private static MySQLConnect dbc = new MySQLConnect();
	
	// 커넥션 인터페이스
	private Connection conn = null;
	
	// 자바랑 데이터베이스 연결할 드라이버 레퍼런스 라이브러리
	// 데이터베이스 위치값
	private String jdbcDriver = "com.mysql.jdbc.Driver"; // oralcle -> oracle.jdc.driver.OracleDriver
	private String jdbcUrl = "jdbc:mysql://localhost/javatest"; // oracle -> jdbc:oracle:thin:@localhost:1521:orcl
	
	private MySQLConnect() {
		try {
			Class.forName(jdbcDriver);
			conn = DriverManager.getConnection(jdbcUrl, "root", "mysql");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를 찾을 수 없습니다"); // 라이브러리 연결 실패
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("연결 정보가 정확하지 않습니다");
			e.printStackTrace();
		}
	}
	public static MySQLConnect getInstance() {
		return dbc;
	}
	public Connection getConnection() {
		return conn;
	}
}
