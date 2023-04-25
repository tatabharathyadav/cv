<html>
<body>
<form action="sumofnum.php" method="post">
enter your first number:
<input type="number" name="num1" ><br><br>
Enter second number:
<input type="number" name="num2"><br><br>
<input type="submit" name="submit" value="Add">
<input type="reset" value="reset">
</form>

<?php
$no1=$_POST['num1'];
$no2=$_POST['num2'];
echo"sum of $no1 and $no2 is=".($no1+$no2);
?>
</body>
</html>