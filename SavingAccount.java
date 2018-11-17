package com.onkar.bank;

public class SavingAccount extends BankAccount {
	
	
	boolean isSalaryAccount;
	
	public SavingAccount(String accountholderName, double accountBalance) {
		
		super(accountholderName,accountBalance);
		this.isSalaryAccount=true;
		}
	
	public SavingAccount(String accountholderName, double accountBalance,boolean isSalaryAccount) {
		super(accountholderName,accountBalance);
		this.isSalaryAccount=isSalaryAccount;
		
	} 
	public void withdraw(double amount)
	{
		if((accountBalance<amount)||(accountBalance<=1000)||(amount<=0))
		{
			System.out.println("Invalid Operation for Withdraw!!!");
		}
		else
		{

			this.accountBalance-=amount;
			System.out.println("Avilable balance: "+accountBalance);
				
		}
	}	
	public SavingAccount() {
		this.isSalaryAccount=true;
	}
	
	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}
	

}
