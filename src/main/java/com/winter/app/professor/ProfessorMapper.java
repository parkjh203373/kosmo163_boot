package com.winter.app.professor;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.winter.app.page.Pager;

@Mapper
public interface ProfessorMapper {
	
	public abstract Long getCount(Pager pager) throws Exception;
	
	//list
	public abstract List<ProfessorDTO> list(Pager pager) throws Exception;
	
	//detail
	public abstract ProfessorDTO detail(ProfessorDTO professorDTO) throws Exception;
	
	//create
	public abstract int create(ProfessorDTO professorDTO) throws Exception;
	
	//update
	public abstract int update(ProfessorDTO professorDTO) throws Exception;
	
	//delete
	public abstract int delete(ProfessorDTO professorDTO) throws Exception;

}
