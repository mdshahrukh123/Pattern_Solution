
import java.util.*;
public class Pattern_10
{
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int n = sc.nextInt();
	 int nsp = 0;
	 int nstr = 2*n-1;
	 for(int i=0; i<n; i++){
	     for(int j=0; j<nsp; j++){
	         System.out.print("   ");
	         }
	     for(int k=0; k<nstr; k++){
	         System.out.print("*  ");
	     }
	     nsp++;
	     nstr-=2;
	     System.out.println();
	 }
	}
}
