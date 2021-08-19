import java.util.*;
public class Arraylist {

	public static void main(String[] args) {
		
		ArrayList<Integer> al =new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 0 or more inputs or -1 to exit");
		int input=sc.nextInt();
		while(input>=0)
		{
			al.add(input);
			System.out.println("Enter 0 or more inputs or -1 to exit");
			input=sc.nextInt();
		}
		ListIterator<Integer> itr =al.listIterator(al.size());  
        while(itr.hasPrevious())  
        {  
           System.out.println(itr.previous()); 
        }
	}

}
