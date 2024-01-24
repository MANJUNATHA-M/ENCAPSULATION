package com.encapsulation.example;

public class Account 
{
	public long AccNo;
	public static String BankName="CBI";
	public String IfscCode;
	public double bal;

	public Account(long AccNo, String IfscCode,double bal)
	{
		this.AccNo=AccNo;
		this.IfscCode=IfscCode;
		this.bal=bal;
	}
	

	@Override
	public String toString() {
		return "Account [AccNo=" + AccNo + ", IfscCode=" + IfscCode + ", bal=" + bal + "]";
	}

	public void Deposite(double amt)
	{
		if(amt>=0)
		{
			bal=bal+amt;
			System.out.println("Deposited Amount :-->"+amt);
		}
		else
		{
			System.out.println("Current Balance :-->"+bal);
		}
	}

	public void Withdraw(double amt)
	{
		if(amt>=bal&&amt>=100)
		{
			bal=bal-amt;
			System.out.println("Withdrawn Amount is :-->"+amt);
		}
		else
		{
			System.out.println("INSAFICCENT BALANCE....?!");
			System.out.println("PLZ check your balance and process.....");
		}
	}

}
