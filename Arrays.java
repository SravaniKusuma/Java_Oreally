import java.util.*;
public class Arrays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];
		System.out.println("Enter 5 numbers to store in array");
		int i;
		for(i=0;i<5;i++)
		{
			array[i]=sc.nextInt();
		}
		for(i=0;i<5;i++)
		{
			System.out.println("The elemnet at index: "+i +" multiplied by 2 is:"+array[i]*2);;
		}

	}

}
