import java.util.*;
public class SumElements {
	
	public static int sumOfElements(ArrayList<Integer> al)
	{
		int sum=0;
		Iterator<Integer> itr = al.iterator();
		while(itr.hasNext())
		{
			sum+=itr.next();
		}
		return sum;
	}

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		int result=sumOfElements(al);
		System.out.println("The sum of elements in arraylist is : "+result);
	}

}
