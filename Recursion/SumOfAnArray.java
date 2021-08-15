/**
 * 
 */

/**
 * @author Ankita Saha
 *
 */
import java.util.Scanner;

public class SumOfAnArray {

	  
	    public static void main(String[] args) {
	           Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();//Number of test cases
	        int input[] = new int[n];
	        for(int i = 0; i < n; i++) {
	            input[i] = sc.nextInt();
	        }
	        System.out.println(sum(input));
	        sc.close();
	    }
	     public static int sum(int input[]) {
	       
	       
	        if(input.length <= 1){
	            return input[0];
	        }

	        int smallInput[] = new int[input.length - 1];
	        for(int i = 1; i < input.length; i++){
	            smallInput[i - 1] = input[i];
	        }

	        int ans = input[0]+sum(smallInput);
	        return ans;
	       
	    }
	
}
