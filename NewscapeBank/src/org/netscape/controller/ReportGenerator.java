package org.netscape.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.netscape.bean.Account;
import org.netscape.bean.Bank;
import org.netscape.util.BankUtil;

public class ReportGenerator {

	public static void main(String[] args) {
		
		String fileName = "C:/Users/Ankit Baghel/Desktop/TransactionDetails.csv";
		//Read all transactions from csv file
		ReportGenerator reportGenerator = new ReportGenerator();
		Map<String,Account> accountMap = reportGenerator.readAndProcess(fileName);
		reportGenerator.printTransactionRecords(accountMap);
	}
	
	public Map<String,Account> readAndProcess(String csvFile) {
		final String delimiter = ",";
		Map<String,Account> accountMap = new HashMap<>();
		try {
			File file = new File(csvFile);
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line = "";
			String[] transaction;
			while((line = br.readLine()) != null) {
				transaction = line.split(delimiter);

				String accountNumber = transaction[1];
				String creditAmount = transaction[2];
				String debitAmount = transaction[3];
				
				if(transaction[1].equals("acctNo"))
					continue;

				Bank bank = new Bank("NetscapeBank", accountMap);
				Account account;

				if(accountMap.get(accountNumber)==null){
					account = new Account();
					account.setAccountNumber(accountNumber);
				}else{
					account = accountMap.get(accountNumber);
				}

				if(BankUtil.isValidTransaction(creditAmount))
					account.credit(Integer.valueOf(creditAmount));
				if(BankUtil.isValidTransaction(debitAmount))
					account.debit(Integer.valueOf(debitAmount));

				accountMap.put(accountNumber, account);
			}
			br.close();
			
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
		return accountMap;
	}
	
	public void printTransactionRecords(Map<String,Account> accountMap){
		System.out.println("Acct TotalCredits TotalDebits Balance");
		for(Account account : accountMap.values()){
			System.out.println(account.getAccountNumber()+" "+account.getTotalCredit()+" "+account.getTotalDebit()+" "+account.getBalance());
		}
	}
}
