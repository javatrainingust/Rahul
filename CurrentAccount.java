package com.bank.model;

public class CurrentAccount extends Account{
	
	private int Overdraftlimit;
	
	
	 public void Overdraftlimit(int amount )
	 {
		 if (amount>25000)
		 {

			   System.out.println("Draft limit exceeded");
		 }
	 }


	public int getOverdraftlimit() {
		return Overdraftlimit;
	}


	public void setOverdraftlimit(int overdraftlimit) {
		Overdraftlimit = overdraftlimit;
	}
	

}
