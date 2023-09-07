puts "fibonaccio series"
n1=0
n2=1
puts n1
puts n2
for i in 0...5 do
   n3=n1+n2
   puts n3
   n1=n2
   n2=n3
end
