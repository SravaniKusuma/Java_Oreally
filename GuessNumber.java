import java.util.*;
public class GuessNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r =new Random();
		int computerNum =r.nextInt(100)+1;
		int myguess;
		boolean guess=false;
		while(!guess)
		{
			System.out.println("Enter your guess Number: ");
			myguess=sc.nextInt();
			if(myguess==computerNum)
			{
				System.out.println("Congartualtions it was a  correct guess");
				guess=true;
				break;
			}
			else if(myguess<computerNum)
			{
				System.out.println("Your guess is too low");
			}
			else if(myguess>computerNum)
			{
				System.out.println("Your guess is too high");
			}
			else
			{
				System.out.println("That was a wasted guess you nedd to pick between 1 to 100");
			}
		}
		
	}

}
