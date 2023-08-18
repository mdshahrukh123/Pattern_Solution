
import java.util.Scanner;
public class Pattern_32
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter value of n : ");
	int n = sc.nextInt();
	    int num = 1;
	    int val =1;
	for(int i=1; i<=n*2; i++){

	    for(int j=0; j<num; j++){
	        if(j%2==0)
	        System.out.print(val+"  ");
	        else{
	            System.out.print("*  ");
	        }
	        
	    }
	    if(i<n){
	        val++;
	    }else {
	        val--;
	    }
	    
	    if(i<n)
	     num+=2;
	   else
	   num-=2;
	    System.out.println();
	}
	}
}
