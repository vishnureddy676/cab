<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body {font-family: Arial, Helvetica, sans-serif;}

.navbar {
  width: 100%;
  background-color:white;
  overflow: auto;
}
.responsive {
  width: 100%;
  height: auto;
}

.navbar a {
  float: left;
  padding: 12px;
  color:black;
  text-decoration: none;
  font-size: 17px;
}

.navbar a:hover {
  background-color:green;
}

.active {
  background-color:grey;
}

@media screen and (max-width: 500px) {
  .navbar a {
    float: none;
    display: block;
  }
}
</style>
<body>

  <h2><center>ONLINE CAB BOOKING</center> </h2>


<div class="navbar">
  <a class="active" href="#"><i class="fa fa-fw fa-home"></i> Home</a> 
  <a href="/Cabbooking-project/link"> Registration</a> 
  <a href="#"><i class="fa fa-fw fa-user"></i> Login</a>
  <a href="#">Book A Cab</a>
  <a href="#"><i class="fa fa-fw fa-envelope"></i> Contact</a> 
  <a href="#"> FeedBack</a>
  
</div>
<div>
    <img src="/Cabbooking-project/urlforimages/images/car.jpg" alt="Flowers in Chania"class="responsive">
</div>

</body>
</html> 
    