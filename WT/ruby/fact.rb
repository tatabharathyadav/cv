puts "enter number"
num=gets.chomp.to_i
def fact(num)
  n=1
  for i in 1..num
     n=n*i
  end
  return n
end
x=fact(num)
puts("factorial number is #{x}")