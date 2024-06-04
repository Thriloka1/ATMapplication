package atm;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

/* main class*/
public class OptionMenu extends Account
{
	int selection;
	Scanner menuInput=new Scanner(System.in);
	DecimalFormat moneyformat=new DecimalFormat("'$'###,##0.00");
	HashMap<Integer,Integer> data=new HashMap<Integer,Integer>();
	
	/* validate login information of customer number and pin number*/
	public void getLogin() throws IOException
	{
		int x=1;
		while(x==1)
		{
			try 
			{
				data.put(12345, 1111);
				data.put(67890, 2222);
				data.put(23456, 3333);
				data.put(78901, 4444);
				System.out.println("Welcome to the Atm Project!");
				
				System.out.println("enter your Customer Number");
				setCustomerNumber(menuInput.nextInt());
				
				System.out.println("enter your PIN Number");
				setPinNumber(menuInput.nextInt());
			}
			catch(Exception e)
			{
				System.out.println("\n"+"Invalid character(s).Only Numbers."+"\n");
				x=2;
			}
			for(Entry<Integer, Integer> entry : data.entrySet())
			{
				if(entry.getKey() == getCustomerNumber() && entry.getValue()==getPinNumber())
				{
					getAccountType();
				}
			}
			System.out.println("\n"+"Wrong Customer Number or Pin Number."+"\n");
			System.out.println("=============================================");
		}
	}
	
	
	
	
	/* Display Account type Menu with selection*/
	
	public void getAccountType() {
		System.out.println("Select the account you want to access: ");
		System.out.println("Type1: - checking account");
		System.out.println("Type 2: - Savings Account");
		System.out.println("Type 3: - Exit");
		System.out.print("Choice: ");
		
		selection=menuInput.nextInt();
		
		switch(selection)
		{
		case 1:
			getChecking();
			break;
		case 2:
			getSaving();
			break;
		case 3:
			System.out.println("Thank you for using this ATM, bye!");
			break;
		default:
			System.out.println("\n"+"Invalid Choice."+"\n");
			getAccountType();
		}
	}

	
 	public void getChecking() {
		System.out.println("Checking Account: ");
		System.out.println("Type1: - view Balance");
		System.out.println("Type 2: - WithDraw Funds");
		System.out.println("Type 3: - Deposit Funds");
		System.out.println("Type 4: - Exit");
		System.out.print("Choice: ");
		
		selection=menuInput.nextInt();
		
		switch(selection)
		{
		case 1:
			System.out.println("checking account balance: "+ moneyformat.format(getCheckingBalance()));
			getAccountType();
			break;
		case 2:
			getCheckingWithdrawInput();
			getAccountType();
			break;
		case 3:
			getCheckingDepositInput();
			getAccountType();
			break;
		case 4:
			System.out.println("Thank you for using this ATM, bye! ");
			break;
		default:
			System.out.println("\n"+ "Invalid Choice" +"\n");
			getSaving();
		}
	}
	
	
	/* Displaying saving Account Menu With Selections*/
	
	public void getSaving() {
		System.out.println("saving Account: ");
		System.out.println("Type1: - view Balance");
		System.out.println("Type 2: - WithDraw Funds");
		System.out.println("Type 3: - Deposit Funds");
		System.out.println("Type 4: - Exit");
		System.out.print("Choice: ");
		
		selection=menuInput.nextInt();
		
		switch(selection)
		{
		case 1:
			System.out.println("Saving account balance: "+ moneyformat.format(getSavingBalance()));
			getAccountType();
			break;
		case 2:
			getSavingWithdrawInput();
			getAccountType();
			break;
		case 3:
			getSavingDepositInput();
			getAccountType();
			break;
		case 4:
			System.out.println("Thank you for using this ATM, bye! ");
			break;
		default:
			System.out.println("\n"+ "Invalid Choice" +"\n");
			getSaving();
			break;
		}
	}

}
