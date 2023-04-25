<?php
 $user = $_COOKIE['user'];
 $pwd = $_COOKIE['pwd'];
 if ($user == "hello") {
 if ($pwd == "1")
 echo "<h2>Welcome $user</h2>";
 else
 echo "<h2>You are not an authenticated user.</h2>";
 } elseif ($user == "sri") {
 if ($pwd == 2)
 echo "<h2>Welcome $user</h2>";
 else
 echo "<h2>You are not an authenticated user.</h2>";
 } elseif ($user == "teja") {
 if ($pwd == "3")
 echo "<h2>Welcome $user</h2>";
 else
 echo "<h2>You are not an authenticated user.</h2>";
 } elseif ($user == "user4") {
 if ($pwd == "pwd4")
 echo "<h2>Welcome User4</h2>";
 else
 echo "<h2>You are not an authenticated user.</h2>";
 } else
 echo "<h2>Invalid Username/Password</h2>";
 ?>