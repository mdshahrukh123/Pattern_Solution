
import java.util.Scanner;
public class Pattern_28
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter value of n : ");
	int n = sc.nextInt();
	    
	for(int i=0; i<n; i++){
	int num=i+1;
	    for(int j=1; j<n-i; j++){
	        System.out.print("   ");
	    }
	    for(int j=0; j<=i; j++){
	        System.out.print(num+"  ");
	        num++;
	    }
	    num-=2;
	    for(int j=0; j<i; j++){
	        System.out.print(num+"  ");
	        num--;
	    }
	    System.out.println();
	}
	}
}
