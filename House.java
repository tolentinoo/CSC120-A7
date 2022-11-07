/* This is a stub for the House class */
import java.util.ArrayList;

public class House extends Building {

  /**
   * The attributes 
   */
  private ArrayList <String> residents;
  private boolean hasDiningRoom;
  private boolean hasElevator;


  /**
   * The Constructor, intializes residents and hasDiningRoom
   */
  public House(String name, String address, int nFloors, boolean hasDiningRoom, boolean hasElevator) {
    super( name, address, nFloors); //belongs to house we're making using the attributes of Building
    this.hasDiningRoom = hasDiningRoom;
    this.residents = new ArrayList<String>();
    this.hasElevator= hasElevator;
    System.out.println("You have built a house: 🏠");
  }

  /**
   * Accessor for hasDiningRoom
   * @return boolean Whether the house has a dining room
   */
  public boolean hasDiningRoom(){
    return this.hasDiningRoom;
  }

  /**
   * Accessor for number of residents 
   * @return int the size of the arraylist (this.residents)
   */
  public int nResidents(){
    return this.residents.size();
   }

  /**
   * Adds the resident moving in to the arraylist of current residents in this house 
   * @param name The name of resident moving in
   */

  public void moveIn(String name){
    this.residents.add(name);
   }
  
  /**
   * Removes the resident moving out from the arraylist of residents living in this house
   * @param name The name of the resident moving out 
   * @return The name of the resident moving out 
   */

  public String moveOut(String name) {
    this.residents.remove(name);
    return (name);
  }

  /**
   * Tells us if the person is a resident of the house 
   * @param person The name of the person you're trying to search for in the house 
   * @return A boolean that indicates whether the person is a resident or not
   */
  public boolean isResident(String person){
    return this.residents.contains(person);
    
  }

  public void showOptions() {
    super.showOptions();
    System.out.print( " + isResident() \n + moveIn() \n + moveOut() \n + nResidents()\n + hasDiningRoom()");
}
  public void goToFloor(int floorNum){
      if (this.hasElevator == true){
        super.goToFloor(floorNum);
      }
}

  public static void main(String[] args) {
    House Cushing = new House("Cushing House", "1 Paradise Rd Northampton, MA 01063", 5, true, false);
    System.out.println(Cushing);
    System.out.println(Cushing.hasDiningRoom);
    Cushing.moveIn("Rachel");
    System.out.println(Cushing.nResidents());
    Cushing.moveIn("Taylor");
    System.out.println(Cushing.nResidents());
    System.out.println(Cushing.isResident("Taylor"));
    System.out.println(Cushing.moveOut("Taylor"));
    System.out.println(Cushing.nResidents());
    System.out.println(Cushing.isResident("Rachel"));
    Cushing.showOptions();
    Cushing.goToFloor(4);

  }

}