class Cmplx
attr_accessor :real, :imag
def read
@real=gets.to_i
@imag=gets.to_i
end
def add(other)
ob=Cmplx.new
ob.real=@real+other.real;
ob.imag=@imag+other.imag;
return ob;
end
def subtractor(other)
ob=Cmplx.new
ob.real=@real-other.real;
ob.imag=@imag-other.imag;
return ob;
end
def multiply(other)
ob=Cmplx.new
ob.real=(@real*other.real)-(imag*other.imag);
ob.imag=(@real*other.imag)+(imag*other.real);
return ob;
end
def disp
if @imag<0
puts "#{@real}#{@imag}i"
else
puts "#{@real}+#{@imag}i"
end
end
end
t1=Cmplx.new
t2=Cmplx.new
t3=Cmplx.new
t4=Cmplx.new
t5=Cmplx.new
puts "enter 1st number"
t1.read
puts "enter 2nd number"
t2.read
puts "enter FIRSTNUMBER"
t1.disp
print "SECOND NUMBER"
t2.disp
print "____________\n";
print "ADDITION:"
t3=t1.add(t2)
t3.disp
print "SUBTRACTION:"
t4=t1.subtractor (t2)
t4.disp
print "PRODUCT:"
t5=t1.multiply(t2)
t5.disp
print "__________";













