package com.bank.model;

public class Account {

	
	private int  AccountNumber;
	private String AccountHolderName;
	private float Balance;
	
	protected float rateofinterest;
	
	public int getAccountNumber() {
		return AccountNumber;
	}




	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	}

 


	public String getAccountHolderName() {
		return AccountHolderName;
	}




	public void setAccountHolderName(String accountHolderName) {
		AccountHolderName = accountHolderName;
	}




	public void WithdrawMoney(float AmountToWithdraw){
		
		
	this.Balance=this.Balance-AmountToWithdraw;
	
	//System.out.println("Avalibale Balance  : "+this.Balance);
		
	}




	public void setBalance(float balance) {
		Balance = balance;
	}




	public float getRateofinterest() {
		return rateofinterest;
	}




	public void setRateofinterest(float rateofinterest) {
		this.rateofinterest = rateofinterest;
	}




	public float getBalance() {
		return Balance;
	}
	
}
