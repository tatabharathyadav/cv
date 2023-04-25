<?php
$un=$_POST["un"];
$pwd=$_POST["pwd"];
$cn=$_COOKIE["count"];
$c=0;
for($i=1;$i<=$cn;$i++) {
if($_COOKIE["User".$i]==$un && $_COOKIE["Password".$i]==$pwd)
{
$c=1;
}
}
if($c>0)
print "login succes";
else
print "login denied";
?>
