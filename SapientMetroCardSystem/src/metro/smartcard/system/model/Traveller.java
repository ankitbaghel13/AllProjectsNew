package metro.smartcard.system.model;

public class Traveller {

	private String name;
	public MetroCard metroCard;
	
	public Traveller(String name,MetroCard metroCard){
		this.name = name;
		this.metroCard = metroCard;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public MetroCard getMetroCard() {
		return metroCard;
	}
	public void setMetroCard(MetroCard metroCard) {
		this.metroCard = metroCard;
	}
	
	
}
