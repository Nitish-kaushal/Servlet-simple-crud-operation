<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">

  body {
    font-family: Arial, sans-serif;
    background-color: #f0f0f0;
    padding: 20px;
  }

  form {
    background-color: #ffffff;
    padding: 20px;
    border-radius: 10px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    max-width: 500px;
    margin: auto;
  }
h2{
  align-items: flex;
 }
 
  label {
    font-weight: bold;
    color: #555555;
    display: block;
    margin-bottom: 5px;
  }

  input[type="text"],
  input[type="email"],
  input[type="password"],
  input[type="date"],
  input[type="number"],
  textarea {
    width: calc(100% - 20px);
    padding: 10px;
    margin-bottom: 15px;
    border: 1px solid #dddddd;
    border-radius: 5px;
    font-size: 14px;
    box-sizing: border-box;
  }

  input[type="radio"],
  input[type="checkbox"] {
    margin-right: 5px;
    margin-bottom: 10px;
  }

  textarea {
    resize: vertical; /* Allow vertical resize */
  }

  button[type="submit"] {
    background-color: #4CAF50;
    color: white;
    padding: 12px 20px;
    border: none;
    border-radius: 5px;
    cursor: pointer;
    font-size: 16px;
  }

  button[type="submit"]:hover {
    background-color: #45a049;
  }


</style>
</head>
<body>
  
  <form action="a"> 
  <h2>Registration Form</h2>
  <br>
        <label for="First Name" >FirstName</label>
        <input type="text" id="First Name" name="FirstName" placeholder="Enter Your First Name">
      
    <br>
        <br>
        <label for="Last Name">LastName</label>
        <input type= "text" id="Last Name" name="LastName" placeholder="Enter your Last Name">
        <br> <br>
        <label for="Nick Name">NickName</label>
    <input type= "text" id="Nick Name" name="NickName" placeholder="Enter your Nick Name">
    <br> <br>
    
         <label for="Email">Email</label>
       <input type= "email" id="Email" name="Email" placeholder="Enter your Email id">
        <br> <br>
        
        <label for="Pass">Password</label>
        <input type= "password" id="pass" name="Password" placeholder="Enter your Password">
        <br> <br>
        
        <label for="dob">Dob</label>
        <input type= "date" id="dob" name="Dob" placeholder="Enter your dob">
        <br> <br>
        
        <label for="mobile">Mobile no</label>
        <input type= "number" id="mobile" name="Mobile" placeholder="Enter your Mobile Number">
        <br> <br>
        
        <label for="gender">Gender</label>
        <input type= "radio" id="gender" name="Gender" value="Male">Male
         <input type= "radio" id="gender" name="Gender" value="Female">Female
          <input type= "radio" id="gender" name="Gender" value="Other">other
        <br> <br>
          <label for="address">Address</label>
           <textarea  rows="3" cols="25" name="Address"></textarea>
       
        <br> 
        <button type="submit">Submit</button>
        
    </form>
</body>
</html>