package Demo;
import java.util.Random;

public class RollingDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random Q = new Random();
		int x = Q.nextInt(6) + 1;
		
		System.out.println(x);
	}

}
