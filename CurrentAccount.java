package com.onkar.bank;

public class CurrentAccount extends BankAccount {
	
	private double odLimit;
	
	{
		odLimit=20000;
	}
	
	public CurrentAccount()
	{
		
		
	}
	public CurrentAccount(String accountholderName, double accountBalance)
	{
		
		super(accountholderName,accountBalance);
	}
	
	public void withdraw(double amount) {
		if((accountBalance+odLimit<amount)||(accountBalance<=10000)||(amount<=0))
		{
			System.out.println(accountBalance+odLimit);
			System.out.println("Invalid Operation for Withdraw!!!");
		}
		else
		{

			this.accountBalance-=amount;
			System.out.println("Avilable balance: "+accountBalance);
				
		}
		
		
	}

}
