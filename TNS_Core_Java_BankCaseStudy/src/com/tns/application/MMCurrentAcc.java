package com.tns.application;

import com.tns.framework.*;

public class MMCurrentAcc extends CurrentAcc 
{
	
//	Constructor invoked using MM_Current Class objects
	
	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
	}

// This method will only be used to print account status after withdraw
	
	public MMCurrentAcc() {
	super();
	}

	public void withdraw(float amt) 
	{
		super.withdraw(amt);
	System.out.println("AVAILABLE BALANCE: " + getAccBal());
		System.out.println("CREDIT LIMIT: "+getCreditLimit());
	}
}