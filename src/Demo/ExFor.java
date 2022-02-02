package Demo;

public class ExFor {

	
	public static void main(String[] args) {

		for(int i=10; i>=1; i--) 
		{
			for(int j=1; j<i; j++)
			{
				System.out.print(" * ");
			}
		System.out.println(" ^ ");
		}
		
		
		for(int p=1; p<=10; p++)
		{
			for(int q=1; q<p; q++)
			{
				System.out.print(" $ ");
			}
			System.out.println(" @ ");
		}
		
	}
}