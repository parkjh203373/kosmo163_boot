<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="/WEB-INF/views/temp/head_css.jsp"></c:import>
</head>
<body id="page-top">
<div id="wrapper">
		<c:import url="/WEB-INF/views/temp/sidebar.jsp"></c:import>
		<div id="content-wrapper" class="d-flex flex-column">
			<div id="content">
				<c:import url="/WEB-INF/views/temp/topbar.jsp"></c:import>
				<div class="container-fluid">
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
                    </div>
                <!-- end container-fluid -->
			</div>
			<!-- end content -->
			<c:import url="/WEB-INF/views/temp/footer.jsp"></c:import>
		</div>
		<!-- end content-wrapper -->
	</div>
	<!-- end wrapper -->
	<c:import url="/WEB-INF/views/temp/footer_script.jsp"></c:import>
                    
                    
                    
</body>
</html>