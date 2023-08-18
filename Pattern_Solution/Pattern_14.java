
import java.util.*;
public class Pattern_14
{
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter value of n : ");
	 int n = sc.nextInt();
	 int nstr = 1;
	 int nsp = n-1;
	 for(int i=0; i<n*2-1; i++){
	     for(int j=0; j<nsp; j++){
	         System.out.print("   ");
	         }
	         
	    for(int k=0; k<nstr; k++){
	        System.out.print("*  ");
	    }
	     if(i<n-1){
	     nstr++;
	     nsp --;}
	     else{
	     nstr--;
	     nsp++;}
	     System.out.println();
	 }
	}
}
