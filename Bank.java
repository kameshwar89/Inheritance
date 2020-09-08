package com.secondhand;
import java.util.*;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Choose Account Type");
		System.out.println("1.Savings Account");
		System.out.println("2.Current Account");
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		switch(n) {
		case 1:		
			System.out.println("Enter the inputs seperated by the commos");
			s.nextLine();
			String input = s.nextLine();
			String values[]=input.split(",");
			String accName=values[0];
			String accNo=values[1];
			String bankName=values[2];
			String tinNumber=values[3];
			CurrentAccount caccount=new CurrentAccount(accName,accNo,bankName,tinNumber);
			caccount.display();
			break;
		case 2:
			System.out.println("Enter the inputs seperated by the commos");
			s.nextLine();
			String input1=s.nextLine();
			String values1[]=input1.split(",");
			String accName1=values1[0];
			String accNo1=values1[1];
			String bankName1=values1[2];
			String orgName=values1[3];
			SavingsAccount saccount=new SavingsAccount(accName1,accNo1,bankName1,orgName);
			saccount.display();
			break;
		}
	
		}
	
}


