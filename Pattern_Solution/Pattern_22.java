import java.util.Scanner;
public class Pattern_22
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter value of n : ");
	int n = sc.nextInt();
	
	for(int i=0; i<n; i++){
	    for(int j=1; j<=n-i ; j++){
	        System.out.print("*  ");
	    }
	    
	    for(int j=0; j<i; j++){
	        System.out.print("   ");
	    }
	   // ////////////////////////
	    for(int j=1; j<i; j++){
	        System.out.print("   ");
	    }
	    
	     for(int j=0; j<n-i ; j++){
	         if(j!=n-1)
	        System.out.print("*  ");
	    }
	    System.out.println();
	}
		
	}
}
