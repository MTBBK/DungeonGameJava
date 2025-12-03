public class Treasure extends RoomContent {
	String itemFound;

	public Treasure(String description) {
		itemFound = description;
	}

	public String getTreasure() {
		return itemFound;
	}
}
