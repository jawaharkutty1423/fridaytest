package fridaytest;

import java.util.Scanner;

public class Reverse {
	
public static void main(String[] args) {
	
	//reverse a string
	 
	String x ="Hashnijawahar";
	
	char[] try1 =x.toCharArray();
	for(int i = try1.length-1;i>=0;i--)
	System.out.print(try1[i]);
	
	System.out.println("");
	//scanner method
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the name");
	String input = scan.nextLine();
	char[] try2 =input.toCharArray();
	for(int i = try2.length-1;i>=0;i--)
	System.out.print(try2[i]);
	
}

}