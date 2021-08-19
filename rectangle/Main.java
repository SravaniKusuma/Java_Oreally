package rectangle;
import java.io.*;
import java.util.*;
public class Main {
	
	public static void fillArrayList(ArrayList<Rectangle> al)
	{
		
		Scanner sc;
		try
		{
			sc = new Scanner(new File("C:\\Users\\K.SRAVANI\\eclipse-workspace\\JavaProgramsOreally\\src\\rectangle\\rec.txt"));
			Rectangle temp;
			double length;
			double width;
			while(sc.hasNext())
			{
				length=sc.nextDouble();
				width=sc.nextDouble();
				temp=new Rectangle(length,width);
				al.add(temp);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void printRectangle(ArrayList<Rectangle> al)
	{
		for(Rectangle r: al)
		{
			System.out.println("Length: "+r.getLength());
			System.out.println("Width: "+r.getWidth());
			System.out.println("Area: "+r.area());
			System.out.println("Perimeter: "+r.perimeter());
			System.out.println();
		}
	}
	public static void main(String[] args) {
		ArrayList<Rectangle> al =new ArrayList<>();
		fillArrayList(al);
		printRectangle(al);

	}

}
