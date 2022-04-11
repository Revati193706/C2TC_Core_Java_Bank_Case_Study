package com.tns.application;

import java.util.Scanner;

import com.tns.framework.*;

public  class MMBankFactory extends BankFactory {

Scanner sc=new Scanner(System.in);
@Override
		public SavingAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		
    MMSavingAcc sAccNew = new MMSavingAcc(++accNo, accNm, accBal, isSalaried);
    System.out.println(sAccNew.toString());
    
	 System.out.println("*****  \n Welcome to  Saving  Account  transaction Portal *****");
	 
    System.out.println(" \n 1. Deposite 2. Withdraw 3. Exit");
   int  choice = sc.nextInt();
    
                     switch (choice) 
                     {
                     case 1:
                            System.out.println(" \n Enter Amount:");
                          float  amt = sc.nextFloat();
                            sAccNew.deposite(amt);
                            break;
                     case 2:
                            System.out.println(" \n Enter Amount:");
                         amt = sc.nextFloat();
                            sAccNew.withdraw(amt);
                            break;
                     case 3:
                            System.out.println("Logout Successfully ");
                            break;

                     default:
                            System.out.println("Invalid Option");
                            break;
                     }
                           

	return null;	
		}
		
		@Override
		public CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {

	         MMCurrentAcc cAccNew = new MMCurrentAcc(accNo++, accNm, accBal, creditLimit);
	         cAccNew.toString();
      
	         System.out.println("***** \n Welcome to  Current  Account  transaction Portal *****");
				
	         System.out.println(" \n 1. Deposite 2. Withdraw 3. Exit");
	      int   choice = sc.nextInt();
	                          switch (choice) 
	                          {
	                          case 1:
		                             System.out.println(" \n Enter Ammount:");
		                            float amt = sc.nextFloat();
		                             cAccNew.deposite(amt);
		                             System.out.println("CREDIT LIMIT: " +creditLimit);
		                             break;
	                          case 2:
		                             System.out.println(" \n Enter Ammount:");
		                             amt = sc.nextFloat();
		                             cAccNew.withdraw(amt);
		                             break;
	                          case 3:
		                             break;

	                          default:
		                             System.out.println("Invalid Option");
		                             break;
	                          }
	                                 
			return null;
		}

	
}
