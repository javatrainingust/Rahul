package com.bank.model;

public class InterestCalculator {
	
	
	
	
	private int principleamount;
	private int peroiod;
	private float rateofinterest;
	
	
	public float calculateInterest(int p,float r, int  n)
	{
		  System.out.println("Interest Rate from SBAccount Class");
		 return this.rateofinterest=(p*r*n)/100;
		
		 
		 
	}

	public float calculateInterest(int p, int  n)
	
	{  
		   int r=7;
		  System.out.println("Interest Rate from FBAccount Class");
		 return this.rateofinterest=(p*r*n)/100;
		 
		 
	}


	public int getPrincipleamount() {
		return principleamount;
	}


	public void setPrincipleamount(int principleamount) {
		this.principleamount = principleamount;
	}


	public int getPeroiod() {
		return peroiod;
	}


	public void setPeroiod(int peroiod) {
		this.peroiod = peroiod;
	}


	public float getRateofinterest() {
		return rateofinterest;
	}


	public void setRateofinterest(float rateofinterest) {
		this.rateofinterest = rateofinterest;
	}
	

}
