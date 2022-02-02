package Demo;
import java.util.Scanner;

public class Area {

	public static void main(String arg[])	{
				
		int br,ln,area;
		Scanner U = new Scanner(System.in);
		
		System.out.println("Enter Lenght-");
		ln=U.nextInt();
		System.out.println("Enter Breadth-");
		br=U.nextInt();
		area=br*ln;
		System.out.println("Area="+area);
		
		
}
}
