<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/views/include.jsp" %>

<!DOCTYPE HTML>
<html>
<head>
    <title>ELCAR-Rent | Articles</title>
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
                            <div class="about_wrapper"><h2>Frequently asked questions</h2>
                            </div>
                            <div>
                                <button type="button" class="btn" data-toggle="collapse" data-target="#demo">1. What is included in the price?</button>
                                <div id="demo" class="collapse">
                                    <p>Unless otherwise stated the rental quote/price displayed on the final page when booking includes
                                        the daily rate, statutory taxes, additional extras (if selected) and all applicable surcharges and fees.
                                        Check our Rental Information page for country specific information.</p>
                                </div>
                            </div>

                            <div>
                            <button type="button" class="btn" data-toggle="collapse" data-target="#demo1">2. Can I rent a specific car model?</button>
                            <div id="demo1" class="collapse">
                                <p>No. Reservations are only guaranteed for the selected car category.</p>
                            </div>
                            </div>

                            <div>
                            <button type="button" class="btn" data-toggle="collapse" data-target="#demo2">3. What documents do I need to rent a car?</button>
                            <div id="demo2" class="collapse">
                                <p>You will need to show a valid driver's license and a valid identity card.</p>
                            </div>
                            </div>

                            <div>
                            <button type="button" class="btn" data-toggle="collapse" data-target="#demo3">4. What kind of insurance is necessary to rent a car?</button>
                            <div id="demo3" class="collapse">
                                <p>In most cases your personal car insurance policy will not protect you when driving abroad.
                                    Make a thorough check before you go to see for what and where your auto insurance policy or credit card coverage applies.
                                    It is also important to ensure the coverage you choose meets the minimum coverage requirements of the country where you will rent a car.
                                    You can only refuse the purchase of mandatory rental coverage if you can provide proof of other coverage.</p>
                            </div>
                            </div>

                            <div>
                            <button type="button" class="btn" data-toggle="collapse" data-target="#demo4">5. Can I pick up a car and return it somewhere else?</button>
                            <div id="demo4" class="collapse">
                                <p>Yes, although this may incur a one-way rental fee that will be shown during the booking process.
                                    Please note: one-way rentals may be restricted if you plan on crossing borders.</p>
                            </div>
                            </div>

                            <div>
                            <button type="button" class="btn" data-toggle="collapse" data-target="#demo5">6. Do I have to pay a deposit?</button>
                            <div id="demo5" class="collapse">
                                <p>Generally, an advance charge approval is obtained for the chosen means of payment as a security.
                                    Often a deposit of up to three times the rental price is charged to the chosen means of payment as a security.
                                    The exact deposit is determined on collection since the amount is dependent on the vehicle.
                                    For example, the deposit for high-value vehicles may differ.</p>
                            </div>
                            </div>

                            <div>
                            <button type="button" class="btn" data-toggle="collapse" data-target="#demo6">7. Are there any age restrictions?</button>
                            <div id="demo6" class="collapse">
                                <p>You must be at least 21 years old with a valid driver's license of at least 2 years.</p>
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