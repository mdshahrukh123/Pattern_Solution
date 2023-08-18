
import java.util.*;
public class Pattern_11
{
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int n = sc.nextInt();
	 int nsp = n-1;
	 int nstr = 1;
	 for(int i=0; i<n; i++){
	     for(int j=0; j<nsp; j++){
	         System.out.print("   ");
	         }
	     for(int k=0; k<nstr; k++){
	         if(k%2==0)
	         System.out.print("*  ");
	         else{
	             System.out.print("   ");
	         }
	     }
	     nsp--;
	     nstr+=2;
	     System.out.println();
	 }
	}
}
