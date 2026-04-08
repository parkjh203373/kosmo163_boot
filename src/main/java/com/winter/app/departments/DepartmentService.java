package com.winter.app.departments;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentMapper departmentDAO;
	
	public List<DepartmentDTO> list() throws Exception {
		System.out.println("Service List");
		
		//참조변수명.메서드명()
		//this 생략 가능
		List<DepartmentDTO> ar = this.departmentDAO.list();
		
		return ar;
		
	}
	
	public DepartmentDTO detail(DepartmentDTO departmentDTO) throws Exception{
		return departmentDAO.detail(departmentDTO);
	}
	
	public int create(DepartmentDTO departmentDTO) throws Exception{
		return departmentDAO.create(departmentDTO);
	}
	
	public int delete(DepartmentDTO departmentDTO) throws Exception{
		return departmentDAO.delete(departmentDTO);
	}
	
	public int update(DepartmentDTO departmentDTO) throws Exception{
		return departmentDAO.update(departmentDTO);
	}

}