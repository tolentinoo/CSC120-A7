import java.util.Hashtable;
import java.util.Set;


/* This is a stub for the Library class */
public class Library extends Building {


  /**
   * The attributes, a hastable declaring that the key is a string and that the value is a boolean
   */
  private  Hashtable<String, Boolean> collection;
  private boolean hasElevator;

    /**
     * The constuctor of Library which also inherts from Building's constructor 
     * library is a hashtable 
     */
    public Library(String name, String address, int nFloors, boolean hasElevator) {
      super( name, address, nFloors);
      this.collection = new Hashtable<String, Boolean> ();
      this.hasElevator = hasElevator;
      System.out.println("You have built a library: 📖");
    }

    /**
     * Adds a book to the library, the key is the title of the book while the value tells you if it's available.
     * Default value of true in this method because the book is being added to the library 
     * @param title the title of the book being added to the hashtable 
     */
    public void addTitle(String title){
      this.collection.put(title,true);
    }


    /**
     * Removes the title from the library 
     * @param title title of the book they want to remove 
     * @return title of the book that was removed
     */
    public String removeTitle(String title){
      this.collection.remove(title);
      return title; // return the title that we removed  
    
    } 

    /**
     * Allows person to checkout the book. 
     * By checking the book out you are only changing the value 
     * @param title title of book you want to check out
     */
    public void checkOut(String title){
      this.collection.replace(title,true,false );
    }
    
    /**
     * Allows person to return book.
     * By changing the value(availabilty) back to true
     * @param title title of book being returned
     */
    public void returnBook(String title){
      this.collection.replace(title,false,true );
    }
    /**
     * Checks whether a particular book exists in the library collection
     * @param title title of the book they're searching for 
     * @return Whether the book is kept in the library 
     */
    public boolean containsTitle(String title){
      return this.collection.containsKey(title);

    }

    /**
     * Lets people know if a book is avaiable 
     * @param title the name of the book you're searching for 
     * @return A boolean that tells people availabilty status
     */
    public boolean isAvailable(String title){ 
      return this.collection.get(title);
    }// returns true if the title is currently available, false otherwise

    /**
     * Prints out the entire collection in an easy-to-read way with a banner 
     */
    public void printCollection(){
      System.out.println("**** My Collection *****");
      Set <String> title = collection.keySet();
      for(String key : title){
        if (collection.get(key)== true ){
          System.out.println("The book "+ key +" is available");
        }
        else{
          System.out.println("The book "+ key +" is unavailable ");
        }
        
    } 
  }
    public void showOptions() {
      super.showOptions();
      System.out.println( " + addTile() \n + removeTitle() \n + checkOut() \n + returnBook()\n + containsTitle()\n + isAvailable()\n + printCollection()");
}
    public void goToFloor(int floorNum){
      if (this.hasElevator == true){
        super.goToFloor(floorNum);
      }

    }


    public static void main(String[] args) {
      Library FL = new Library ("Forbes ", "33 Green St Northampton, MA 01063", 4, true);
      System.out.println(FL);
      FL.addTitle("New Story");
      System.out.println(FL.isAvailable("New Story"));
      FL.showOptions();
      FL.goToFloor(5);
      
    }
  
  }