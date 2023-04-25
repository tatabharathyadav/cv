<HTML>
<BODY>
<form action="AdditionPHP.php" method="post">
<label for ="name" > Enter First Number:</label>
<input type="number" name="number1" ><br><br>
<hr>
Enter Second Number:
<input type="number" name="number2" ><br><br>
<hr>
<input type="submit" name="submit" value="Add">
<input type="reset" value="reset">
</form>

<?php
$number1=$_POST['number1'];
$number2=$_POST['number2'];

echo "sum of ",$number1 ,"and" ,$number2 ,"is" ,($number1+$number2);

?> 