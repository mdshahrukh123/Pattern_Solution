

import java.util.Scanner;
public class Pattern_19
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("take value of n : ");
        int n = sc.nextInt();
    
        for(int i=0; i<n/2+1; i++){
          
            for(int j=0; j<n/2+1-i; j++){
                System.out.print("*  ");
            }
            for(int j=1; j<i*2;j++){
                System.out.print("   ");
            }
             for(int k=0; k<n/2-i+1; k++){
                 if(i==0 && k==0)
                 continue;
                System.out.print("*  ");
            }
            
            System.out.println();
        }
        int nsp = n-4;
         for(int i=n/2; i>=1; i--){
          
            for(int j=1; j<=n/2-i+2; j++){
                System.out.print("*  ");
            }
            for(int j=1; j<=2*i-3;j++){
                System.out.print("   ");
            }
            nsp-=2;
             for(int k=1; k<=n/2-i+2; k++){
                if(i==1 && k==1)
                continue;
                System.out.print("*  ");
            }
            
            System.out.println();
        }
    }
}
