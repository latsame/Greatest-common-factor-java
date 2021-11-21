
import java.util.Scanner;
public class GreatestcommonF {

	public static void main(String[] args) {
		

		Scanner sca = new Scanner(System.in);
		
		System.out.println("Enter two numbers: ");
		int a = sca.nextInt();
		int b = sca.nextInt();
	    
	    int g = 0;
	    for(int i=1; i<=a; i++) {
	    	if(a%i==0&&b%i==0)
	    	     g=i;
	    	
	    }
	    
	    System.out.println("GCF IS: = "+g);
	}

}


	
