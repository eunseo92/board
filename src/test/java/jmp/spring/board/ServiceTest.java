package jmp.spring.board;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import jmp.spring.mapper.BoardMapper;
import jmp.spring.service.BoardService;
import jmp.spring.vo.BoardVo;
import lombok.extern.log4j.Log4j;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")

public class ServiceTest {
	@Autowired
	BoardService service;
	
	@Autowired
	BoardMapper mapper;
	
	@Test
	public void deleteMapper() {
		BoardVo vo = new BoardVo();
		vo.setBno(142);
		vo.setContent("내용-update mapperTest");
		vo.setTitle("제목 - update mapperTest");
		vo.setWriter("작성자 - update mapperTest");
		
		int res = mapper.delete(128);
		log.info("=============" + res);
		
	}
	
	@Test
	public void updateMapper() {
		BoardVo vo = new BoardVo();
		vo.setBno(261);
		vo.setContent("내용-update mapperTest");
		vo.setTitle("제목 - update mapperTest");
		vo.setWriter("작성자 - update mapperTest");
		
		int res = mapper.update(vo);
		log.info("=============" + res);
	}
	
	
	@Test
	public void getService() {
		BoardVo vo = service.get(128);
		log.info(vo);
	}
	
	@Test
	public void getMapper() {
		BoardVo vo = mapper.get(128);
		
		log.info(vo);
	}
	
	@Test
	public void mapper() {
		BoardVo vo = new BoardVo();
		vo.setContent("내용-mapperTest");
		vo.setTitle("제목 - mapperTest");
		vo.setWriter("작성자 - mapperTest");
		
		int res = mapper.insertBoard(vo);
		
		//log.info("mapper.insert.test=========== : "+res);
		log.info("service.insertBoard=============:"+service.insertBoard(vo));
	}
	
	@Test
	public void service() {
		
		log.info("service==============="+service.getList());
	}
}
