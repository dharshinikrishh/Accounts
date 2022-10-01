

package entity;
import java.util.Scanner;
import entity.Account;
import entity.KycVerification;
import entity.ContactDetails;


public class Application {

	Account allAccount[] = new Account[1515151];
	int noofAccount = 0;
	

	Scanner sc = new Scanner(System.in);
	Scanner scStr = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Application app=new Application();
		
		while (true) {
			System.out.println(" ------------Bank Detail-----------");
			System.out.println("1. Submit user details ");
			System.out.println("2. Do Deposit Operation ");
			System.out.println("3. Do withDrawal Operation ");
			System.out.println("4. Print user all details");
			System.out.println("5  Print user Contact Details");
			System.out.println("6. Print user KYC document details");
			System.out.println("7. Print Balance");
			System.out.println("8. Change Mobile Number");
			System.out.println("9. Change EmailId");
			

			System.out.println("0. Exit ");

			System.out.println("Enter ur choice :- ");

			switch (app.sc.nextInt()) {

			case 1:
				app.submitUserDetails();
				break;
			case 2:
				app.deposit();
				break;
			case 3:
				app.withdraw();
				break;
			case 4:
				app.viewAllUserDetails();
				break;
			case 5:
				app.viewContactDedtails();
				break;
			case 6:
				app.viewKycVerification();
				break;
			case 7:
				app.balance();
				break;
			case 8:
				app.changeMobileNumber();
				break;
			case 9:
				app.changeEmailId();
				break;



			default:
				System.out.println("Exit ");
				System.exit(0);
			}//end of switch

		}//end of while
	}

	
	
	public void changeEmailId() {
		// TODO Auto-generated method stub
		System.out.println("Enter the Account Number");
		long accNo = sc.nextLong();

		Account a = printall(accNo);

		System.out.println(a.getContact());

		System.out.println(" Enter New Email Id ");
		String eID = scStr.nextLine();

		a.getContact().setEmail(eID);

		System.out.println("your new Email Id-    " + a.getContact().getEmail());
	}



	public void changeMobileNumber() {
		System.out.println("Enter the Account Nummber");
		long searchAccNo=sc.nextInt();
		Account a=printall(searchAccNo);
		System.out.println(a.getMobileNo());
		System.out.println("Enter the mobile Nummber");
		long mobileNo=sc.nextInt();
	}
	



	




	public void balance() {
		// TODO Auto-generated method stub
		System.out.println("Enter the Account Nummber");
		long searchAccNo=sc.nextInt();
		Account a=printall(searchAccNo);
		System.out.println(a.getBalance());
	}
		




	public void viewKycVerification() {
		
		System.out.println("Enter the Account Nummber");
		long searchAccNo=sc.nextInt();
		Account a=printall(searchAccNo);
		System.out.println(a.getKyc());
	}



	public void viewContactDedtails() {
		System.out.println("Enter the Account Nummber");
		long searchAccNo=sc.nextInt();
		Account a=printall(searchAccNo);
		System.out.println(a.getContact());
	}



	public void viewAllUserDetails() {
		System.out.println("Enter the Account Nummber");
		long searchAccNo=sc.nextInt();
		Account a=printall(searchAccNo);
		System.out.println("a");
		
	}






	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("Enter the WithDrawal amount");
		int amount=sc.nextInt();
		System.out.println("Enter the Account Number");
		int searchAccNumber=sc.nextInt();
		
		for(int i=0;i<noofAccount;i++)
		{
			Account a= allAccount[i];
			boolean isFound=(a.getAccNo() == searchAccNumber)?true:false;
			
			if(isFound)
			{
				a.setBalance(a.getBalance()-amount);
				System.out.println("Withdrawal of amount has to been done");
				System.out.println(a.getAccNo()+"-"+a.getBalance());
			}
		}
	}



	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Enter the Deposit amount");
		int amount=sc.nextInt();
		System.out.println("Enter the Account Number to be Deposited");
		int searchAccNumber=sc.nextInt();
		
		for(int i=0;i<noofAccount;i++)
		{
			Account a= allAccount[i];
			boolean isFound=(a.getAccNo() == searchAccNumber)?true:false;
			
			if(isFound)
			{
				a.setBalance(a.getBalance()+amount);
				System.out.println("Amount Transfer Done");
				System.out.println(a.getAccNo()+"-"+a.getBalance());
			}
		}
		
		
	}






	public void submitUserDetails() 
	{
		 
		
		System.out.println("Enter your Name");
		String name=scStr.nextLine();
		
		System.out.println("Enter your Account Number");
		long accNo=sc.nextLong();
		
		
		System.out.println("Enter your Password");
		String password=scStr.nextLine();

		System.out.println("Enter your Balance");
		int balance=sc.nextInt();
		
		System.out.println("Enter your PanNumber");
		String panNo=scStr.nextLine();
		
		System.out.println("Enter your Aadhar Number");
		long aadhar=sc.nextLong();
		
		System.out.println("Enter the document type");
		String doctype=scStr.nextLine();
		
		System.out.println("Enter the document Number");
		String docNo=scStr.nextLine();
		

		System.out.println("Enter the house number");
		String houseNo=scStr.nextLine();
		

		System.out.println("Enter the Locality Name");
		String locName=scStr.nextLine();
		

		System.out.println("Enter the City Name");
		String cityName=scStr.nextLine();
		
		
		System.out.println("Enter the State Name");
		String stateName=scStr.nextLine();
		

		System.out.println("Enter the Country Name");
		String countryName=scStr.nextLine();
		

		System.out.println("Enter the pincode");
		long pincode=sc.nextLong();
		
		System.out.println("Enter the Mobile Number");
		long mobileNo=sc.nextLong();
		
		System.out.println("Enter the EmailId");
		long email=sc.nextLong();
		
	
	
		
		ContactDetails contact =new ContactDetails(houseNo,locName,cityName, stateName, countryName, pincode, mobileNo, email);
		KycVerification kyc= new KycVerification(panNo, aadhar, doctype, docNo);
		Account a= new Account(int()accNo,name,password,balance);
	
		a.setK(kyc);
		a.setC(contact);
		
		allAccount[noofAccount++]=a;
		System.out.println(" "+a);
		System.out.println("Added in the list");
	
	}
	

	

}
