
import java.util.Scanner;
public class Pattern_30
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter value of n : ");
	int n = sc.nextInt();
	    
	for(int i=0; i<n; i++){

	    for(int j=n; j>0; j--){
	        System.out.print(j+"  ");
	    }
	   
	    System.out.println();
	}
	}
}
