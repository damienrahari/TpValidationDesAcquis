<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Liste etudiants </title>
        <style>
            UL.tableau li {
	display:block;
	float:left;
	padding:0;
	width : 33%;
	height : auto;
	border: 1px solid #000;
	text-align:center;
}
        </style> 
    </head>
    
    <body>
        

        <ul class="tableau">
            <c:forEach items="${ etudiants }" var="etud">
                
                    <li> 
                    <c:out value="${ etud.getNom() }" />
                    <c:out value="${ etud.getId() }" />
                    <c:out value="${ etud.getMoyenne() }" />
                    <c:out value="${ etud.getImage() }" />
                
                
            </c:forEach>
            </ul>
    </body>
</html>