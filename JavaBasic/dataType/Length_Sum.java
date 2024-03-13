package dataType;

import java.util.Scanner;

public class Length_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Distance : ");
		int yd1=sc.nextInt();
		int feet1=sc.nextInt();
		int inches1=sc.nextInt();
		int distanceSum1=(yd1*36)+(feet1*12)+inches1;
		
		System.out.print("Enter Second Distance : ");
		int yd2=sc.nextInt();
		int feet2=sc.nextInt();
		int inches2=sc.nextInt();
		int distanceSum2=(yd2*36)+(feet2*12)+inches2;
		
		int distanceSum=distanceSum1+distanceSum2;
		int yd=distanceSum/36;
		int feet=(distanceSum%36)/12;
		int inches=(distanceSum%36)%12;
		System.out.println("Total Distance : " + yd + "yd " + feet + "' " + inches + "\"");
		
	}

}
