
import java.util.*;
public class Pattern_2
{
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int n = sc.nextInt();
	 for(int i=0; i<n; i++){
	     for(int j=0; j<n; j++){
	         if(i>=j)
	         System.out.print("*\t");
	     }
	     System.out.println();
	 }
	}
}
