
import java.util.Scanner;
public class Pattern_27
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter value of n : ");
	int n = sc.nextInt();
	
	for(int i=0; i<n; i++){
	    int num=1;
	    for(int j=1; j<n-i; j++){
	        System.out.print("   ");
	    }
	    for(int j=0; j<=i; j++){
	        System.out.print(num+"  ");
	        num++;
	    }
	    for(int j= num-2; j>0; j--){
	        System.out.print(j+"  ");
	        num--;
	    }
	    System.out.println();
	}
	}
}
