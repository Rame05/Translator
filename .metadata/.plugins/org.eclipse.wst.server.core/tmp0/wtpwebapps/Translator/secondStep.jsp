<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
				<li class='sign-in'>
					<button type="button" class="btn btn-default navbar-btn">Sign in</button>
				</li>
			</ul>
		</header>
		<form id="loginForm" class="registration-form" method="POST" action="Login">
			    <div class="form-group">
			        <label for="inputEmail">Email</label>
			        <input type="email" name="email" class="form-control" id="inputEmail" placeholder="Email" required>
			    </div>
			    <div class="form-group">
			        <label for="inputPassword">Пароль</label>
			        <input type="password" name="password" class="form-control" id="inputPassword" placeholder="Пароль" required>
			    </div>
			    <div class="checkbox">
			        <label><input type="checkbox"> Запам'ятати мене</label>
			    </div>
			    <button type="submit" class="btn btn-primary" >Увійти</button>
				<button class="btn btn-primary exit">Вийти</button> 
		</form>
		
		<div class="top_filler"></div>
		
		<!-- Main body -->
		<div class="choose_container">
			<div class="left_column">
				<h2>I want to translate:</h2>
				<textarea id="sourceText"></textarea>
			</div>
			<div class="right_column">
				<h2 style="text-align:center">Your order:</h2>
				<div></div>
				Language
				<div id="inputedLanguage"></div>
				Type of translate
				<div id="inputedType"></div>
				Quantity of symbols
				<div id="Quantity"> </div>
				Price
				<div id="Price"> </div>
				Delivery
				<div id="DeliveryTime"> </div>
				Additional requirements
				<textarea id="additionReq"></textarea>
			</div>
		</div>
		<div>KUGO translation garanties 100% refund </div>
		
</body>
</html>