package com.encapsulation.example;


class Customer 
{
	public String HolderName;
	public Account account;

	public Customer(String HolderName,Account account )
	{
		this.HolderName=HolderName;
		this.account=account;
	}
	public String ShowDetails()
	{
		return "1.HolderName :-->"+HolderName+" 2.Account :-->"+account;
	}
	public void Deposite(double amt)
	{
		account.Deposite(amt);
	}

	public void Withdraw(double amt)
	{
		account.Withdraw(amt);
	}
}

public class CustomerEncapsulation 
{
	public static void main(String[] args) 
	{
		Account account=new Account(989876765454l, "CBI08112000", 654000.0);
		Customer customer=new Customer("Manjunatha M", account);
		System.out.println(customer.ShowDetails());
		customer.Deposite(550.0);
		System.out.println("");
		customer.Withdraw(150);
		
	}

}
