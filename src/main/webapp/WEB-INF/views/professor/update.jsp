<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 class="h3 mb-4 text-gray-800">Create Page</h1>
                    
                    <div>
                    	<form action="./update" method="post">
						  <div class="form-group">
						    <label for="professorNo">교수 번호</label>
						    <input type="text" name="professorNo" readonly value="${d.professorNo}" class="form-control" id="professorNo">
						  </div>
						  <div class="form-group">
						    <label for="departmentName">교수 이름</label>
						    <input type="text" name="departmentName" value="${d.departmentName}" class="form-control" id="departmentName">
						  </div>
						  <div class="form-group">
						    <label for="category">주민번호</label>
						    <input type="text" name="category" value="${d.category}" class="form-control" id="category">
						  </div>
						  <div class="form-group">
						    <label for="capacity">교수 주소</label>
						    <input type="text" name="capacity" value="${d.capacity}" class="form-control" id="capacity">
						  </div>
						  <div class="form-group">
						    <label for="capacity">학과 번호</label>
						    <input type="text" name="capacity" value="${d.capacity}" class="form-control" id="capacity">
						  </div>
						  
						  <button type="submit" class="btn btn-primary">Submit</button>
						</form>
                    </div>
</body>
</html>