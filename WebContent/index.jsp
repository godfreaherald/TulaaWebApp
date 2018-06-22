<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Tulaa WebApplication</title>
</head>
<body>
    <form action="PythagoreanServlet" method="post">
        <fieldset style="width: 300px">
            <legend> Test Pythagorean Triplet </legend>
            <table>
            <tr>
                    <td>Enter an array of integers to test</td>
               </tr>     
                <tr>
                    <td>eg 2,3,5,6,7,4,8</td>
                    <td><input type="text" name="tripletTest" required="required" /></td>
                </tr>
                <tr></tr>
                <tr>
                    <td><input type="submit" value="Check" /></td>
                </tr>
            </table>
        </fieldset>
    </form>
    
     
    
    
    
</body>
</html>