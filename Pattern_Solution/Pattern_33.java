
import java.util.Scanner;
public class Pattern_33
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter value of n : ");
	int n = sc.nextInt();
	    int nsp =n-1;
	for(int i=n; i>0; i--){

        for(int j=0; j<nsp; j++){
            System.out.print("   ");
        }
	         nsp--;
	       
	    for(int j=i; j<n; j++){
	        
	        System.out.print(j+"  ");
	    }
	    
	    System.out.print("0  ");
	    
	    int val = n-1;
	    for(int j=i; j<n; j++){
	        
	        System.out.print(val+"  ");
	        val--;
	       
	    }
	  
	   
	    System.out.println();
	}
	}
}
