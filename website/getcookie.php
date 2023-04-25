<html>
<head>
 <title>Get Cookie</title>
</head>
<body>
 <?php
$user = $_POST['user'];
$pwd = $_POST['password'];
 if ($user == "student") {
 if ($pwd == "student")
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
</body>
</html>
