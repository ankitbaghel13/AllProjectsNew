package com.poortoys.examples;

public class AppMain {

	
    public static void main(String[] args) {
    	AppMain main = new AppMain();
    	System.out.println(main.generateSequence(3,5));
    
    }

	public StringBuffer generateSequence(int lowerBound, int upperBound) {
		
    	// 1,100   40,50
    	// 3,5	
    	
    	int first = 3;
    	int second = 5;
    	int sum = 0;
    	StringBuffer result = new StringBuffer();
    	
    	if(first>upperBound && second>upperBound) {
    		return null;
    	}
    	
    	for(int i=lowerBound; i<upperBound;i++) {
    		if(i%first==0 || i%second==0) {
    			sum += i;
    			result.append("+"+i); 
    		}
    	}
    	
    	if(result.length()>0) {
    		result = new StringBuffer(result.substring(1));
    		result.append("="+sum);
    	}
    	else {
    		result=null;
    	}
    		
    	return result;
	}

}
