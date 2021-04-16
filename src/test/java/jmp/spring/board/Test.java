package jmp.spring.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



import lombok.extern.log4j.Log4j;

@Log4j
public class Test {
	@org.junit.Test
	public void ojdbcTest() {
		try {
			Connection conn = DriverManager.getConnection
					  ("jdbc:oracle:thin:@localhost:1521:xe", "jweb", "4321");
			log.info(conn);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
