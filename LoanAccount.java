package com.bank.model;

public class LoanAccount extends Account{
	
	private int EMI;
	private int loanOutStanding;
	
	
	 public void EMICalculation(int tenure, int amount)
	 {
		 this.EMI=(amount/tenure)+amount*(5/100);
	 }


	public int getEMI() {
		return EMI;
	}


	public void setEMI(int eMI) {
		EMI = eMI;
	}


	public int getLoanOutStanding() {
		return loanOutStanding;
	}


	public void setLoanOutStanding(int loanOutStanding) {
		this.loanOutStanding = loanOutStanding;
	}

}
