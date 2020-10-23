package InterviewAltimetrikPaypal;

public class Outer5 {

	public static int temp1=1;
	private static int temp2=2;
	private int temp4=4;
	
	public class Inner{
		private int temp5=5;
		private int getSumof2() {
			return (temp1+temp2);
		}
		int getSumof4() {
			return (temp1+temp2+temp4);
		}
		public int getSumof5() {
			return (temp1+temp2+temp5);
		}
	}
	public static void main(String[] args) {
		Outer5.Inner obj = new Outer5.Inner();
		System.out.println(obj.getSumof2());
		System.out.println(obj.getSumof4());
		System.out.println(obj.getSumof5());
	}

}
