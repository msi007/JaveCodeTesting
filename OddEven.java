//package ODDEven;
import java.util.*;
import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		int i;
		Scanner input=new Scanner(System.in);  //Scanner class is used to collect user input
		//System.out.print("Idenfty Odd-Even Number ulti:");
		//int num=input.nextInt();
		for (i=0; i<=10;i++) {
			
			if (i%2==0)
				System.out.print(i+ " is a Even number\n");
			else 
				System.out.print(i+ "  is Odd number\n");
			
		}
		
			

	}

}
