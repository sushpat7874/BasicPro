package Practice;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		
//**int i/p>>		
		System.out.println("Enter 1st value = ");
		Scanner s1 = new Scanner(System.in);
		int a = s1.nextInt();
		System.out.println("Enter next line = ");
		int b = s1.nextInt();
		
		System.out.println(a+b);
		
//**String i/p>>
		Scanner s2 = new Scanner(System.in);	
		System.out.println("\nA");
		String p = s2.nextLine();
		System.out.println("B");
		String q = s2.nextLine();
		
		System.out.println(p+q);
	
//**double i/p>>
		Scanner s3 = new Scanner(System.in);
		System.out.println("\nNo1");
		double i = s3.nextDouble();
		System.out.println("No3");
		double ii = s3.nextDouble();
	
		System.out.println(i+ii);

//**Float>>	
		Scanner s4 = new Scanner(System.in);
		System.out.println("\nenter1");
		float f1 = s4.nextFloat();
		System.out.println("E2");
		float f2 = s4.nextFloat();
		
		System.err.println(f1+f2);
		
	}
}