import java.util.Scanner;

public class A2{
	
	public static void main(String[] args){
		float a,b,c;
		
		Scanner sc = new Scanner(System.in);

		a = sc.nextFloat();
		b = sc.nextFloat();
		c = sc.nextFloat();

		double res = a+b+c;
		float re = a+b+c;

		System.out.println("Double res = "+res); // Accurate value give compaired to float 
		System.out.println("Float re = "+re);
	}
}