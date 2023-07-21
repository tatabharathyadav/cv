package in.srkr.dsa1.oops3;

public class Address {
	String lane;
	String city;
	String state;
	String country;
    Address()
    {}
	public Address(String lane, String city, String state, String country) {
		super();
		this.lane = lane;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	@Override
	public String toString() 
	{
		return "Address [lane=" + lane + ", city=" + city + ", state=" + state + ", country=" + country + "]";
	}
    
}
