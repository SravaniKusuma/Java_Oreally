
public class Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//BINARY Operator
		
		int num1=5;
		int num2=7;
		int result=num1+num2;
		int difference=num2-num1;
		int product=num1*num2;
		int remainder=num2%num1;
		int quotient=num2/num1;
		System.out.println("The result is :"+result);
		System.out.println("The difference is: "+difference);
		System.out.println("The product is : "+product);
		System.out.println("The remainder  is : "+remainder);
		System.out.println("The quotient is : "+quotient);
		
		//UNARY Operators
		
		result++;
		System.out.println("The result is :"+result);
		result--;
		System.out.println("The result is :"+result);
		
		// Compound operator
		
		product*=2;
		
		System.out.println("The product is : "+product);

	}

}
