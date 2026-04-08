package com.winter.app.professor;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProfessorMapper {
	
	//list
	public abstract List<ProfessorDTO> list() throws Exception;
	
	//detail
	public abstract ProfessorDTO detail(ProfessorDTO professorDTO) throws Exception;
	
	//create
	public abstract int create(ProfessorDTO professorDTO) throws Exception;
	
	//update
	public abstract int update(ProfessorDTO professorDTO) throws Exception;
	
	//delete
	public abstract int delete(ProfessorDTO professorDTO) throws Exception;

}
