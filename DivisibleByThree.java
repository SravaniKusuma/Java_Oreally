import java.util.*;
public class DivisibleByThree {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter the integer: ");
		num=sc.nextInt();
		if(num%3==0)
		{
			System.out.println("The number is divisible by 3");
		}
		else
		{
			System.out.println("The number is not dividible by 3");
		}
	}

}
