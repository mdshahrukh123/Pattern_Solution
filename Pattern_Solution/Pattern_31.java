
import java.util.Scanner;
public class Pattern_31
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter value of n : ");
	int n = sc.nextInt();
	    
	for(int i=n; i>0; i--){

	    for(int j=n; j>0; j--){
	        if(j+i==n+1)
	        System.out.print("*  ");
	        else
	        System.out.print(j+"  ");
	    }
	   
	    System.out.println();
	}
	}
}
