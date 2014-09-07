<%@ page language="java" contentType="text/html" %>
<!Doctype html>
<html>
	<head>
		<link rel="icon" href="images/pen.ico" type="image/x-icon">
		<title>Kugo</title>
		<meta charset="utf-8">
		<!-- Latest compiled and minified CSS -->
		<link rel="stylesheet" href="bootstrap.css">

		<link type="text/css" rel="stylesheet" href="css.css">
		<script type="text/javascript" src="jquery-1.11.1.js"></script>
		<script type="text/javascript" src="js.js"></script>
	</head>

	<body>
		<header>
			<ul id="topmenu">
				<li class="logo">
					<img src="images/logo_264x7.png">
				</li>
				<li>
					<div id="enject" >
						<img src="images/enject_small.png" >
					</div>
				</li>
				<li class='sign-in'>
					<button type="button" class="btn btn-default navbar-btn">Sign in</button>
				</li>
			</ul>
		</header>
		<div class="choose-container">
			<form class="lang-form">
				<div class="source-container">
					<label>Source:</label>
					<div>
						<input type="checkbox" class="checkbox" id="ukr" value="Ukrainian" />
						<label for="ukr">Ukrainian</label>
					</div>
					<div>
						<input type="checkbox" class="checkbox" id="rus"  value="Russian"/>
						<label for="ukr">Russian</label>
					</div>
					<div>
						<input type="checkbox" class="checkbox" id="eng" value="English"/>
						<label for="ukr">English</label>
					</div>
				</div>
				<div class="source-container">
					<label>Target:</label>
					<div>
						<input type="checkbox" class="checkbox" id="ukr"  value="Ukrainian"/>
						<label for="ukr">Ukrainian</label>
					</div>
					<div>
						<input type="checkbox" class="checkbox" id="rus"  value="Russian"/>
						<label for="ukr">Russian</label>
					</div>
					<div>
						<input type="checkbox" class="checkbox" id="eng" value="English"/>
						<label for="ukr">English</label>
					</div>
				</div>
				<button class="save-lang" onclick="return false;">Move on!</button>
			</form>
		</div>
			
		</div>
		<ul class="footer">
			<li id="left_footer">
			<h3><b>Kugo</b> Ltg</h3>
			</li>
			<li id="right_footer">
				<div><a>Ukrainin</a></div>
				<div><a>Russian</a></div>
				<div><a>English</a></div>
			</li>
		</ul>
	<div class="copyrights">Copyright 2014, “KUGO LTD”</div>
	</body>

</html>