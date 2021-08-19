package circle;
public class CircleDemo {

	public static void printCircle(Circle c)
	{
		System.out.println("radius: "+c.getRadius());
		System.out.println("Circumference: "+c.circumference());
		System.out.println("Area : "+c.area());
	}
	public static void main(String[] args) {
		
		Circle c =new Circle(1.2);
		printCircle(c);
		
	}

}
