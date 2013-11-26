<!DOCTYPE html>
<html lang="en">
<head>
<title></title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<link rel="stylesheet" href="css/reset.css" type="text/css" media="all">
<link rel="stylesheet" href="css/layout.css" type="text/css" media="all">
<link rel="stylesheet" href="css/style.css" type="text/css" media="all">
<link rel="stylesheet" href="css/zerogrid.css">
<link rel="stylesheet" href="css/responsive.css">
<link rel="stylesheet" href="css/tcal.css"> 
<script type="text/javascript" src="js/tcal.js"></script>
<script type="text/javascript" src="js/jquery-1.5.2.js" ></script>
<script type="text/javascript" src="js/atooltip.jquery.js"></script>
<script type="text/javascript" src="js/kwicks-1.5.1.pack.js"></script>
<script type="text/javascript" src="js/script.js"></script>
<script src="js/css3-mediaqueries.js"></script>
</head>
<body id="page1">
<div class="body1">
	<div class="body2">
		<div class="main">
<!-- header -->
			<header>
				<h1><a href="index.html" id="logo"><img src="images/godzilla_logo2.png"/><img src="images/title2.png"/></a></h1>
			</header>
			<div class="ic"></div>
<!-- / header -->
<!-- content --> 
			<section id="content">
				<div class="cont_bot_left"></div>
				<div class="cont_bot_right"></div>
				<div class="cont_top_left"></div>
				<div class="cont_top_right"></div>
				<div class="inner">
					<div class="kwiks_wrap">
						<ul class="kwicks horizontal"> 
							<li id="page_1">
								<jsp:include page="pages/home.jsp" flush="true"/>
							</li>
							<li id="page_2">
								<jsp:include page="pages/messages.jsp" flush="true"/>
							</li>
							<li id="page_3">
								<jsp:include page="pages/profiles.jsp" flush="true"/>
							</li>
							<li id="page_4">
								<jsp:include page="pages/search.jsp" flush="true"/>
							</li>
							<li id="page_5">
								<jsp:include page="pages/account.jsp" flush="true"/>
							</li>
						</ul>
					</div>
				</div>
			</section>

<!-- / content -->
<!-- footer -->
			<footer>
				<div class="wrapper">
					<ul id="icons">
						<li><a href="#" class="normaltip" title="Facebook"><img src="images/icon1.png" alt=""></a></li>
						<li><a href="#" class="normaltip" title="Stumble Upon"><img src="images/icon3.png" alt=""></a></li>
						<li><a href="#" class="normaltip" title="Twitter"><img src="images/icon4.png" alt=""></a></li>
					</ul>
				</div>
				Spirit Media Corporation &copy;2014<br/>
			</footer>
<!-- / footer -->
		</div>
	</div>
</div>
</body>
</html>