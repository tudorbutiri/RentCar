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
                            <li><a href ="/reservations">Reservations</a></li>
                            <li class="active"><a href="/articles">Articles</a></li>
                            <li><a href="/contact">Contact</a></li>
                        </ul>
                        <div class="clear"></div>
                    </div>
                </div>
                <div class="banner-top">
                    <div class="header-bottom">
                        <div class="header_bottom_right_images">
                            <div class="about_wrapper"><h2>6 Reasons to rent a luxury car</h2>
                            </div>

                            <div class="about-group">

                            </div>
                            <p>Why rent a car? There are so many reasons to head over to your favorite rental car services' websites or local branch that we made a list for you.</p>

                            <li><strong>End Your Wedding with a Bang</strong><br/>You've probably seen the scenes in movies where a newly wedded couple rides off to their honeymoon in a fantastic vehicle. You can do that too, no matter what your wedding budget is, by renting a car instead of buying one. Most rental car services offer convertibles and luxury cars that will make your guests' jaws drop during your cinematic exit.<br/></li>
                            <br/><li><strong>A First-class High School Reunion Arrival</strong><br/> As with your wedding, you want to arrive at and leave your high school reunion in style. Even if you never became the success you promised everyone you'd become, you can still look like you did. Go by your local car rental office or browse their website to find a car that conveys the message you want to send.<br/></li>
                            <br/><li><strong>First Date, First Impression</strong><br/> If you haven't had your wedding or a high school reunion, you may be more concerned about your dating life. They say that first impressions are everything, so why not pick up your date in a nice, clean car?<br/><br/> Choose a car that represents who you are and you will make a great first impression.<br/></li>
                            <br/><li><strong>Road Tripping with a Rental</strong><br/> There are several reasons to rent a car for a long road trip:<br/>
                                1. You save wear and tear on your own car<br/>
                                2. You avoid adding mileage to your personal car's odometer that would depreciate its value.<br/>
                                3. You can save money by choose a rental car that gets better gas mileage than your own car.<br/>
                                4. A smart rental choice can keep you and your travelers comfortable by providing more seating options and plenty of room for your luggage.<br/></li>
                            <br/><li><strong>Trip Convenience</strong><br/> If a road trip is not your style, you'll still need a way to get around after you get off the plane. Renting a car is often more cost effective than using a cab to get around and it is much more convenient than having family members or friends drive you around while you're visiting their city.<br/></li>
                            <br/><li><strong>Moving in Style</strong><br/> Whenever you need to move or need to help a friend move, try renting a moving truck from a car rental office. Renting a truck will save your vehicle from dings and scratches, and give you more room to transport items, which equals fewer trips and less gas.</li>
                            <br/><p>See? Rental cars are more than just backups for when your car is in the shop. The next time you have an important event in your life, ask yourself, "Is this a good time to rent a car?"</p>
                            <br/><a target="_blank" href="http://www.toptenreviews.com/services/articles/6-reasons-to-rent-a-car/">Source of the article</a>
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



