<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Liste etudiants </title>
         
    </head>
    <body>
        

        <ul>
            <c:forEach items="${ etudiants }" var="etud">
                
                    <li>Nom 
                    <c:out value="${ etud.getNom() }" />
                    ID 
                    <c:out value="${ etud.getId() }" />
                    <c:out value="${ etud.getMoyenne() }" />
                
                
            </c:forEach>
            </ul>
    </body>
</html>