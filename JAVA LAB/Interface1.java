interface Shape
{
    void draw(); 
}
class Rectangle implements Shape 
{
    public void draw()
    {
        System.out.println("Drawing a rectangle");
    }
}
class Circle implements Shape
{
    public void draw() 
    {
        System.out.println("Drawing a circle");
    }
}
public class Interface1 
{
    public static void main(String[] args) 
    {
        Shape shape1 = new Rectangle();
        shape1.draw();
        
        Shape shape2 = new Circle();
        shape2.draw(); 
    }
}

