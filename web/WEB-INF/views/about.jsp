<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/views/include.jsp" %>

<!DOCTYPE HTML>
<html>
<head>
<title>ELCAR-Rent | About</title>
	<link rel="stylesheet" type="text/css" href="resources/css/style.css" media="all" />
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script src="<c:url value = "resources/js/script.js" />"></script>
	<script src="<c:url value = "resources/js/superfish.js" />"></script>

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
						<li class="active"><a href="/about">About</a></li>
						<li><a href="/carselection">Car Selection</a></li>
						<li><a href ="/reservations">Reservations</a></li>
						<li><a href="/articles">Articles</a></li>
						<li><a href="/contact">Contact</a></li>
					</ul>
					<div class="clear"></div> 
				</div>
		</div>
		<div class="banner-top">
			<div class="header-bottom">
				 <div class="header_bottom_right_images">
				 	<div class="about_wrapper"><h1>Long-Term Business</h1>
					</div>
				    <div class="about-group">
		  			<div class="about-top">
						<div class="grid images_3_of_1">
							<img src="resources/images/pic7.jpg" alt=""/>
						</div>
						<div class="grid span_2_of_3">
							<h3>Drive Luxury Cars nationwide with ELCAR</h3>
							<p>ELCAR offers luxury car rentals in over 6 locations from Romania, making it convenient to drive in style no matter where you might be. We stand by our motto of driving premium cars at affordable prices. ELCAR rent a car offers everything you would like from a luxury car rental company which contains vehicles such as convertibles, SUV?s, sports cars, exotic cars and fantasy cars for a bargain.</p>
							<p>Our fleet changes depending on which city you are planning to rent from us from, however we have luxury cars at our locations. If you would like to drive a BMW, Audi or Mercedes-Benz, ELCAR offers these brands at almost every one of our car rental locations. Check our "Specials" section. </p>
						</div><div class="clear"></div>
					</div>
			   <p class="about-para"></p><div class="clear"></div>
			  	<%--<button class="btn btn-6 btn-6a">Read More</button> --%>
			   <div class="carsgeneralpresentation">
						<h2>Luxury and Exotic Cars</h2>
						<p>Below you will be able to see some of the most popular luxury cars you will be able to rent from Sixt.</p>
					    <div class="section group">
							<div class="grid_1_of_3 images_1_of_3">
								  <h3>Mercedes Benz S-Class</h3>
								  <img src="resources/images/mercedesBenzSClass.png" alt=""/>

							</div>
							<div class="grid_1_of_3 images_1_of_3">
								<h3>BMW 6 Series</h3>
								<img src="resources/images/bmw6Series.png" alt=""/>
							</div>
							<div class="grid_1_of_3 images_1_of_3">
								<h3>Mercedes Benz G-Class </h3>
								<img src="resources/images/mercedesBenzGClass.png" alt=""/>
							</div><div class="clear"></div>
				        </div>
				  </div>
						<div class="carsgeneralpresentation">
							<p>If you would like to make heads turn while you are traveling, ELCAR also offers exotic vehicles at certain locations.</p>
							<div class="section group">
								<div class="grid_1_of_3 images_1_of_3">
									<h3>Mercedes Benz SLK</h3>
									<img src="resources/images/mercedesBenzSlk.png" alt=""/>

								</div>
								<div class="grid_1_of_3 images_1_of_3">
									<h3>Range Rover Evoque</h3>
									<img src="resources/images/rangeRoverEvoque.jpg" alt=""/>

								</div>
								<div class="grid_1_of_3 images_1_of_3">
									<h3>Jaguar F-Type </h3>
									<img src="resources/images/jaguarFType.png" alt=""/>
									<%--<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor.</p>--%>
								</div><div class="clear"></div>
							</div>
						</div>

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
</body>
</html>

    	
    	
            