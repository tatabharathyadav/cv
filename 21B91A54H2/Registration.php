<?php
$count=$_COOKIE["count"];
$user name=$_GET["user name"];
$pass word=$_GET["pass word"];
$email id=$_GET["email id"];
$count=$count+1;
setcookie("User".$count,$un,time()+24*60*60);
setcookie("Password".$count,$pwd,time()+24*60*60);
setcookie("eid".$count,$eid,time()+24*60*60);
setcookie("count",$count,time()+24*60*60);
print "user registered";
?>