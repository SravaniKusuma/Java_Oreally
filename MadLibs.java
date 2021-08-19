import java.util.*;
public class MadLibs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String adjective1;
		String girlsName;
		String adjective2;
		String occupation1;
		String place;
		String clothing;
		String hobby;
		String adjective3;
		String occupation2;
		String boysName;
		String mansName;
		System.out.println("Enter Adjective: ");
		adjective1=sc.nextLine();
		
		System.out.println("Enter girls Nmae: ");
		girlsName=sc.nextLine();
		
		System.out.println("emter another Adjective: ");
		adjective2=sc.nextLine();
		
		System.out.println("Enter an occupation :");
		occupation1=sc.nextLine();
		
		System.out.println("enter a place ");
		place=sc.nextLine();
		
		System.out.println("Enter clothing: ");
		clothing=sc.nextLine();
		
		System.out.println("Enter hobby :");
		hobby=sc.nextLine();
		
		System.out.println("Enter adjectve : ");
		adjective3=sc.nextLine();
		
		System.out.println("Enter an ocupation: ");
		occupation2=sc.nextLine();
		
		System.out.println("Enter Boys Nmae: ");
		boysName=sc.nextLine();
		
		System.out.println("Enter mans Nmae: ");
		mansName=sc.nextLine();
		
		System.out.println("There once was a "+adjective1+" girl named "+girlsName+" ,who was a "+adjective2+" "+occupation1+" in the Kingdom of "+place+" She loved to wear "+clothing
				+" and to "+hobby+" She wanted to marry the "+adjective3+" "+occupation2
				+" named "+boysName+" but her father, King "+mansName+" forbid ner from seeing him");
	}

}
