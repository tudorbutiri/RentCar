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

    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link href='http://fonts.googleapis.com/css?family=Playball' rel='stylesheet' type='text/css'>

    <meta name="viewport" content="initial-scale=1.0, user-scalable=no">
    <meta charset="utf-8">

    <style>
        /* Always set the map height explicitly to define the size of the div
         * element that contains the map. */
        #map {
            height: 400px;
            /*position: relative;*/
        }
        /* Optional: Makes the sample page fill the window. */
        html, body {
            height: 800px;
            margin: 0;
            padding: 0;
            /*position: relative;*/
        }
    </style>

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
                            <div class="about_wrapper"><h2>Check our locations</h2>
                            </div>
                            <div class="about-group">

                                <div class="container">
                                    <div class="row-fluid">
                                        <div class="col-md-8">

                                            <div id="map"></div>
                                            <script>
                                                function initMap() {

                                                    var options = {
                                                        zoom: 6,
                                                        center: {lat: 45.9432, lng: 24.9668}
                                                    }
                                                    var map = new google.maps.Map(document.getElementById('map'), options);

                                                    //Add marker function


//                                                    addMarker({
//                                                        coords:{lat: allBranches.get(0).latitude, lng: allBranches.get(0).longitude},
//                                                        content:'<h3>Apare?</h3>'});
//                                                    addMarker({coords:{lat: 45.7489, lng: 21.2087}});
//                                                    addMarker({coords:{lat: 47.1585, lng: 27.6014}});
//                                                    addMarker({coords:{lat: 44.4268, lng: 26.1025}});
//
                                                    <%--var listBranchesJS = [--%>
                                                        <%--<c:forEach var="item" items="${allBranches}">--%>
                                                        <%--<c:out value="${item}"/>,--%>
                                                        <%--</c:forEach>--%>
                                                    <%--];--%>



                                                    addMarker({
                                                        coords:{lat: ${allBranches.get(0).latitude}, lng: ${allBranches.get(0).longitude}},
                                                        content:'<h6>${allBranches.get(0).name}</h6>'});

                                                    addMarker({
                                                        coords:{lat: ${allBranches.get(1).latitude}, lng: ${allBranches.get(1).longitude}},
                                                        content:'<h6>${allBranches.get(1).name}</h6>'});

                                                    addMarker({
                                                        coords:{lat: ${allBranches.get(2).latitude}, lng: ${allBranches.get(2).longitude}},
                                                        content:'<h6>${allBranches.get(2).name}</h6>'});

                                                    addMarker({
                                                        coords:{lat: ${allBranches.get(3).latitude}, lng: ${allBranches.get(3).longitude}},
                                                        content:'<h6>${allBranches.get(3).name}</h6>'});

                                                    addMarker({
                                                        coords:{lat: ${allBranches.get(4).latitude}, lng: ${allBranches.get(4).longitude}},
                                                        content:'<h6>${allBranches.get(4).name}</h6>'});

                                                    addMarker({
                                                        coords:{lat: ${allBranches.get(5).latitude}, lng: ${allBranches.get(5).longitude}},
                                                        content:'<h6>${allBranches.get(5).name}</h6>'});

                                                    var currWindow = false;

                                                    function addMarker(props){
                                                        var image = 'https://developers.google.com/maps/documentation/javascript/examples/full/images/beachflag.png';
                                                        var marker = new google.maps.Marker({
                                                            position: props.coords,
                                                            map: map,
                                                            icon:image
                                                        });
                                                        if(props.content)
                                                            var infoWindow = new google.maps.InfoWindow({
                                                                content:props.content
                                                            });
                                                            marker.addListener('click', function(){
                                                                if( currWindow ) {
                                                                    currWindow.close();
                                                                }
                                                                currWindow = infoWindow;
                                                                infoWindow.open(map, marker);
                                                                map.setZoom(14);
                                                                map.setCenter(marker.getPosition());
                                                            });
                                                        }}
                                            </script>
                                            <script async defer
                                                    src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAHO6a5zUCX1qErzPlgmJEVN_2BMG-W5tE&callback=initMap">
                                            </script>

                                        </div>

                                        <c:forEach items="${allBranches}" var="item">
                                            <div class="col-md-3">
                                                <address>
                                                    <strong>${item.agency.name}</strong><br>
                                                    Branch: ${item.name}<br>
                                                    City: ${item.cityName}<br>
                                                    Address:${item.streetName}, ${item.streetNumber}<br>
                                                    Postal code: ${item.postalCode}<br>
                                                    Phone Number: ${item.phoneNumber}<br>
                                                    Romania<br>
                                                </address>
                                            </div>
                                        </c:forEach>
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



