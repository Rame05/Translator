<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		<script type="text/javascript" src="toTranslate.js"></script>
	</head>

	<body>
		<header>
			<ul id="topmenu">
				<li class="logo">
					<img src="images/logo_264x7.png" onclick='window.location="index.jsp"'>
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
		<div class="top_filler"></div>
		<div class="registr-nav">
			<div><b>Three steps to do a translation</b></div>
			
			<div class="iconItem">
				<img class="r-icon sel" src="images/1-to-translate.png" onclick='window.location = "registrCl.jsp"'>
				<div>Chose<br>language and<br>type of translation</div>
			</div>
			<img class="r-span" src="images/arrow-icon.png">
			<div class="iconItem">
				<img class="r-icon" src="images/2-to-translate.png" onclick='window.location = "secondStep.jsp"'>
				<div>Upload<br>file or type<br>your text</div>
			</div>
				<img class="r-span" src="images/arrow-icon.png">
			<div class="iconItem">
				<img class="r-icon" src="images/3-to-translate.png" onclick='window.location = "thirdStep.jsp"'>
				<div>Pay<br>and take your<br>delivery</div>
			</div>
		</div>
		<div class="choose-container">
			<form class="lang-form" name="lang-form">
			<label style="text-align:center">Chose language</label><br>
				<div class="source-container">
					<label>Source:</label>
					<div>
						<input type="radio" name="lan-src" id="ukr" value="Ukrainian" />
						<label for="ukr">Ukrainian</label>
					</div>
					<div>
						<input type="radio" name="lan-src" id="rus"  value="Russian"/>
						<label for="ukr">Russian</label>
					</div>
					<div>
						<input type="radio" name="lan-src" id="eng" value="English"/>
						<label for="ukr">English</label>
					</div>
				</div>
				<div class="source-container">
					<label>Target:</label>
					<div>
						<input type="checkbox" name="lan-trg" class="checkbox" id="ukr"  value="Ukrainian"/>
						<label for="ukr">Ukrainian</label>
					</div>
					<div>
						<input type="checkbox" name="lan-trg" class="checkbox" id="rus"  value="Russian"/>
						<label for="ukr">Russian</label>
					</div>
					<div>
						<input type="checkbox" name="lan-trg" class="checkbox" id="eng" value="English"/>
						<label for="ukr">English</label>
					</div>
				</div>
				<button class="save-lang" onclick="return false;">Move on!</button>
			</form>
			
		</div>
	<div class="choose-container" style="margin-top: 40px">
			<form class="theme-form" name="theme-form">
			<label>Chose a type of translation</label><br>
				<div class="source-container">
					<div>
						<input type="checkbox" class="checkbox" id="gen" value="General" name="theme" />
						<label for="gen">General</label>
					</div>
				</div>
				<div class="source-container">
					<div>
						<input type="checkbox" class="checkbox" id="spec"  value="Specific" name="theme"/>
						<label for="spec">Specific</label>
					</div>
					<div>
						<input type="checkbox" class="checkbox" id="tech"  value="Technology" name="theme"/>
						<label for="tech">Technology</label>
					</div>
					<div>
						<input type="checkbox" class="checkbox" id="med" value="Medicine" name="theme"/>
						<label for="med">Medicine</label>
					</div>
					<div>
						<input type="checkbox" class="checkbox" id="lit" value="Literature" name="theme"/>
						<label for="lit">Literature</label>
					</div>
					<div>
						<input type="checkbox" class="checkbox" id="law" value="Law" name="theme"/>
						<label for="law">Law</label>
					</div>
					<div>
						<input type="checkbox" class="checkbox" id="fin" value="Economix/Finance" name="theme"/>
						<label for="fin">Economix/Finance</label>
					</div>
					<div>
						<input type="checkbox" class="checkbox" id="it" value="IT"/>
						<label for="it">IT</label>
					</div>
				</div>
				<button class="save-type" onclick="return false;">Move on!</button>
			</form>
		</div>
		<div class="choose_container">
		<form action="" class="quality-form">
	    <div class="quality_level">
	       <b>Standart</b>
	       <br>
	       Recommended for
			<br>
			everyday context
			<br>
			50hm/1 translation page
			<br>
			<div style="display:inline-block">
				<input style="text-align:center" type="radio" id="str" name="quality" value="Standart" />
		   </div>
		   </div>
   
			 <div class="quality_level">
	       <b>Business</b>
			<br>
			Recommended for
			<br>
			business context
			<br>
			75hm/1 translation page
			<br>
			<div style="display:inline-block">
				<input style="text-align:center" type="radio" id="buss" name="quality" value="Business" />
		   </div>
		   </div>
		   
		    <div class="quality_level">
	       <b>Extra</b>
			<br>
			Recommended for
			<br>
			scientific materials
			<br>
			150hm/1 translation page
			<br>
			<div style="display:inline-block">
				<input style="text-align:center" type="radio" id="extr" name="quality" value="Extra" />
		   </div>
		   </div>
		</form>			
		</div>
		<button class="send-data" onclick="return false;">Send Data</button>
	</body>

</html>