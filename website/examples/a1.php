<?php      
$number1=$_POST['number1'];   
$number2=$_POST['number2'];   
?>
<html>
<body>  
<form action= "a1.php" method="post">  
Enter First Number:  
<input type="number" name="number1" /><br><br>  
Enter Second Number:  
<input type="number" name="number2" /><br><br>  
<input  type="submit" name="submit" value="Add">  
<input  type="reset"  value="reset"> 
</form>  

<?php 
    
 //$c=$number1+$number2  ;   
//echo "Sum of $number1 and $number2 is=".$c;  
echo "Sum of $number1 and $number2 is=".($number1+$number2);  
?>
 </body>  
</html>  