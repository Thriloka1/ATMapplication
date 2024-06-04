package atm;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account 
{
	
	private int customerNumber;
	private int pinNumber;
	private double checkingBalance=0;
	private double savingBalance=0;
	
	Scanner input=new Scanner(System.in);
	DecimalFormat moneyformat=new DecimalFormat("'$'###,##0.00");
	
	/* set the customer number */
	
	public int setCustomerNumber(int customerNumber)
	{
		this.customerNumber=customerNumber;
		return customerNumber;
	}
	
	/* get the customer number*/
	
	public int getCustomerNumber()
	{
		return customerNumber;
	}
	
	/* set the pin number*/
	public int setPinNumber(int pinNumber)
	{
		this.pinNumber=pinNumber;
		return pinNumber;
	}
	
	/* get the pin number*/
	
	public int getPinNumber()
	{
		return pinNumber;
	}
	
	/* get checking Account Balance*/
	public double getCheckingBalance()
	{
		return checkingBalance;
	}
	
	/* get saving account balance*/
	public double getSavingBalance()
	{
		return savingBalance;
	}
	/* calculate checking amount withdrawl*/
	
	public double calcCheckingWithdraw(double amount)
	{
		checkingBalance=(checkingBalance-amount);
		return checkingBalance;
	}
	
	/* calculate saving account withdrawl*/
	
	public double calcSavingWithdraw(double amount)
	{
		savingBalance=(savingBalance-amount);
		return savingBalance;
	}
	
	
/* calculate checking amount Deposit*/
	
	public double calcCheckingDeposit(double amount)
	{
		checkingBalance=(checkingBalance+amount);
		return checkingBalance;
	}
	
	/* calculate saving account Deposit*/
	
	public double calcSavingDeposit(double amount)
	{
		savingBalance=(savingBalance+amount);
		return savingBalance;
	}
	
	/*customer checking accounnt withraw input*/
	
	public void getCheckingWithdrawInput()
	{
		System.out.println("checking account balance: "+moneyformat.format(checkingBalance));
		System.out.println("amount you want to withdraw from checking Account: ");
		double amount=input.nextDouble();
		
		if((checkingBalance-amount)>=0)
		{
			calcCheckingWithdraw(amount);
			System.out.println("new checking account balance : "+moneyformat.format(checkingBalance));
		}else {
			System.out.println("balance cannot be negative"+"\n");
		}
	}
	
	/* customer saving account withdraw input*/
	public void getSavingWithdrawInput()
	{
		System.out.println("saving account balance: "+moneyformat.format(savingBalance));
		System.out.println("amount you want to withdraw from saving Account: ");
		double amount=input.nextDouble();
		
		if((savingBalance-amount)>=0)
		{
			calcSavingWithdraw(amount);
			System.out.println("new saving account balance : "+moneyformat.format(savingBalance));
		}else {
			System.out.println("balance cannot be negative"+"\n");
		}
	}
	
	
	/* customer checking account deposit input*/
	public void getCheckingDepositInput()
	{
		System.out.println("checking balance: "+moneyformat.format(checkingBalance));
		System.out.println("amount you want to deposit to checking account: ");
		double amount=input.nextDouble();
		
		if(checkingBalance+amount>=0)
		{
			calcCheckingDeposit(amount);
			System.out.println("new checking balance is: "+moneyformat.format(checkingBalance));
		}else {
			System.out.println("balance cannot be negative "+"\n");
		}
	}
	
	/* customer saving account deposit input*/
	public void getSavingDepositInput()
	{
		System.out.println("saving balance: "+moneyformat.format(savingBalance));
		System.out.println("amount you want to deposit to saving account: ");
		double amount=input.nextDouble();
		
		if(savingBalance+amount>=0)
		{
			calcSavingDeposit(amount);
			System.out.println("new saving balance is: "+moneyformat.format(savingBalance));
		}else {
			System.out.println("balance cannot be negative "+"\n");
		}
	}
	

	
}
