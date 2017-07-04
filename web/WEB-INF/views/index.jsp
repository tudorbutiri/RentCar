<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/views/include.jsp" %>

<!DOCTYPE HTML>
<html>
<head>
	<title>ELCAR-Rent | Home</title>
	<link rel="stylesheet" type="text/css" href="resources/css/style.css" media="all" />
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">


	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<%--<script src="<c:url value = "resources/js/script.js" />"></script>--%>
	<script src="<c:url value = "resources/js/superfish.js" />"></script>



	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<link href='http://fonts.googleapis.com/css?family=Playball' rel='stylesheet' type='text/css'>
<!--slider-->
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
						<li class="active"><a href="/index">Home</a></li>
						<li><a href="/about">About</a></li>
						<li><a href="/carselection">Car Selection</a></li>
						<li><a href="/reservations">Reservations</a></li>
						<li><a href="/articles">Articles</a></li>
						<li><a href="/contact">Contact</a></li>
					</ul>
					<div class="clear"></div> 
				</div>
		</div>
		<div class="banner-top">
			<div class="header-bottom">
				 <div class="header_bottom_right_images">
				     	<div id="slideshow">
                            <div id="myCarousel" class="carousel slide" data-ride="carousel">
                                <!-- Indicators -->
                                <!-- Wrapper for slides -->
                                <div class="carousel-inner">
                                    <div class="item active">
                                        <img src="resources/images/bann1.jpg" alt="">
                                    </div>

                                    <div class="item">
                                        <img src="resources/images/bann2.jpg" alt="">
                                    </div>

                                    <div class="item">
                                        <img src="resources/images/bann3.jpg" alt="">
                                    </div>
                                </div>

                                <!-- Left and right controls -->
                                <a class="left carousel-control" href="#myCarousel" data-slide="prev">
                                    <span class="glyphicon glyphicon-chevron-left"></span>
                                    <span class="sr-only">Previous</span>
                                </a>
                                <a class="right carousel-control" href="#myCarousel" data-slide="next">
                                    <span class="glyphicon glyphicon-chevron-right"></span>
                                    <span class="sr-only">Next</span>
                                </a>
                            </div>
				  	</div>
		  			<div class="content-wrapper">		  
						<div class="content-top">
							  	<div class="box_wrapper"><h1>Get to know us</h1></div>
							 <div class="text"> 	
								<div class="grid_1_of_3 images_1_of_3">
									<div class="grid_1">
										<a href="/carselection"><img src="resources/images/pic5.jpg" title="Car Park" alt=""></a>
											<div class="grid_desc">
												<p class="title">Exclusive Car Park</p>
												<p class="title1">Check our exclusive car park and find more details about our cars!</p>
													<div class="cart-button">
                                                        <a href="/carselection"><button class="btn btn-danger"><span>Details</span></button></a>
													<div class="clear"></div>
												</div>
											</div>
								</div><div class="clear"></div>
							</div><div class="grid_1_of_3 images_1_of_3">
                                 <div class="grid_1">
                                     <a href="/reservations"><img src="resources/images/reservationbanner.jpg" title="continue reading" alt=""></a>
                                     <div class="grid_desc">
                                         <p class="title">Reservations</p>
                                         <p class="title1">Already decided? Don't waste more time and book your dream car today!</p>
                                         <div class="cart-button">
                                             <a href="/reservations"><button class="btn btn-danger"><span>Details</span></button></a>
                                             <div class="clear"></div>
                                         </div>
                                     </div>
                                 </div><div class="clear"></div>
                             </div>
									<div class="grid_1_of_3 images_1_of_3">
										  <div class="grid_1">
										<a href="/articles"><img src="resources/images/articles.jpg" title="Articles" alt=""></a>
											<div class="grid_desc">
												<p class="title">News and Articles</p>
												<p class="title1">Why should you rent a luxury car? Check out what the experts say!</p>
													<div class="cart-button">
                                                        <a href="/articles"><button class="btn btn-danger"><span>Details</span></button></a>
													<div class="clear"></div>
												</div>
											</div>
								</div><div class="clear"></div>
									</div>
									<div class="clear"></div>
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

    	
    	
            