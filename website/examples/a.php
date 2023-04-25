<html>
<body>  
<form>  
Enter First Number:  
<input type="number" name="number1" /><br><br>  
Enter Second Number:  
<input type="number" name="number2" /><br><br>  
<input  type="submit" name="submit" value="Add">  
<input  type="reset"  value="reset"> 
</form>  
 </body>  

<?php      
@$number1=$_GET['number1'];   
@$number2=$_GET['number2'];   
$c=@$number1+@$number2  ;   
echo "Sum of $number1 and $number2 is=".$c;  
?>
</html>  