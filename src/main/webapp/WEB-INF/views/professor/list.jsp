<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 class="h3 mb-4 text-gray-800">교수 목록 페이지</h1>
                    <div class="row justify-content-center">
	                    <div class="col-6">
	                    	<table class="table table-striped">
	                    		<thead>
	                    			<tr>
	                    				<th>교수 번호</th>
	                    				<th>이름</th>
	                    				<th>학과 번호</th>
	                    			</tr>
	                    		</thead>
	                    		<tbody>
			                    	<c:forEach items="${list}" var="d">
			                    		<tr>
			                    			<td><a href="./detail?professorNo=${d.professorNo}">${d.professorNo}</a></td>
			                    			<td>${d.professorName}</td>
			                    			<td>${d.departmentNo}</td>
			                    			
			                    		</tr>
			                    	</c:forEach>
			                    </tbody>
	                    	</table>
	                    	
	                    	<div>
	                    		<a href="./create">학과 등록</a>
	                    	</div>
	                    	
	                    </div>
                    </div>
</body>
</html>