import java.util.HashMap;
import java.util.Map;

public class Locations {
	private final int locationId;
	private final String description;
	private Map<String,Integer> exits = new HashMap<>();
	
	public Locations(int locationId, String description, Map<String, Integer> exits) {
		super();
		this.locationId = locationId;
		this.description = description;
		this.exits = new HashMap<String, Integer>(exits);
		this.exits.put("Q", 0);
	}

	public int getLocationId() {
		return locationId;
	}

	public Map<String, Integer> getExits() {
		return exits;
	}

	public String getDescription() {
		return description;
	}

//	public void setExits(String direction, Integer locID) {
//		this.exits.put(direction, locID);
//	}	
}
