import java.util.Random;
public class RandomFunc {

	public static void main(String[] args) {
		
		Random random = new Random();
		int number;
		number=random.nextInt();
		System.out.println("The random number is : "+number);
		number=random.nextInt(1000)+1;
		System.out.println("The random number in range from 1 to 1000 : "+number);
	}

}
