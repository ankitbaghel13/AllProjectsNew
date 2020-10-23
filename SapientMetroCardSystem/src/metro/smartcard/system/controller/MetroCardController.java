package metro.smartcard.system.controller;

import java.util.Calendar;

import metro.smartcard.system.model.MetroCard;
import metro.smartcard.system.model.Station;
import metro.smartcard.system.model.Traveller;

public class MetroCardController {

	public static void main(String[] args) throws Exception {

		//First transaction
		Traveller traveller = new Traveller("Ankit",new MetroCard(60));
		
		swipeIn(traveller);
		int balance = swipeOut(traveller,Station.A1,Station.A5);
		MetroCard mc = new MetroCard();
		mc.setBalance(balance);
		traveller.setMetroCard(mc);
		
		Traveller traveller1 = new Traveller("Rohit",new MetroCard(60));
		
		swipeIn(traveller1);
		balance = swipeOut(traveller1,Station.A1,Station.A10);
		mc = new MetroCard();
		mc.setBalance(balance);
		traveller1.setMetroCard(mc);
		
	}

	private static void swipeIn(Traveller traveller) throws Exception {
		
		if(traveller.metroCard.getBalance()<50){
				throw new Exception("You does not have enough balance in your card to travel");
		}
	}

	public static int swipeOut(Traveller traveller,Station startingStation,Station destination) throws Exception{

			Calendar calendar = Calendar.getInstance();
			int day = calendar.get(Calendar.DAY_OF_WEEK);
			int balance;
			
			if(day==0 || day==1)
				balance =  (int) (traveller.getMetroCard().getBalance() - Math.abs(startingStation.getNum()-destination.getNum())*5.5);
			else
				balance = (int) (traveller.getMetroCard().getBalance() - Math.abs(startingStation.getNum()-destination.getNum())*7);
			
			if(balance<0){
				throw new Exception("You does not have enough balance in your card to pay for the Journey.Please Recharge");
			}
			System.out.println("Remaining balance for "+traveller.getName()+" is : "+balance);
			return balance;
	}
}
