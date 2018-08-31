import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	private static Scanner scanner;

	public static void main(String[] args) {
	
		Map<Integer, Locations> locations = new HashMap<>();
		
		Map<String, Integer> tempExits = new HashMap<String, Integer>();
		
//		locations.put(0, new Locations(0, "Orgrimmar", tempExits));
//		locations.put(1, new Locations(1, "The Barrens"));
//		locations.put(2, new Locations(2, "Ashenvale"));
//		locations.put(3, new Locations(3, "Thousand Needles"));
//		locations.put(4, new Locations(4, "Durotar"));
//		locations.put(5, new Locations(5, "Azshara"));
//		locations.put(6, new Locations(6, "Stonetalon Mountains"));
//		locations.put(0, new Locations(0, "Orgrimmar", null));
		
		tempExits = new HashMap<String, Integer>();
		tempExits.put("N", 2);
		tempExits.put("W", 6);
		tempExits.put("S", 3);
		tempExits.put("E", 4);
		tempExits.put("Q", 0);
		locations.put(1, new Locations(1, "The Barrens", tempExits));
		
		tempExits = new HashMap<String, Integer>();
		tempExits.put("S", 1);
		tempExits.put("E", 5);
		locations.put(2, new Locations(2, "Ashenvale", tempExits));
		
		tempExits = new HashMap<String, Integer>();
		tempExits.put("N", 1);
		locations.put(3, new Locations(3, "Thousand Needles", tempExits));

		tempExits = new HashMap<String, Integer>();
		tempExits.put("N", 0);
		tempExits.put("W", 1);
		locations.put(4, new Locations(4, "Durotar", tempExits));

		tempExits = new HashMap<String, Integer>();
		tempExits.put("S", 0);
		tempExits.put("W", 2);
		locations.put(5, new Locations(5, "Azshara", tempExits));

		tempExits = new HashMap<String, Integer>();
		tempExits.put("E", 1);
		locations.put(6, new Locations(6, "Stonetalon Mountains", tempExits));
		
		tempExits = new HashMap<String, Integer>();
		tempExits.put("N", 5);
		tempExits.put("S", 4);
		locations.put(0, new Locations(0, "Orgrimmar", tempExits));

		
		for(int locID : locations.keySet()){
			System.out.print(locID + " - " +locations.get(locID).getDescription());
			System.out.println(locations.get(locID).getExits());
		}
		
		String dir;
		int loc = 1;
		System.out.println("\n\n Welcome to Barens! Please look around.");
		while(true){
			scanner = new Scanner(System.in);
			dir = scanner.nextLine().toUpperCase();
//			if ((dir.contains("NORTH")) || (dir.equals("N"))) dir="N";
//			if ((dir.contains("SOUTH")) || (dir.equals("S"))) dir="S";
//			if ((dir.contains("EAST")) || (dir.equals("E"))) dir="E";
//			if ((dir.contains("WEST")) || (dir.equals("W"))) dir="W";
			
			String[] splitStr = dir.split(" ");
			for(String i: splitStr){
				if ((i.equals("NORTH")) || (i.equals("N"))) {
					dir="N";
					break;
				} else if ((i.equals("SOUTH")) || (i.equals("S"))){
					dir="S";
					break;
				} else if ((i.equals("EAST")) || (i.equals("E"))){
					dir="E";
					break;
				} else if ((i.equals("WEST")) || (i.equals("W"))){
					dir="W";
					break;
				}
			}
			
			if (!locations.get(loc).getExits().containsKey(dir)){
				System.out.println("Can't go in that direction.");
			} else{
				loc = locations.get(loc).getExits().get(dir);
				System.out.println("Welcome to - " + locations.get(loc).getDescription());
				if (dir.equals("Q")) break;
			}
		}
	}
}