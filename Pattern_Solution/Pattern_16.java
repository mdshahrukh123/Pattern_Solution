
import java.util.*;
public class Pattern_16
{
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter value of n : ");
	 int n = sc.nextInt();
	 int nstr = n;
	 int nsp = n-1;
	 for(int i=0; i<n*2-1; i++){
	     for(int j=0; j<nsp; j++){
	         System.out.print("\t");
	         }
	         
	    for(int k=0; k<nstr; k++){
	        System.out.print("*\t");
	    }
	     if(i<n-1){
	     nstr--;
	     nsp --;}
	     else{
	     nstr++;
	     nsp++;}
	     System.out.println();
	 }
	}
}
