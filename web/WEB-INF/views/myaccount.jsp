<%@ include file="/WEB-INF/views/include.jsp" %>

<!DOCTYPE HTML>
<html>
<head>
    <title>Luxury Cars - Rent a car | Register</title>
    <link rel="stylesheet" type="text/css" href="resources/css/style.css" media="all" />
    <link rel="stylesheet" type="text/css" href="resources/css/bootstrap.css" media="all" />

    <script src="<c:url value = "resources/js/jquery-3.2.1.js" />"></script>
    <script src="<c:url value = "resources/js/bootstrap.js" />"></script>
    <%--<script src="<c:url value = "resources/js/script.js" />"></script>--%>
    <script src="<c:url value = "resources/js/superfish.js" />"></script>
    <script src="<c:url value = "resources/js/password-comparison.js" />"></script>

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
                            <li><a href="/specials">Specials</a></li>
                            <li><a href ="/reservations">Reservations</a></li>
                            <li><a href="/new">New</a></li>
                            <li><a href="/contact">Contact</a></li>
                        </ul>
                        <div class="clear"></div>
                    </div>
                </div>
                <div class="banner-top">
                    <div class="header-bottom">
                        <div class="header_bottom_right_images">
                            <form role="form" data-toggle="validator" method="POST" action="/myaccount" modelAttribute="myAccountModelAttribute" class="form-horizontal" id="submitForm" >

                                <fieldset>
                                    <!-- Form Name -->
                                    <legend>My Account Details</legend>

                                    <div class="form-group">
                                        <span class="error">${loginSuccessful}</span>
                                    </div>

                                    <!-- Text input-->
                                    <div class="form-group">
                                        <label class="col-md-4 control-label" for="companyName">Company Name</label>
                                        <div class="col-md-6">
                                            <input value="${customer.companyName}" id="companyName" name="companyName" type="text" placeholder="If not applicable, leave blank" class="form-control input-md" readonly/>
                                        </div>
                                    </div>

                                    <!-- Text input-->
                                    <div class="form-group">
                                        <label class="col-md-4 control-label" for="email">Email</label>
                                        <div class="col-md-6">
                                            <input value="${customer.email}" id="email" name="email" type="text" placeholder="Email" class="form-control input-md" required="" readonly/>
                                            <span class="error">${emailNotAvailable}</span>
                                        </div>
                                    </div>

                                    <!-- Text input-->
                                    <div class="form-group">
                                        <label class="col-md-4 control-label" for="firstName">First Name </label>
                                        <div class="col-md-6">
                                            <input value="${customer.firstName}" id="firstName" name="firstName" type="text" placeholder="First Name" class="form-control input-md" required="" readonly/>
                                        </div>
                                    </div>

                                    <!-- Text input-->
                                    <div class="form-group">
                                        <label class="col-md-4 control-label" for="lastName">Last Name</label>
                                        <div class="col-md-6">
                                            <input value="${customer.lastName}" id="lastName" name="lastName" type="text" placeholder="Last Name" class="form-control input-md" required="" readonly/>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label class="col-md-4 control-label" for="cityName"> City name</label>
                                        <div class="col-md-6">
                                            <input value="${customerAddress.cityName}" id="cityName" name="cityName" type="text" placeholder="City Name" class="form-control input-md" required="" readonly/>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label class="col-md-4 control-label" for="phoneNumber"> Phone number </label>
                                        <div class="col-md-6">
                                            <input value="${customerAddress.phoneNumber}" id="phoneNumber" name="phoneNumber" type="text" placeholder="Phone Number" class="form-control input-md" required="" readonly/>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label class="col-md-4 control-label" for="streetName"> Street name </label>
                                        <div class="col-md-6">
                                            <input value="${customerAddress.streetName}" id="streetName" name="streetName" type="text" placeholder="Street Name" class="form-control input-md" required="" readonly/>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label class="col-md-4 control-label" for="streetNumber"> Street number </label>
                                        <div class="col-md-6">
                                            <input value="${customerAddress.streetNumber}" id="streetNumber" name="streetNumber" type="text" placeholder="Street Number" class="form-control input-md" required="" readonly/>
                                        </div>
                                    </div>

                                    <!-- Button -->
                                    <div class="form-group">
                                        <label class="col-md-4 control-label"></label>
                                        <div class="col-md-2">
                                            <a href="changeaccountdetails" class="btn btn-danger" role="button">Edit Account</a>
                                        </div>

                                        <div class="col-md-4">
                                            <a href="changepassword" class="btn btn-danger" role="button">Change Password</a>
                                        </div>

                                    </div>

                                </fieldset>
                            </form>


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