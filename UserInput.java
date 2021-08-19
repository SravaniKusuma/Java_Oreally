import java.util.*;
public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("Whats your name: ");
		name=sc.nextLine();
		int age;
		System.out.println("Whats your age: ");
		age=sc.nextInt();		
		int realNum;
		System.out.println("Enter a real number: ");
		realNum=sc.nextInt();
		sc.nextLine();
		String city;
		System.out.println("what is your city: ");
		city=sc.nextLine();
		System.out.println("Hello "+name);
		System.out.println("Your age is : "+age);
		System.out.println("The number after doubling is : "+realNum*2);
		System.out.println("Your city is : "+city);
		sc.close();
		
		

	}

}
