<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>list.jsp</h1>
	<table>
		<tr>
			<th style="width: 10px">rcode</th>
			<th>name</th>
			<th>addr</th>
			<th>rtype</th>
			<th>rprofile</th>
			<th>thdetail01</th>
			<th>thdetail02</th>
			<th>thdetail03</th>
			<th>thdetail04</th>
			<th>prc</th>
		</tr>
		<c:forEach items="${RoomList}" var="Room_infoVo">
			<tr>
				<td>${Room_infoVo.rcode}</td>
				<td>${Room_infoVo.name}</td>
				<td>${Room_infoVo.addr}</td>
				<td>${Room_infoVo.rtype}</td>
				<td>${Room_infoVo.rprofile}</td>
				<td>${Room_infoVo.thdetail01}</td>
				<td>${Room_infoVo.thdetail02}</td>
				<td>${Room_infoVo.thdetail03}</td>
				<td>${Room_infoVo.thdetail04}</td>
				<td>${Room_infoVo.prc}</td>
			</tr>
		</c:forEach>
</body>
</html>