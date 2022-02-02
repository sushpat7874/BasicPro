package Demo;

public class Constructor {
	String Name;
	int age, salary;
	float a;
	char b;
	
	Constructor()
	{
		Name="Anuja";
		age=20;
		salary=6000;
		a=50;
		b='G';
	}
		
	Constructor(String i,int j,int k, char g)
	{
		Name=i;
		age=j;
		salary=k;
	}
	
	void pqr()
	{
		System.out.println("Name-"+Name);
		System.out.println("Age-"+age);
		System.out.println("Salary-"+salary);
		System.out.println("A-"+a);
		System.out.println("Division-"+b);
	}
	
		public static void main(String[] args) {
		Constructor def=new Constructor();
		def.pqr();
		
		System.out.println();
		
		Constructor def2=new Constructor("Tanuja",22,8000,'H');
		def2.pqr();
	}

}
