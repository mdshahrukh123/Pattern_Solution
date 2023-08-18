import java.util.Scanner;
public class Pattern_23
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter value of n : ");
	int n = sc.nextInt();
	
	for(int i=0; i<n; i++){
	    for(int j=1; j<n-i ; j++){
	        System.out.print("   ");
	    }
	    for(int j=0; j<=i*2; j++){
	        System.out.print("1  ");
	    }
	    System.out.println();
	}
		
	}
}
