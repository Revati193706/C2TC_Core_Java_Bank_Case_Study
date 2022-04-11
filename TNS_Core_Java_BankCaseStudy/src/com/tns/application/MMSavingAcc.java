package com.tns.application;

import com.tns.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc 
{
	
	private static final float MINBAL = SavingAcc.getMinbal();

	public static float getMinbal() {
		return MINBAL;
	}

//	Constructor will be invoked by using MM_SavincAcc object
	
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
	}

	public MMSavingAcc() {
		// TODO Auto-generated constructor stub
	}

	@Override
	
	//This method will be invoked by MM_Saving class Object to print status of account after transaction and also to perform it
	
	public void withdraw(float amt) 
	{
		super.withdraw(amt);// call will be passes to immediate parent class method
		System.out.println("AVAILABLE BALANCE: " + getAccBal());
	}

	
}