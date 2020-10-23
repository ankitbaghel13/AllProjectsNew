package InterviewAltimetrikPaypal;

public class Outer15 {
	int num1=3;
	static int num2=5;

	public Outer15(int num1,int num2) {
		// TODO Auto-generated constructor stub
		if(num2<30) {
			this.num2 = num2;
		}
		num1=num1;
	}
	public static void main(String[] args) {

		Outer15 o1 = new Outer15(9, 10);
		Outer15 o2 = new Outer15(12, 22);
		
		System.out.println(o1.num1+" "+o1.num2+" "+o2.num1+" "+o2.num2);
	}

}
