package InterviewAltimetrikPaypal;

public class Outer3 {

	public static int temp1=1;
	private static int temp2=2;
	public int temp3=3;
	private int temp4=4;
	
	public Outer3(int temp3, int temp4) {
		super();
		this.temp3 = temp3;
		this.temp4 = temp4;
	}
	public static class Inner{
		private static int temp5=5;
		private static int getSumof2() {
			return (temp1+temp2);
		}
		private static int getSumof3() {
			return (temp1+temp3);
		}
		private static int getSumof4() {
			return (temp1+temp4);
		}
		private static int getSumof5() {
			return (temp1+temp5);
		}
	}
	public static void main(String[] args) {
		Outer3.Inner obj = new Outer3.Inner();
		System.out.println(obj.getSumof2());
		System.out.println(obj.getSumof4());
		System.out.println(obj.getSumof5());
	}

}
