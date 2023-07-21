package in.srkr.dsa1.oops;
import java.util.*;
public class Book1
{
	private int pen;
	private int pencil;
	private int led;
	Scanner s=new Scanner(System.in);
	public int getPen() {
		pen=s.nextInt();
		return pen;
	}
	public void setPen(int pen) {
		this.pen = pen;
		
	}
	public int getPencil() {
		pencil=s.nextInt();
		return pencil;
	}
	public void setPencil(int pencil) {
		this.pencil = pencil;
	}
	public int getLed() {
		led=s.nextInt();
		return led;
	}
	public void setLed(int led) {
		this.led = led;
	}
	@Override
	public String toString() {
		return "Book1 [pen=" + pen + ", pencil=" + pencil + ", led=" + led + "]";
	}
	
	public static void main(String[] args) {
		Book1 obj=new Book1();
		/*obj.getPen();
		obj.setPen(5);
		obj.getLed();
		obj.setLed(7);
		obj.getPencil();
		obj.setPencil(15);*/
		
				obj.getPen();
				obj.getLed();
				obj.getPencil();
				System.out.println(obj.toString());

	}
	
}
