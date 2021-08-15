/**
 * 
 */

/**
 * @author Ankita Saha
 *
 */
import java.util.Scanner;

public class CountDigitsInNumber 
{
	  public static void main(String args[]) {
		    Scanner sc=new Scanner(System.in);
		    int n=sc.nextInt();
		    int ans=count(n);
		    System.out.println(ans);
		    sc.close();
		}

	    public static int count(int n){
	        if(n == 0){
	            return 0;
	        }
	        int smallAns = count(n / 10);
	        return smallAns + 1;
	    }


		}

