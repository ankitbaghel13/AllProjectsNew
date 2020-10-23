package org.netscape.bean;

public class Account {

	private String accountNumber;
	private String person;
	private int balance;
	private AccountType accType;
	private int totalCredit;
	private int totalDebit;

	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	public Account(String accountNumber, String person, int balance,
			AccountType accType) {
		super();
		this.accountNumber = accountNumber;
		this.person = person;
		this.balance = balance;
		this.accType = accType;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}
	
	public int getBalance(){
		return balance;
	}
	
	public void credit(int amount){
		balance += amount;
		totalCredit += amount;
	}
	
	public void debit(int amount){
		balance -= amount;
		totalDebit += amount;
	}

	public AccountType getAccType() {
		return accType;
	}

	public void setAccType(AccountType accType) {
		this.accType = accType;
	}

	public int getTotalCredit() {
		return totalCredit;
	}

	public void setTotalCredit(int totalCredit) {
		this.totalCredit = totalCredit;
	}

	public int getTotalDebit() {
		return totalDebit;
	}

	public void setTotalDebit(int totalDebit) {
		this.totalDebit = totalDebit;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", person=" + person
				+ ", balance=" + balance + ", accType=" + accType
				+ ", totalCredit=" + totalCredit + ", totalDebit=" + totalDebit
				+ "]";
	}
}
