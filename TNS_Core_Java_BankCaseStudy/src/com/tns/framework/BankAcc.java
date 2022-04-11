package com.tns.framework;

public abstract class BankAcc
{
//	This method is used to display Account no.
	
	private int accNo;
	
	public int getAccNo()
	{
		return accNo;
	}

//	This method is used to display Account Holder Name.
	
	private String accNm;

	public String getAccNm() 
	{
		return accNm;
	}

//	This method is used to display Account Balance.
	
	private float accBal;

	public float getAccBal() 
	{
		return accBal;
	}

//	This method is used to Keep Account Balance Updated after transaction.
	
	public void setAccBal(float accBal) 
	{
		this.accBal = accBal;
	}

	// This is constructor which will be invoked by saving account constructor using super keyword
	//	and will pass the values to this constructor and this keyword will assign that all values to respected variables
	
	public BankAcc(int accNo, String accNm, float accBal)
	{
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}

	public BankAcc()
	{
		
	}
	// This is abstract method will be invoked using saving/current Account's child class object  
	public abstract void withdraw(float amt);
	
public void deposite(float amt) 
	{
		accBal += amt;
		System.out.println(amt + " Deposited");
		System.out.println("Trasaction Complete.");
		System.out.println("AVAILABLE BALANCE: " + getAccBal());
	}

	//This method is string class overridden method used to display object as string  message
	
	@Override
	public String toString() 
	{
//		System.out.println(accNm + " Your Account is Created.");
		return (accNm + " Your Account is Created.");
	}

}