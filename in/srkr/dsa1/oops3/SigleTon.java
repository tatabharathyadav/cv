package in.srkr.dsa1.oops3;

public class SigleTon 
{
  int id;
  String fn;
  String ln;
  int age;
  Address address;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFn() {
	return fn;
}
public void setFn(String fn) {
	this.fn = fn;
}
public String getLn() {
	return ln;
}
public void setLn(String ln) {
	this.ln = ln;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public SigleTon(int id, String fn, String ln, int age, Address address) {
	super();
	this.id = id;
	this.fn = fn;
	this.ln = ln;
	this.age = age;
	this.address = address;
}
  

}
