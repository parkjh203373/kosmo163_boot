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
	<h1 class="h3 mb-4 text-gray-800">Notice List Page</h1>
                    <div class="row justify-content-center">
	                    <div class="col-6">
	                    	<table class="table table-striped">
	                    		<thead>
	                    			<tr>
	                    				<th>공지사항 번호</th>
	                    				<th>제목</th>
	                    				<th>등록일</th>
	                    				<th>조회수</th>
	                    			</tr>
	                    		</thead>
	                    		<tbody>
			                    	<c:forEach items="${list}" var="d">
			                    		<tr>
			                    			<td><a href="./detail?noticeNum=${d.noticeNum}">${d.noticeNum}</a></td>
			                    			<td>${d.noticeTitle}</td>
			                    			<td>${d.createdAt}</td>
			                    			<td>${d.viewCount}</td>
			                    		</tr>
			                    	</c:forEach>
			                    </tbody>
	                    	</table>
	                    	
	                    	<div>
	                    		<a href="./create">공지 사항 등록</a>
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