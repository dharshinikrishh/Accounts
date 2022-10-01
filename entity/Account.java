package entity;

public class Account {

	private long accNo;
	private String name;
	private String password;
	private int balance;
	private KycVerification kyc;
	private ContactDetails contact;
	
	
	public Account()
	{
		super();
	}
	
	public KycVerification getK()
	{
		return kyc;
	}

	public void setK(KycVerification kyc)
	{
		this.kyc= kyc;
	}
	
	public ContactDetails getC()
	{
		return contact;
	}
	public void setC(ContactDetails contact)
	{
		this.contact=contact;
	}
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public KycVerification getKyc() {
		return kyc;
	}
	public void setKyc(KycVerification kyc) {
		this.kyc = kyc;
	}
	public ContactDetails getContact() {
		return contact;
	}
	public void setContact(ContactDetails contact) {
		this.contact = contact;
	}
	public Account(long accNo, String name, String password, int balance, KycVerification kyc, ContactDetails contact) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.password = password;
		this.balance = balance;
		this.kyc = kyc;
		this.contact = contact;
		
	}
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", password=" + password + ", balance=" + balance
				+ ", kyc=" + kyc + ", contact=" + contact +  "]";
	}

	
	private Account printall(long searchAccNo) {
		// TODO Auto-generated method stub
		return null;
	}

}