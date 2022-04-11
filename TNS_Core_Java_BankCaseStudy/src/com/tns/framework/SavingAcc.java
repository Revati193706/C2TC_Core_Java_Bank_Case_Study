package com.tns.framework;

public abstract class SavingAcc extends BankAcc 
{
	
// This method will return whether the account is salary account or not

	private boolean isSalaried;

	public boolean isSalaried() {
		return isSalaried;
	}

// This method will return the minimum balance requirement for particular account
	
	private static final float MINBAL = 1000; 

	public static float getMinbal() {
		return MINBAL;
	}

//	Constructor invoked using its child class object and super keyword
	
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;

	}
	
	public SavingAcc()
	{
		super();
	}

// This method will Perform Withdraw money function 
	
	@Override
	public void withdraw(float amt) {
		if (isSalaried && (getAccBal() - amt < 0)) //if account is salary and accBal-amount is less than 0
		{
			System.out.println("insufficient balance".toUpperCase());
			
		} else if (!isSalaried && (getAccBal() - MINBAL < amt)) // We are trying to withdraw amount greater than account balance
		{
			System.out.println("Money Withdraw not possible".toUpperCase());
		} else {
			setAccBal(getAccBal() - amt); //This will update the account balance
			System.out.println("Trasaction Complete.");
		}

	}

	@Override
	public String toString() {
		System.out.println(super.toString());
		System.out.println("Your account Number is " + (getAccNo()) + " & Your Account Balance is " + getAccBal());

		return "\n";
	}
}