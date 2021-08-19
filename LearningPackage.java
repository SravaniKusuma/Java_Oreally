import java.util.*;
public class LearningPackage {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int packNumber;
		int howManyCourses;
		int baseCost;
		int costPerCourse;
		int numIncluded;
		int totalCost;
		System.out.println("Which pacakage do you wnat 1, 2, 3");
		packNumber=sc.nextInt();
		System.out.println("How many courses enroll in this month");
		howManyCourses=sc.nextInt();
		if(packNumber==1)
		{
			baseCost=10;
			costPerCourse=6;
			numIncluded=2;
		}
		else if(packNumber==2)
		{
			baseCost=12;
			costPerCourse=4;
			numIncluded=4;
		}
		else
		{
			baseCost=15;
			costPerCourse=3;
			numIncluded=6;
		}
		if(howManyCourses>numIncluded)
		{
			totalCost=baseCost+(howManyCourses-numIncluded)*costPerCourse;
		}
		else
		{
			totalCost=baseCost;
		}
		System.out.println("The total cost is: "+totalCost);
	}

}
