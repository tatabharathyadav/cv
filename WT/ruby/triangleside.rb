puts "enter a value"
a=gets.chomp.to_i
puts "enter b value"
b=gets.chomp.to_i
puts "enter c value"
c=gets.chomp.to_i
s=(a+b+c)/2
area=Math.sqrt(s*(s-a)*(s-b)*(s-c))
puts "area of triangle is #{area}"