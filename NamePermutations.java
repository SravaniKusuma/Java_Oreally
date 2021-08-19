import java.util.*;
public class NamePermutations {

	public static void main(String[] args) {
		 
		ArrayList<String> firstNames = new ArrayList<String>();
		ArrayList<String> lastNames = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		String firstName;
		String lastName;
		String fullName;
		int index;
		for(int i=1;i<=5;i++)
		{
			System.out.println("Enter your full name");
			fullName=sc.nextLine();
			index=fullName.indexOf(" ");
			firstName=fullName.substring(0,index);
			lastName=fullName.substring(index+1);
			firstNames.add(firstName);
			lastNames.add(lastName);
			
		}
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.println(firstNames.get(i)+" "+lastNames.get(j));
			}
		}
		

	}

}
