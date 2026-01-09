<?xml version="1.0" encoding="UTF-8" ?>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>JSP Test Page</title>
</head>
<body>
	<h1>First Jsp Page</h1>
</body>

	Scriptlet Tag :
		<%
			int no = 5;
			for(int i = 1 ; i <= 10; i++ )
			{
				out.println(no+" * " + i + " = " + (no*i)+"<br>");				
			}				
		%>
		
		<br>
		
	Expression Tag :	 <%= 2000 + 1000 %>
	
	
	<%!
		int getCube(int no)
		{
			return (no*no*no);
		}
	%>
		<br>
		
	<%
		int ans = getCube(5);
		out.print("Cube Ans : " + ans);
	%>
	
	<br>
	
	
	Cube Ans : <%= getCube(5) %>
	
</html>
