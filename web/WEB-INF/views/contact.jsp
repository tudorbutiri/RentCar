<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/views/include.jsp" %>

<!DOCTYPE HTML>
<html>
<head>
<title>ELCAR-Rent | Contact</title>
	<link rel="stylesheet" type="text/css" href="resources/css/style.css" media="all" />
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href='http://fonts.googleapis.com/css?family=Playball' rel='stylesheet' type='text/css'>   
</head>
<body>
<div class="header-bg">
	<div class="wrap"> 
		<div class="h-bg">
			<div class="total">
				<div class="header">
					<div class="box_header_user_menu">
					</div>
					<div class="header-right">

					</div><div class="clear"></div> 
					<div class="header-bot">
						<div class="logo">
							<a href="/index"><img src="resources/images/logoFinal.png" alt=""/></a>
						</div>
						<div class="search">
							<ul class="user_menu"><li class="act first"></li><li class=""><a href="/register"><div class="button-t"><span>Create Account</span></div></a></li><li class=""><a href="/login"><div class="button-t"><span>Login to Account</span></div></a></li><li class=""><a href="/myaccount"><div class="button-t"><span>My Account</span></div></a></li><li class="last"><a href="/logout"><div class="button-t"><span>Log out</span></div></a></li></ul>
						</div>
					<div class="clear"></div> 
				</div>		
		</div>	
		<div class="menu"> 	
			<div class="top-nav"> 
					<ul>
						<li><a href="/index">Home</a></li>
						<li><a href="/about">About</a></li>
						<li><a href="/carselection">Car Selection</a></li>
						<li><a href ="/reservations">Reservations</a></li>
						<li><a href="/articles">Articles</a></li>
						<li class="active"><a href="/contact">Contact</a></li>
					</ul>
					<div class="clear"></div> 
				</div>
		</div>
		<div class="banner-top">
			<div class="header-bottom">
				 <div class="header_bottom_right_images">
				 	<div class="about_wrapper"><h2>Send us a message</h2>
					</div>
		    <div class="section group">
				<div class="col span_2_of_c">
				  <div class="contact-form">
				  	<h3>Contact Us</h3>
					  <form role="form" method="POST" action="/contact" modelAttribute="myContactModelAttribute" class="form-horizontal" id="contactForm" name="contactForm" >
						  <div class="form-group">
							  <span class="error">${loginSuccessful}</span>
						  </div>
					    	<div>
						    	<label for="Name">Name</label>
						    	<input value="${customer.firstName} ${customer.lastName}" id="Name" name="name" type="text" class="form-control" required>
						    </div>
						    <div>
						    	<label for="Email">Email</label>
						    	<input value="${customer.email}" id="Email" name="email" type="text" class="form-control" required>
						    </div>
						    <div>
						     	<label for="Number">Phone Number</label>
						    	<input value="${customerAddress.phoneNumber}" id="Number" name="phone" type="text" class="form-control" required>
						    </div>
						    <div>
						    	<label for="Subject">Subject</label>
						    	<textarea id="Subject" name="subject" required></textarea>
						    </div>
						   <div>
							   <button id="Button Submit" name="Button Submit" class="btn btn-danger" type="submit" onsubmit="">Submit</button>
						   </div>
					  </form>


				  </div>
  				</div><div class="clear"></div>
			</div>
		</div>
				<div class="header-para">
					<div class="categories">
						<div class="list-categories">
							<div class="first-list">
								<div class="div_2"><a href="/carselection">Cars</a></div>
								<div class="div_img">
								</div>
								<div class="clear"></div>
							</div>
							<div class="first-list">
								<div class="div_2"><a href="/reservations">Rental</a></div>
								<div class="div_img">
								</div>
								<div class="clear"></div>
							</div>
							<div class="first-list">
								<div class="div_2"><a href="/branches">Branches</a></div>
								<div class="div_img">
								</div><div class="clear"></div>
							</div>

							<div class="first-list">
								<div class="div_2"><a href="/faq">FAQ</a></div>
								<div class="div_img">
								</div><div class="clear"></div>
							</div>

							<div class="first-list">
								<div class="div_2"><a href="/terms">Terms and Conditions</a></div>
								<div class="div_img">
								</div><div class="clear"></div>
							</div>
						</div>

						<div class="clear"></div>
					</div>
				</div>
	</div>
		<div class="clear"></div>
		<div class="footer-bottom">
			<div class="copy">
				<p>All rights Reserved | Design by Tudor Butiri</p>
			</div>
		</div>
</div>
</div>
</div>
</div>
</div>
</div>
<script src="<c:url value = "resources/js/password-comparison.js" />"></script>
</body>
</html>

    	
    	
            