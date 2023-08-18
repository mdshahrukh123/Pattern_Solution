
import java.util.*;
public class Pattern_17
{
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter value of n : ");
	 int n = sc.nextInt();
	 int nstr = n/2;
	 int nsp = 1;
	 for(int i=0; i<n; i++){
	      for(int j=0; j<nstr; j++){
	        System.out.print("*  ");
	    }
	     for(int k=0; k<nsp; k++){
	         System.out.print("   ");
	         }
	         
	    for(int l=0; l<nstr; l++){
	        System.out.print("*  ");
	    }
	   
	     if(i<n/2){
	     nstr--;
	     nsp +=2;}
	     else{
	     nstr++;
	     nsp-=2;}
	     System.out.println();
	 }
	}
}
