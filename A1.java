import java.util.Scanner;

public class A1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		// sc.nextLine(); or use  just
		
		String s = sc.next();
		
		char Gender = sc.next().charAt(0); // means index no 0 charecter like female have "f" and male have "m"
		
		boolean active = sc.nextBoolean(); // it represnt true or false
		
		double result = sc.nextDouble();
		
		float as = sc.nextFloat();
		
		System.out.println("Int a = "+a);
		System.out.println("String s = "+s);
		System.out.println("Boolean active = "+active);
		System.out.println("Double result = "+result);
		System.out.println("Float as = "+as);
	}
}
