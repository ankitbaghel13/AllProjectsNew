package org.netscape.util;

public class BankUtil {

	public static boolean isValidTransaction(String transaction){
		if(transaction.equals("-"))
			return false;
		else
			return true;
	}
}
