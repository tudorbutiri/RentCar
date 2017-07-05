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
                            <div class="about_wrapper"><h2>Terms and conditions</h2>
                            </div>

                            <div class="about-group">

                            </div>
                            <strong>1. Definitions</strong><br/>“Agreement” means the Terms and Conditions on this page and the provisions found on
                                the Page. “You” or “your” means the person identified as the renter in this Agreement, any person
                                signing this Agreement, any Authorized Driver, and any person or organization to whom charges are
                                billed by us at its or the renter‘s direction.<br/>
                            <br/><strong>2. Rental, Indemnity and Warranties</strong><br/>This is a contract for rental of the Vehicle. We may terminate
                            this Agreement and repossess the Vehicle at your expense without notice to you, if you breach this
                            Agreement or if the Vehicle is abandoned or used in violation of law or this Agreement. You agree to
                            indemnify us, defend us and hold us harmless from all claims, liability, costs and attorney fees we
                            incur resulting from or arising out of this rental and your use of the Vehicle. We make no warranties,
                            express, implied or apparent, regarding the Vehicle, no warranty of merchantability and no
                            warranty that the Vehicle is fit for a particular purpose. You agree not to alter the vehicle or any
                            Optional Equipment. If you or an Authorized Driver determine the Vehicle or any Optional Equipment
                            is unsafe, you or the Authorized Driver shall stop operating the vehicle or Optional Equipment and
                            notify us immediately.<br/>
                            <br/><strong>3. Telematics Notice and Release</strong><br/>You acknowledge that the Vehicle may be equipped with a telematics
                            device, global positioning satellite (“GPS”) technology, an electronic locator device, and/or an event
                            data recorder. We may find, monitor, or disable the Vehicle through such systems if we deem it necessary,
                            without warning or notice, to the extent permitted by applicable law. Remote monitoring may include the
                            collection of Vehicle data, such as location, odometer, oil life, fuel level, tire pressure, battery charge, diagnostic
                            trouble codes, and other elements that we may deem necessary. You should have no expectation
                            of privacy related to the use of this Vehicle.<br/>
                            <br/><strong>4. Condition and Return of Vehicle.</strong><br/> You must return the Vehicle to our rental office or other location we
                            identify, on the date and time specified in this Agreement, and in the same condition that you received it,
                            except for ordinary wear. If the Vehicle is returned to any other office or location or left somewhere other
                            than the office or location identified by us, you remain responsible for the safety of and damage to or loss
                            of the Vehicle until we inspect it. In addition, you authorize us to charge your credit or debit card a one-way
                            charge or service fee plus any additional costs incurred by us in the return of the Vehicle. <br/>
                            <br/><strong>5. Responsibility for Damage or Loss; Reporting to Police; for Tolls and Parking Violations.</strong><br/> You are
                            responsible for all damage to, and for loss or theft of, the Vehicle including damage caused by weather,
                            road conditions and acts of nature, even if you are not at fault. You are responsible for the cost of repair,
                            or the actual cash retail value of the Vehicle on the date of the loss if the Vehicle is not repairable or if we
                            elect not to repair the Vehicle. You are also responsible for Loss of Use (without regard to fleet utilization),
                            Diminished Value, and our administrative expenses incurred processing a claim. You must report all accidents
                            and incidents of theft and vandalism to us and the police as soon as you discover them. You are
                            responsible for paying the charging authorities directly all parking citations, toll fees, fines for toll evasion,
                            and other fees, fines and penalties assessed against you, us, or the Vehicle during this rental. If you fail
                            to pay any of these charges and we pay any part of them, you will reimburse us for all such charges<br/>
                            <br/><strong>6. Your Property.</strong><br/> You release us, our agents and employees from all claims for loss of or
                            damage to your personal property, including digital data or information from any mobile
                            device that you link to any telematics device or system in the Vehicle, or that of any other
                            person, that we received, handled or stored, or that was left or carried in or on the Vehicle
                            or in any service vehicle or in our offices, whether or not the loss or damage was caused
                            by our negligence or was otherwise our responsibility.<br/>

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