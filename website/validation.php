<?php 
$server="itserver2";
    $username="student";
    $password="student";
    $dbname="test";
    $con =mysqli_connect($server,$user,$pass,$dbname);
    if(!$con)
    {
        die("Error : :  ".mysqli_connect_error());}
if(isset($_POST['uname']))
{
$uname=$_POST['uname'];
$pass=$_POST['pass'];
$query = "select * from registration1 where uname='$uname' and pass ='$pass'";
$res = mysqli_query($con,$query);
$count=mysqli_num_rows($res);
if($count)
echo "<script>alert('Welcome $uname');</script>";
else
echo "<br/><br/><br/><h2 align='center'>Invalid Username/Password/Try 

again!!!!!</h2>";
}
?>