import java.util.Scanner;

public class A3{
	
	public static void main(String[] args){
		float a,b,c;
		
		Scanner sc = new Scanner(System.in);

		a = sc.nextFloat();
		b = sc.nextFloat();
		c = sc.nextFloat();

		double res = a+b+c;
		float re = a+b+c;

		double result = a+b+c;
		//float result = a+b+c;

		System.out.println("Double res = "+res); // Accurate value give compaired to float 
		System.out.println("Float re = "+re);

		//Specific digit after decimal 

		String s1 = String.format("%.2f",res);
		String s2 = String.format("%.4f",re);

		System.out.println("Round off:"+s1);
		System.out.println("Round off:"+s2);

		System.out.format("Round off %.2f",result);

		
	}
}