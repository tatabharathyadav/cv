<?php 
$server="itserver2";
    $user="root";
    $pass="root";
    $dbname="21B91A54H2";
    $con =mysqli_connect($server,$user,$pass,$dbname);
    if(!$con)
    {
        die("Error : :  ".mysqli_connect_error());}
if(isset($_POST['user']))
{
$uname=$_POST['user'];
$pass=$_POST['pwd'];
$query = "select * from validation where uname='$user' and pass ='$pwd'";
$res = mysqli_query($con,$query);
$count=mysqli_num_rows($res);
if($count)
echo "<script>alert('Welcome $uname');</script>";
else
echo "<br/><br/><br/><h2 align='center'>Invalid Username/Password/Try again!!!!!</h2>";
}
?>