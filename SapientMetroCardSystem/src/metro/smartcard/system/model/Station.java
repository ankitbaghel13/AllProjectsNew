package metro.smartcard.system.model;

public enum Station {

	A1(1),A2(2),A3(3),A4(4),A5(5),A6(6),A7(7),A8(8),A9(9),A10(10);
	
	private int num;
	
	Station(int num){
		this.setNum(num);
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
}
