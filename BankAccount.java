package com.onkar.bank;

//package is collection of logical classes

public abstract class BankAccount
{
	//static variable--initialized when class get loaded
	private static int autoAccountNo;
	
	
	//instance variable / class variable...we can not use instance variable without creating objects
	private int accountNo;
	private String accountHolderName;
	protected double accountBalance;//transactional variable
	
	//init block
	{
		accountNo=++autoAccountNo;
	}
	//constructor overloading...--suppling variety
	//default constructor
	public BankAccount()//initialize instance variable--automatically gte called when object is created
	{
		accountHolderName="unknown";
		accountBalance=0;
	}
	
	//parameterized constructor
	public BankAccount(String accountHolderName,double accountBalance)
	{
		this.accountHolderName=accountHolderName;
		this.accountBalance=accountBalance;
	}
	
	//setter method
	public void setAccountHolderName(String accountHolderName)//setter method--to modify or reinitialize member variable
	{
		this.accountHolderName = accountHolderName;
	}
	
	//getter method
	public double getAccountBalance()
	{
		return accountBalance;
	}
	
	public String getAccountHolderName() 
	{
		return accountHolderName;
	}
	
	public int getAccountNo()
	{
		return accountNo;
	}
	//service methods
	 public void withdraw(double amount)
	{
	/*	if((accountBalance<amount)||(accountBalance<=1000)||(amount<=0))
		{
			System.out.println("Invalid Operation for Withdraw!!!");
		}
		else
		{

			this.accountBalance-=amount;
			System.out.println("Avilable balance: "+accountBalance);
				
		}*/
	}
	
	public void deposite(double amount)
	{
		if(amount<=0)
		{
			System.out.println("Invalid Operation for Deposite!!!");
		}
		else
		{
		this.accountBalance+=amount;
		System.out.println("Avilable balance: "+accountBalance);

		}
	}
	

	
	public static void main(String[] args) {
		//BankAccount acc = new BankAccount();
		//BankAccount acc2 = new BankAccount("onkar",5000);
		 
	 }
	// static var alweays get loaded before method called
	//it get shared by classes im method memory
	// static make account no shared not a unique
	
	//how we can initialze after creation/modified / updated
	//conceptual method
}