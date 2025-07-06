<%@ page  contentType="text/html;charset=UTF-8" language="java" %>
<%@ page  isELIgnored="false" %>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
<style>
table, th, td {
  border: 1px solid black;
}
</style>
</head>
<body>
<h1> Hello, ${uname}</h1>
<h1>The table element</h1>
<table>
  <tr>
    <th>Register At</th>
    <th>Passport Office</th>
    <th>Given Name</th>
     <th>Sur Name</th>
     <th>Date of Birth</th>
     <th>Email ID</th>
     <th>same Email</th>
     <th>Login Id</th>
      <th>Password</th>
       <th>Confirm Password</th>
       <th>Hint Question</th>
       <th>hint Answer</th>
  </tr>

  <c:forEach  items="${listOfUsers}"  var="dtos" >
  <tr>
  <td>${ dtos.getRegisterAt() }</td>
  <td>${ dtos.getPassportOffice() }</td>
   <td>${ dtos.getGivenName()}</td>
   <td>${ dtos.getSurName() }</td>
   <td>${ dtos.getDob()}</td>
   <td>${ dtos.getEmail() }</td>
   <td>${ dtos.getSameEmail() }</td>
    <td>${ dtos.getLoginId() }</td>
   <td>${ dtos.getPassword() }</td>
   <td>${ dtos.getConfirmPassword() }</td>
   <td>${ dtos.getHintQuestion() }</td>
   <td>${ dtos.getHintAnswer() }</td>
   </tr>
  </c:forEach>


</table>

</body>
</html>