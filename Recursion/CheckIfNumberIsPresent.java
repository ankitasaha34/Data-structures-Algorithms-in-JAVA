/**
 * 
 */

/**
 * @author Ankita Saha
 *
 */
import java.util.Scanner;
public class CheckIfNumberIsPresent {

	   public static void main(String[] args) {
	          Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();
	        int input[] = new int[n];
	        for(int i = 0; i < n; i++) {
	            input[i] = sc.nextInt();
	        }
	        int x = sc.nextInt();
	        System.out.println(checkNumber(input, x));
	        sc.close();
	    }


	    public static boolean checkNumber(int input[], int x) {

	    if(input.length<=1)
	    {
	        if(input[0] == x)
	        return true;
	        else
	        return false;
	    }
	     int smallInput[] = new int[input.length - 1];
	        for(int i = 1; i < input.length; i++){
	            smallInput[i - 1] = input[i];
	        }
	        boolean ans=checkNumber(smallInput,x);
	        if(ans==true)
	        return true;
	        if(input[0]==x)
	        return true;
	        else
	        return false;
	    
	    }
	
	
	
}
