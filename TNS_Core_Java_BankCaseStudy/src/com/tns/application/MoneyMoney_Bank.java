package com.tns.application;

import java.util.*;

import com.tns.framework.*;

public class MoneyMoney_Bank 
{

	static Scanner sc = new Scanner(System.in);
@SuppressWarnings("static-access")

	public static void main(String[] args) 
{
	
	// Variable Creation:
 
int accNo = 110;
String accNm = "default";
float accBal = 10000;
boolean isSalaried = false;
float creditLimit = 5000;
float amt = 0;

//		Previous Objects
		MMCurrentAcc cAcc = new MMCurrentAcc(101, "Revati", 5000, creditLimit);
		MMSavingAcc sAcc = new MMSavingAcc(105, "Shweta", 1000, true);

//welcome();

System.out.println(" \n PRESS 1/2 :");
System.out.println("1. CREATE NEW ACCOUNT\n2. LOGIN");

int choice = sc.nextInt();

switch (choice) 
{

case 1:// Create new Acc
//username
		
System.out.println("Enter Your Name:");
accNm = sc.next();

System.out.println(" \n Enter the AccountType");
System.out.println("1.Saving 2.Current");

Scanner sc =new Scanner(System.in);
	choice=sc.nextInt();
	
	  switch (choice)
      {
      
      case 1:// Saving
             accBal = 0;
             System.out.println("You want continue this account as your Salary Account ? 1. Yes 2.No\nEnter your option:");
             choice = sc.nextInt();
      
                     switch (choice) 
                     {
                     
                     case 1:
	                            isSalaried = true;
	                            break;
                     case 2:
	                            isSalaried = false;
	                            break;

                     default:
	                            System.out.println("Invalid Output");
	                            break;
	                            
                       }

      System.out.println(" \n Your Account Opening Balance must be minimum 1000Rs.");
      System.out.println("Enter Amount:");
      accBal = sc.nextFloat();
                       while (accBal < sAcc.getMinbal())
                       {
                     	  
	                        if (accBal < sAcc.getMinbal()) 
	                        {
		                    System.out.println("***Please pay Remaining Amount " + (sAcc.getMinbal() - accBal) + " ***");
		                    System.out.println("Enter Amount:");
		                    accBal = accBal + sc.nextFloat();
	                        }
	                      
                       }       
                  break;     
      case 2:// Current
			        accBal = 0;

			        System.out.println(" \n Your Account Opening Balance must be minimum 5000Rs.");
			        System.out.println("Enter Amount:");
			        accBal = sc.nextFloat();
			        
			                          while (accBal < 5000) 
			                          {
			                        	  
				                         if (accBal < 5000) 
				                         {
					                       System.out.println("*** \n Please pay Remaining Amount " + (5000 - accBal) + " ***");
					                       System.out.println("Enter Amount:");
					                       accBal = accBal + sc.nextFloat();
				                         }
				                         
			                          }
                  
			                         break;
			                          
      }
	  
	 if(choice==1)
	 {
		 
		 welcome();
		 
		 MMBankFactory f=new MMBankFactory();
		 f.getNewSavingAcc(accNo, accNm, accBal, isSalaried);
	 }
	 
	 else
	 {
		 
		 welcome();
		 MMBankFactory f1=new MMBankFactory();
		 f1.getNewCurrentAcc(accNo, accNm, accBal,creditLimit);
	 }

		 choice= sc.nextInt();
	 
break;

case 2 : //Login
	
	Scanner sc1=new Scanner(System.in);
	System.out.println(" \n Enter Account Number:");
	int accNochoice = sc1.nextInt();

	welcome();
	          if (accNochoice == 105) 
	          {
		
	//Previous Code of Saving Account implementation
	          System.out.println("Welcome ".toUpperCase() + sAcc.getAccNm());
	  

	          System.out.println(" \n 1. Deposite 2. Withdraw 3. Exit");
	          choice = sc1.nextInt();
					
	                  switch (choice) 
	                  {

	                  case 1:
		                     System.out.println(" \n Enter Ammount:");
		                     amt = sc1.nextFloat();
		                     sAcc.deposite(amt);
		                     break;
	                  case 2:
		                     System.out.println(" \n Enter Ammount:");
		                     amt = sc1.nextFloat();
		                     sAcc.withdraw(amt);
		                     break;
	                  case 3:
		                     System.out.println("Logout Successfully ");
		                     break;

	                  default:
		                     System.out.println("Invalid Option");
			                 break;
	                  }
			                 break;
			
			   }
	          
	           else if (accNochoice == 101)
	           {
//					Previous Code of Current Account implementation
	           System.out.println("Welcome ".toUpperCase() + cAcc.getAccNm());
			
			   
			   System.out.println(" \n 1. Deposite 2. Withdraw 3. Exit");
			   choice = sc1.nextInt();
					 
	                  switch (choice) 
	                  {
				
	                  case 1:
	                         System.out.println(" \n Enter Ammount:");
	                         amt = sc1.nextFloat();
		                     cAcc.deposite(amt);
		                     System.out.println("CREDIT LIMIT: " + cAcc.getCreditLimit());
		                     break;
	                  case 2:
		                     System.out.println(" \n Enter Ammount:");
		                     amt = sc1.nextFloat();
		                     cAcc.withdraw(amt);
		                     break;
	                  case 3:
		                     break;

	                  default:
			                 System.out.println("Invalid Option");
			                 break;
	                  }
		                     break;

			   } 
	           
	           else
					
	           System.out.println("Wrong Account Number, Please check again...");
			   break;

	default:
			System.out.println("Invalid Option");
			break;

}		

}

static public void welcome() {
	
	System.out.println("********** Welcome To MoneyMoney BANK **********");
}

}