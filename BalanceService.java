package com.bank.bms.service;
import com.bank.model.Account;
import com.bank.model.CurrentAccount;
import com.bank.model.FDAccount;
import com.bank.model.LoanAccount;
import com.bank.model.SBAccount;
import com.bank.model.InterestCalculator;


public class BalanceService {

	
	
	
     public static void main(String arg[]){
    	 
    	 
    	 
    	 Account acc = new Account();
    	 acc.setAccountNumber(1000);
    	 acc.setAccountHolderName("Rahul");
    	 acc.setBalance(10000);
    	 acc.WithdrawMoney(2000);
    	
    	 
    	 
    	 LoanAccount la = new LoanAccount();
    	 la.setAccountHolderName("Rahul");
    	 la.setAccountNumber(12345);
    	 
    	 System.out.println("Account Holder Name  :"+la.getAccountHolderName());
    	 System.out.println("Account Number  :"+la.getAccountNumber());
    	 la.EMICalculation(5,10000);
    	 
    	 
    	 System.out.println("EMI :"+la.getEMI());
    	 
    	 CurrentAccount ca = new CurrentAccount();
    	 ca.setAccountHolderName("Sravan");
    	 ca.setAccountNumber(4555);
    	 ca.setOverdraftlimit(25000);
    	 
    	 System.out.println("Account Holder Name  :"+ca.getAccountHolderName());
    	 System.out.println("Account Number  :"+ca.getAccountNumber());
    	 ca.Overdraftlimit(30000);
    	 
    	 FDAccount fa = new FDAccount();
    	 fa.setAccountHolderName("tony");
    	 fa.setAccountNumber(3355);
    	 System.out.println("Account Holder Name  :"+fa.getAccountHolderName());
    	 System.out.println("Account Number  :"+fa.getAccountNumber());
    	 fa.setTenure(5);
    	// fa.updateAutoRenewal(6);
    	 
    	 
    	// System.out.println("Rate of interest");
    	SBAccount  sa= new  SBAccount ();
    	// sa.calculateInterest(10000, 4, 5);
    	// System.out.println("Interest Rate for Savings Account :"+sa.getRateofinterest());
    	// sa.calculateInterest(70000, 7, 8);
    	// System.out.println("Interest Rate for Fixed Account :"+sa.getRateofinterest());
    	 
    	 
    	// fa.calculateInterest(10000, 1);
    	// System.out.println("Interest Rate for Fixed Account :"+fa.getRateofinterest());	
    	 
    	// sa.calculateInterest(50000, 4, 1);
    	// System.out.println("Interest Rate for SB Account :"+sa.getRateofinterest());	
    	 
    	 InterestCalculator calc=new InterestCalculator();
    	 calc.calculateInterest(80000, 1);
    	 
    	 System.out.println("Interest Rate for Fixed Account :"+calc.getRateofinterest());
    	 calc.calculateInterest(9000, 4, 1);
    	 System.out.println("Interest Rate for Savings Account :"+calc.getRateofinterest());
    	// fa.calculateInterest(10000, 4, 5);
    	// System.out.println("Interest Rate for Fixed Account :"+fa.getRateofinterest());	
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
     }
}
