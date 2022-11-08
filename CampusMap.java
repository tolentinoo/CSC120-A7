import java.util.ArrayList;

public class CampusMap {

    ArrayList<Building> buildings;

    /* Default constructor, initializes empty ArrayList */
    public CampusMap() {
        buildings = new ArrayList<Building>();
    }

    /**
     * Adds a Building to the map
     * @param b the Building to add
     */
    public void addBuilding(Building b) {
        System.out.println("Adding building...");
        buildings.add(b);
        System.out.println("-->Successfully added " + b.getName() + " to the map.");
    }

    /**
     * Removes a Building from the map
     * @param b the Building to remove
     * @return the removed Building
     */
    public Building removeBuilding(Building b) {
        System.out.println("Removing building...");
        buildings.remove(b);
        System.out.println("-->Successfully removed " + b.getName() + " to the map.");
        return b;
    }

    public String toString() {
        String mapString = "DIRECTORY of BUILDINGS";

        for (int i = 0; i < this.buildings.size(); i ++) {
            mapString += "\n  " + (i+1) + ". "+ this.buildings.get(i).getName() + " (" + this.buildings.get(i).getAddress() + ")";
        }
        return mapString;
    }

    public static void main(String[] args) {
        CampusMap myMap = new CampusMap();
   
        myMap.addBuilding(new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4));
        myMap.addBuilding(new Building("Bass Hall", "4 Tyler Court Northampton, MA 01063", 4));
        //The buildings I added 
        myMap.addBuilding(new Building("Alumnae Gym", "83 Green St, Northampton, MA 01063", 4));
        myMap.addBuilding (new Cafe("Compass Cafe", "7 Neilson Drive Northampton,MA 01063",1));
        myMap.addBuilding(new Library("Hillyer Art Library", "20 Elm St, Northampton, MA 01063",2,false));
        myMap.addBuilding(new Building("Seeyle Hall", "5 Chapin Way, Northampton, MA 01063",5));
        myMap.addBuilding(new House("Cushing House", "1 Paradise Rd, Northampton,MA 01063", 5, true, false));
        myMap.addBuilding(new Building("Smith College Computer Store ", "23 Elm St, Northampton, MA 01063", 1));
        myMap.addBuilding(new Building ("Stoddard Hall","23 Elm St, Northampton, MA 01063",4));
        myMap.addBuilding(new Library ("Young Library","4 Tyler Ct, Northampton,MA 01063", 4,false ));
        myMap.addBuilding(new House ("Wilder House", " 1 Mandalle, Northampton, MA 01063",5, true, true ));
        myMap.addBuilding(new Cafe("Campus Cafe", "1 Chapin Way, Northampton,MA 01063", 4));




        System.out.println(myMap);
    }
    
}
