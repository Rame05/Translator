﻿<%@ page language="java" contentType="text/html" %>
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
				${errorMessage} 
		</form>
		
		<div class='large_logo'>
			<img src="images/large_logo880x394.png">
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
		<div style="height:200px"></div>
		<div class="choose_container">	
		<div class="choose">
                <div class="head_title">
                <h1>
					To Translate
				</h1>
                </div>
				<br><br>
				<div class="float-shadow" onclick='window.location = "registrCl.jsp"'>
				Шукаю перекладача
				</div>
        </div>
		
		<div class="choose">
                <div class="head_title">
				<h1>
					A Translator
				</h1>
				<br><br>
                </div>
				<div class="float-shadow" onclick='window.location = "secondStep.jsp"'>
					Шукаю переклад
				</div>
        </div>
	
	</div>
		<ul class="container">
			<li>
				<div id="speed">
					<img src="images/alarm-clock-icon.png">
					<div class="info">
						<h2>Швидкість</h2><br>
							Команда перекладачів виконає Ваше замовлення у найкоротший термін
					</div>
				</div>
			</li>
			<li>
				<div id="quality">
					<img src="images/badge-icon.png">
					<div class="info">
						<h2>Якість</h2>
					<br>
						До перекладу замовлень допускаються професіонали, що уже підтвердили свій кваліфікаційний рівень
					</div>
				</div>
			</li>
			<li>
				<div id="simplicity">
					<img src="images/bulb-icon.png">
					<div class="info">
						<h2>Простота</h2>
					<br>
						Декілька напискань і Ваш переклад готово
					</div>
				</div>
			</li>
		</ul>
		
	
	
	<div class="copyrights">Copyright 2014, “KUGO LTD”</div>
	</body>

</html>