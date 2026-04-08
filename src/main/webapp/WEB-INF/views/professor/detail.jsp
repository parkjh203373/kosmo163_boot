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
	<h1 class="h3 mb-4 text-gray-800">Detail Page</h1>
	                   <div class="col-8">
	                   		<table class="table table-hover">
	                   			<thead>
	                   				<tr class="table-secondary">
	                   					<th>교수 번호</th>
	                   					<th>교수 이름</th>
	                   					<th>주민번호</th>
	                   					<th>교수 주소</th>
	                   					<th>학과 번호</th>
	                   				</tr>
	                   			</thead>
	                   			<tbody>
	                   				<tr>
	                   					<td>${d.professorNo}</td>
	                   					<td>${d.professorName}</td>
	                   					<td>{d.professorSsn}</td>
	                   					<td>{d.professorAddress}</td>
	                   					<td>${d.departmentNo}</td>
	                   					
	         
	                   				</tr>
	                   				
	                   			</tbody>
	                   		</table>
                    
                    <div>
                    	<a class="btn btn-info" href="./update?professorNo=${d.professorNo}">학과 수정</a>
                    	<form action="./delete" method="post">
                    		<input type="hidden" name="professorNo" value="${d.professorNo}">
                    		<button type="submit" class="btn btn-info">학과 삭제</button>
                    	</form>
                    </div>
</body>
</html>