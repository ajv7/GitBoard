<%@ include file="/common/jsp/jsp_header.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<tr>
	<td>
		<table border=1 cellapding=0 cellpadding=0 width=80%>
		<form name=frm method=post action="write_prc.jsp">
			<tr>
				<td>작성자</td>
				<td><input type=text size=20></td>
			</tr>
			<tr>
				<td>제목</td>
				<td><input type=text size=20></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><textarea name=content style="width:1000px"></textarea></td>
			</tr>
			<tr><td colspan=2><input type=submit value="등록">  <a href="list.jsp">취소</a></td></tr>
			</form>				
		</table>
	
	</td>
</tr>
