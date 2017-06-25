<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/views/include.jsp" %>

<!DOCTYPE HTML>
<html>
<head>
    <title>Free Cars-Online Website Template | About :: w3layouts</title>
    <link rel="stylesheet" type="text/css" href="resources/css/style.css" media="all" />
    <link rel="stylesheet" type="text/css" href="resources/css/bootstrap.css" media="all" />

    <script src="<c:url value = "resources/js/bootstrap.js" />"></script>
    <script src="<c:url value = "resources/js/jquery.min.js" />"></script>
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
                            <ul class="user_menu"><li class="act first"></li><li class=""><a href="/register"><div class="button-t"><span>Create Account</span></div></a></li><li class=""><a href="/login"><div class="button-t"><span>Login to Account</span></div></a></li><li class="last"><a href="/myaccount"><div class="button-t"><span>My Account</span></div></a></li></ul>
                        </div>
                        <div class="clear"></div>
                    </div>
                </div>
                <div class="menu">
                    <div class="top-nav">
                        <ul>
                            <li><a href="/index">Home</a></li>
                            <li><a href="/about">About</a></li>
                            <li><a href="/specials">Specials</a></li>
                            <li class="active"><a href ="/reservations">Reservations</a></li>
                            <li><a href="/new">New</a></li>
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

                                        <form class="form-horizontal">
                                            <fieldset>
                                        <div class="form-group">
                                            <label class="col-md-4 control-label" for="tourselection">Please select the car</label>
                                            <div class="col-md-4">
                                                <select id="tourselection" name="tourselection" class="form-control">
                                                    <option value="1">Charter Fishing Trip</option>
                                                    <option value="2">Booze Cruise</option>
                                                    <option value="3">Kayak per person</option>
                                                    <option value="4">Airboat</option>
                                                </select>
                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <label class="col-md-4 control-label" for="Address">Car description</label>
                                            <div class="col-md-4">
                                                <textarea class="form-control" id="Address" name="Address">Car description</textarea>
                                            </div>
                                        </div>

                                                </fieldset>
                                            </form>
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
                                        <div class="div_2"><a href="">Cars</a></div>
                                        <div class="div_img">
                                            <img src="resources/images/car1.jpg" alt="Cars" title="Cars" width="60" height="39">
                                        </div><div class="clear"></div>
                                    </div>
                                    <div class="first-list">
                                        <div class="div_2"><a href="">Rental</a></div>
                                        <div class="div_img">
                                            <img src="resources/images/car2.jpg" alt="Cars" title="Cars" width="60" height="39">
                                        </div><div class="clear"></div>
                                    </div>
                                    <div class="first-list">
                                        <div class="div_2"><a href="">Banking</a></div>
                                        <div class="div_img">
                                            <img src="resources/images/car3.jpg" alt="Cars" title="Cars" width="60" height="39">
                                        </div><div class="clear"></div>
                                    </div>
                                    <div class="first-list">
                                        <div class="div_2"><a href="">Trucks</a></div>
                                        <div class="div_img">
                                            <img src="resources/images/car4.jpg" alt="Cars" title="Cars" width="60" height="39">
                                        </div><div class="clear"></div>
                                    </div>
                                </div>
                                <div class="box">
                                    <div class="box-heading"><h1><a href="#">Cart:&nbsp;</a></h1></div>
                                    <div class="box-content">
                                        Now in your cart&nbsp;<strong> 0 items</strong>
                                    </div>
                                </div>
                                <div class="box-title">
                                    <h1><span class="title-icon"></span><a href="">Specials</a></h1>
                                </div>
                                <div class="section group example">
                                    <div class="col_1_of_2 span_1_of_2">
                                        <img src="resources/images/pic21.jpg" alt=""/>
                                        <img src="resources/images/pic24.jpg" alt=""/>
                                        <img src="resources/images/pic25.jpg" alt=""/>
                                        <img src="resources/images/pic27.jpg" alt=""/>
                                    </div>
                                    <div class="col_1_of_2 span_1_of_2">
                                        <img src="resources/images/pic22.jpg" alt=""/>
                                        <img src="resources/images/pic23.jpg" alt=""/>
                                        <img src="resources/images/pic26.jpg" alt=""/>
                                        <img src="resources/images/pic28.jpg" alt=""/>
                                    </div><div class="clear"></div>
                                </div>
                            </div>
                        </div>
                        <div class="clear"></div>
                        <div class="footer-bottom">
                            <div class="copy">
                                <p>All rights Reserved | Design by <a href="http://w3layouts.com">W3Layouts</a></p>
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



