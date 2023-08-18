
import java.util.Scanner;
public class Pattern_25
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter value of n : ");
	int n = sc.nextInt();
	
     int num =1;
	for(int i=0; i<n; i++){
	    for(int j=0; j<n-i-1; j++){
	        System.out.print("   ");
	    }
	    
	    for(int j=0; j<=i*2; j++){
	        if(num<=9)
	        System.out.print(num+"  ");
	        else
	        System.out.print(num+" ");
	        num++;
	    }
	    System.out.println();
	    
	}
	}
}
