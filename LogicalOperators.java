
public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean isRaining=true;
		boolean isWarm=false;
		boolean combined ;
		combined=isRaining && isWarm;
		System.out.println("Is Raining AND Is Warm :"+combined);
		combined=isRaining || isWarm;
		System.out.println("Is Raining OR Is Warm :"+combined);
		combined=!isRaining;
		System.out.println("NOT of Is raining: "+combined);
				
				
	}
}
