<%@ include file="/WEB-INF/views/include.jsp" %>

<!DOCTYPE HTML>
<html>
<head>
    <title>ELCAR-Rent | Register</title>
    <link rel="stylesheet" type="text/css" href="resources/css/style.css" media="all" />
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src="<c:url value = "resources/js/script.js" />"></script>
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
                            <form role="form" data-toggle="validator" method="POST" action="/register" modelAttribute="registerModelAttribute" class="form-horizontal" id="submitForm" >

                                <fieldset>
                                    <!-- Form Name -->
                                    <legend>Registration</legend>

                                    <div class="form-group">
                                        <span class="error">${loginSuccessful}</span>
                                    </div>

                                    <!-- Text input-->
                                    <div class="form-group">
                                        <label class="col-md-4 control-label" for="companyName">Company Name</label>
                                        <div class="col-md-6">
                                            <input id="companyName" name="companyName" type="text" placeholder="If not applicable, leave blank" class="form-control input-md" />
                                        </div>
                                    </div>

                                    <!-- Text input-->
                                    <div class="form-group">
                                        <label class="col-md-4 control-label" for="email">Email</label>
                                        <div class="col-md-6">
                                            <input id="email" name="email" type="text" placeholder="Email" class="form-control input-md" required="" />
                                            <span class="error">${emailNotAvailable}</span>
                                        </div>
                                    </div>

                                    <!-- Text input-->
                                    <div class="form-group">
                                        <label class="col-md-4 control-label" for="firstName">First Name </label>
                                        <div class="col-md-6">
                                            <input id="firstName" name="firstName" type="text" placeholder="First Name" class="form-control input-md" required="" />
                                        </div>
                                    </div>

                                    <!-- Text input-->
                                    <div class="form-group">
                                        <label class="col-md-4 control-label" for="lastName">Last Name</label>
                                        <div class="col-md-6">
                                            <input id="lastName" name="lastName" type="text" placeholder="Last Name" class="form-control input-md" required=""/>
                                        </div>
                                    </div>

                                    <!-- Password input-->
                                    <div class="form-group">
                                        <label class="col-md-4 control-label" for="password">Password</label>
                                        <div class="col-md-6">
                                            <input id="password" name="password" type="password" placeholder="Enter Password" class="form-control" required=""/>
                                        </div>
                                    </div>

                                    <%--Re-Type password--%>
                                    <div class="form-group">
                                        <label class="col-md-4 control-label" for="retypePassword">Re-type Password</label>
                                        <div class="col-md-6">
                                            <input type="password" class="form-control" id="retypePassword" placeholder="Confirm Password"  oninput="checkPass(this)" required="">
                                            <span id="confirmMessage" class="confirmMessage"></span>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label class="col-md-4 control-label" for="cityName"> City name</label>
                                        <div class="col-md-6">
                                            <input id="cityName" name="cityName" type="text" placeholder="City Name" class="form-control input-md" required="">
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label class="col-md-4 control-label" for="phoneNumber"> Phone number </label>
                                        <div class="col-md-6">
                                            <input id="phoneNumber" name="phoneNumber" type="text" placeholder="Phone Number" class="form-control input-md" required="">

                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label class="col-md-4 control-label" for="streetName"> Street name </label>
                                        <div class="col-md-6">
                                            <input id="streetName" name="streetName" type="text" placeholder="Street Name" class="form-control input-md" required="">

                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label class="col-md-4 control-label" for="streetNumber"> Street number </label>
                                        <div class="col-md-6">
                                            <input id="streetNumber" name="streetNumber" type="text" placeholder="Street Number" class="form-control input-md" required="">
                                        </div>
                                    </div>

                                    <!-- Button -->
                                    <div class="form-group">
                                        <label class="col-md-4 control-label" for="Button Submit"></label>
                                        <div class="col-md-4">
                                            <button id="Button Submit" name="Button Submit" class="btn btn-danger" type="submit">Submit</button>
                                        </div>
                                    </div>
                                </fieldset>
                            </form>


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