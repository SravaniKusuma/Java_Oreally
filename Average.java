import java.util.*;
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		double num1, num2, num3;
		System.out.println("Eneter 3 numbers  for calculating mean : ");
		num1=sc.nextDouble();
		num2=sc.nextDouble();
		num3=sc.nextDouble();
		double mean=(num1+num2+num3)/3;
		System.out.println("The Mean of 3 numbers is : "+mean);
		sc.close();

	}

}
