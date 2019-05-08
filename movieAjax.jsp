<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
<script type="text/javascript">
	var url = "http://www.kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json?key=0b5c8cb28ec0808ef0f67c3ed28a962e&targetDt=20190401";
	$.ajax({
		type : 'GET',
		url : url,
		dataType : 'json',
		success : jsonParser
	})
	function jsonParser(data) {
		var showList = data.boxOfficeResult.dailyBoxOfficeList;
		$(showList).each(function(idx, item){	
			document.write("<h2>"+item.rank+" : "+item.movieNm+"</H2>");
		})
	}
</script>
</head>
<body>
	<div id="movie-box"></div>
</body>
</html>