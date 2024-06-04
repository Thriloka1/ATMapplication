package atm;

import java.io.IOException;

public class ATM extends OptionMenu 
{
	public static void main(String[] args) throws IOException
	{
		OptionMenu optionmenu=new ATM();
		
		optionmenu.getLogin();
	}
}