
import java.util.Scanner;
public class Pattern_24
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter value of n : ");
	int n = sc.nextInt();
	

	for(int i=0; i<n; i++){
	    for(int j=0; j<n-i-1; j++){
	        System.out.print("   ");
	    }
	    
	    for(int j=0; j<=i*2; j++){
	        System.out.print(i+1+"  ");
	    }
	    System.out.println();
	    
	}
	}
}
