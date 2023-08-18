

import java.util.Scanner;
public class Pattern_18
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("take value of n : ");
        int n = sc.nextInt();
        
        int nsp = n/2;
        int nstr =  1;
        for(int i=0; i<n; i++){
            for(int j=0; j<nsp; j++){
                System.out.print("   ");
            }
            for(int j=0; j<nstr; j++){
                System.out.print("*  ");
            }
            
            if(i<n/2){
                nsp--;
                nstr+=2;
            }else{
                nsp++;
                nstr-=2;
            }
            System.out.println();
        }
    }
}
