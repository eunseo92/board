package jmp.spring.vo;

import lombok.Data;

@Data
public class BoardVo {

	
	int bno;
	String title;
	String content;
	String writer;
	String regdate;
	String updatedate;
}
