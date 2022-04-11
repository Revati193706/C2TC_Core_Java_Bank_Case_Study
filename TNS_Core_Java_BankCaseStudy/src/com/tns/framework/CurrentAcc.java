package com.tns.framework;

public abstract class CurrentAcc extends BankAcc 
{
	
	// This is Method to get credit limit
	private float creditLimit;

	public float getCreditLimit() {
		return creditLimit;
	}

//	Constructor will be invoked by current class's child class object
	
	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}

	public CurrentAcc()
	{
		super();
	}
	@Override
	
	//This method will be invoked by using child class object upon receiving withdraw request from customer
	
	public void withdraw(float amt) {
		if (amt > getAccBal() + creditLimit)// It means that bank is giving 5000as credit limit and your balance is 5000 rs and you are trying to withdraw 15000 rs.
	{
			System.out.println("insufficient balance".toUpperCase());
			System.out.println("Trasaction Failed.");
		} else if (getAccBal() >= amt) // It means your balance is 10000and withdrawing 5000
		{
			setAccBal(getAccBal() - amt);
			System.out.println("Trasaction Complete.");
			
		} else {
			amt -= getAccBal();
			creditLimit -= amt;
			
			setAccBal(0);
			System.out.println("Trasaction Complete.");
		}
	}

	@Override
	public String toString() {
		System.out.println("Your account Number is " + (getAccNo()));
		System.out.println("Your Account Balance is " + getAccBal() + " & Your Credit Limit is " + creditLimit);

		return "CurrentAcc []";
	}

}