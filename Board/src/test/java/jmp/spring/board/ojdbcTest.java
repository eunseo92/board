package jmp.spring.board;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zaxxer.hikari.HikariDataSource;

import jmp.spring.mapper.BoardMapper;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;


@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class ojdbcTest {
	
	
		@Autowired
		HikariDataSource datasource;
	
		@Autowired
		BoardMapper mapper;
		
		@Test
		public void mapper() {
			mapper.getTime();
			System.out.println("=========" + mapper.getTime());
			System.out.println("=========" + mapper.getTime());
			
		}
		
		@Test
		public void hikaricpText() {
			try {
				Connection conn = datasource.getConnection();
			/* log.info("======== " + conn); */
				System.out.println(conn);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	
		@Test
		public void ojdbcTest() {
			try {
				Connection conn = DriverManager.getConnection
						  ("jdbc:oracle:thin:@localhost:1521:xe", "spring", "1234");
					//Log.info(conn);
				System.out.println(conn);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
}