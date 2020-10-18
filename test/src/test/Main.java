package test;

import java.util.Scanner;

class BankAccount
{
	int balance;
	int previous_transaction;
	String cust_name;
	String cust_id;
	
	BankAccount(String cname, String cid)
	{
		this.cust_name = cname;
		this.cust_id = cid;
	}
	
	void deposit(int amount)
	{
		if(amount != 0)
		{
			balance += amount;
			previous_transaction = amount;
		}
	}
	
	void withdraw(int amount)
	{
		if(amount != 0 && (balance - amount) > 0)
		{
			balance -= amount;
			previous_transaction = -amount;
		}
		else
		{
			System.out.println("Account cannot be empty!! ");
		}
		
	}
	
	void getPreviousTransaction()
	{
		if(previous_transaction > 0)
		{
			System.out.println("Deposited : "+previous_transaction);
		}
		else if(previous_transaction < 0)
		{
			System.out.println("Withdrawn : "+(previous_transaction));
		}
		else
		{
			System.out.println("No transaction occured");
		}
	}
	
	void menu()
	{
		int option = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome "+cust_id);
		System.out.println("Your id : "+cust_id);
		System.out.println("1. Check balance\n2. Deposit\n3. Withdraw\n4. Previous Transaction\n5. Exit");
		
		do
		{
			System.out.println("*************************************************************************************");
			System.out.println("Enter the option : ");
			System.out.println("*************************************************************************************");
			option = scan.nextInt();
			System.out.println("\n");
			
			switch(option)
			{
			case 1 : System.out.println("-----------------------------------------------------------------------------");
					 System.out.println("Balance : "+balance);
					 System.out.println("-----------------------------------------------------------------------------");
					 System.out.println("\n");
					 break;
					 
			case 2 : System.out.println("-----------------------------------------------------------------------------");
			 		 System.out.println("Enter the amount to deposit : ");
			         System.out.println("-----------------------------------------------------------------------------");
			         int amountDeposit = scan.nextInt();
			         deposit(amountDeposit);
			         System.out.println("\n");
			         break;
			 
			case 3 : System.out.println("-----------------------------------------------------------------------------");
					 System.out.println("Enter the amount you want to withdraw : ");
					 System.out.println("-----------------------------------------------------------------------------");
					 int amountWithdraw = scan.nextInt();
					 withdraw(amountWithdraw);
					 System.out.println("\n");
					 break;
			 
			case 4 : System.out.println("-----------------------------------------------------------------------------");
					 getPreviousTransaction();
					 System.out.println("-----------------------------------------------------------------------------");
					 System.out.println("\n");
					 break;
					 
			case 5 : System.out.println("******************************************************************************");
			 		 break;
			 
			default : System.out.println("Invalid option!");
			          break;
			}
		}while(option != 5);
		System.out.println("Thank you:)");
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b = new BankAccount("Nischitha", "1");
		b.menu();
	}

}


