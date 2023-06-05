package sort2;
import java.util.Scanner;
public class Absolutenum {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	        Scanner obj = new Scanner(System.in);
	        System.out.println("Enter a number:");
	        int num = obj.nextInt();
	        int absNum = num;
	        if (num < 0) {
	            absNum = -1 * num;
	        }
	        System.out.println("The absolute value of " + num + " is " + absNum + ".");
	    }
	}
