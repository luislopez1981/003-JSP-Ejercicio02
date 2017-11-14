<%
    String numero1 = request.getParameter("numero1");
    int numUno = Integer.parseInt(numero1);
    String numero2 = request.getParameter("numero2");
    int numDos = Integer.parseInt(numero2);
    
    String operacion = request.getParameter("operacion");
    
    
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%switch (operacion){
        case "suma": %>
        <h1><%=numUno%> + <%=numDos%> = <%=numUno + numDos%></h1>
         <%break;
         case "resta": %>
        <h1><%=numUno%> - <%=numDos%> = <%=numUno - numDos%></h1>
         <%break;
          case "multiplicacion": %>
        <h1><%=numUno%> * <%=numDos%> = <%=numUno * numDos%></h1>
         <%break;
         case "division": %>
        <h1><%=numUno%> / <%=numDos%> = <%=numUno / numDos%></h1>
         <%break;
         }%>
        
    </body>
</html>
