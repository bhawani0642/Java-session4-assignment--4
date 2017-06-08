package javasession4question4;

import java.util.Scanner;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = Integer.parseInt(args[0]);
		if (i == 0) {
			System.out.println("You have entered ZERO ");
			String char1 = null;
			System.out.println("ASCII value of n1 is" + (char) i);
		} else if (i < 0) {
			System.out.println("You have entered Negetive value ");
		} else {
			System.out.println("You have entered positive value ");
		}
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the marks in P");
		int mark1= sc.nextInt();
		System.out.println("Enter the marks in C");
        int mark2=sc.nextInt();
        System.out.println("Enter the merks in M");
        int mark3=sc.nextInt();
        int a= mark1, b=mark2, c=mark3, average;
        average=(mark1+mark2+mark3/3);
        if (average>70){
        	System.out.println("Student has A grade");
        } if(average<=70&& average>61){
        	System.out.println("Student has B grade");
        }
         if(average<61){
        	 System.out.println("Student has C grade ");
        	
        }
	}
			
	
}


