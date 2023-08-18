
import java.util.Scanner;
public class Pattern_20
{
  public static void main (String[]args)
  {

    Scanner sc = new Scanner (System.in);
      System.out.println ("take value of n : ");
    int n = sc.nextInt ();
    int nsp = n / 2;
    int spc = 0;
    for (int i = 0; i < n; i++)
      {
	for (int j = 0; j < nsp; j++)
	  {
	    System.out.print ("   ");
	  }
	System.out.print ("*  ");

	for (int j = 1; j < spc; j++)
	  {
	    System.out.print ("   ");
	  }
	if (i != 0 && i != n - 1)
	  System.out.print ("*  ");
	System.out.println ();
	if (i < n / 2)
	  {
	    nsp--;
	    spc += 2;
	  }
	else
	  {
	    nsp++;
	    spc -= 2;
	  }

      }


  }
}
