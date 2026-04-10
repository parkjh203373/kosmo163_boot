package com.winter.app.professor;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.winter.app.board.notice.NoticeDTO;

@SpringBootTest
class ProfessorMapperTest {
	
	@Autowired
	private ProfessorMapper professorMapper;
	
	//@Test
	void getCountList() throws Exception {
		 Long result = professorMapper.getCount();
		 
		 assertNotEquals(0, result);
	}

	//@Test
//	void testList() throws Exception {
//		Map<String, Long> map = new HashMap<>();
//		map.put("begin", 1L);
//		map.put("end", 10L);
//		List<ProfessorDTO> ar =professorMapper.list(map);
//		
//		assertNotEquals(0, ar);
//	}

	//@Test
	void testDetail() throws Exception {
		ProfessorDTO professorDTO = new ProfessorDTO();
		professorDTO.setProfessorNo("P082");
		professorDTO = professorMapper.detail(professorDTO);
		
		assertNotNull(professorDTO);
	}

	//@Test
	void testCreate() throws Exception {
		ProfessorDTO professorDTO = new ProfessorDTO();
		professorDTO.setProfessorNo("P115");
		professorDTO.setProfessorName("김윈터");
		professorDTO.setProfessorSsn("570519-1138462");
		professorDTO.setProfessorAddress("경기 금천구");
		professorDTO.setDepartmentNo("031");
		int result = professorMapper.create(professorDTO);
		
		assertEquals(1, result);
	}

	//@Test
	void testUpdate() throws Exception {
		ProfessorDTO professorDTO = new ProfessorDTO();
		professorDTO.setProfessorNo("P115");
		professorDTO.setProfessorName("아이유");
		professorDTO.setProfessorSsn("530826-2134028");
		professorDTO.setProfessorAddress("경기 광명시");
		professorDTO.setDepartmentNo("055");
		int result = professorMapper.update(professorDTO);
		
		assertEquals(1, result);
	}

	//@Test
	void testDelete() throws Exception {
		ProfessorDTO professorDTO = new ProfessorDTO();
		professorDTO.setProfessorNo("P115");
		int result = professorMapper.delete(professorDTO);
		
		assertEquals(1, result);
	}

}
