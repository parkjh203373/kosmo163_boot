package com.winter.app.departments;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DepartmentMapper {
	
	//list
	public abstract List<DepartmentDTO> list() throws Exception;
	
	//detail
	public abstract DepartmentDTO detail(DepartmentDTO departmentDTO) throws Exception;
	
	//create
	public abstract int create(DepartmentDTO departmentDTO) throws Exception;
	
	//update
	public abstract int update(DepartmentDTO departmentDTO) throws Exception;
	
	//delete
	public abstract int delete(DepartmentDTO departmentDTO) throws Exception;

}
