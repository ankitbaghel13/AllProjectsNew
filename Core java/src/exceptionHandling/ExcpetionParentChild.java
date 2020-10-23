package exceptionHandling;
import java.io.IOException;

class Aeroplane{
	public Aeroplane() throws IOException,RuntimeException{
		System.out.println("Inside Aeroplane");
	}
}

class AirJet extends Aeroplane{

	public AirJet() throws IOException,ArithmeticException{
		super();
		// TODO Auto-generated constructor stub
	}
	
}

public class ExcpetionParentChild {

	public static void main(String[] args) throws IOException {

		new Aeroplane();
	}

}
