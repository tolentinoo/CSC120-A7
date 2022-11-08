/* This is a stub for the Cafe class */
public class Cafe extends Building {
    /**
     * The attributes 
     */
    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory

    
    /**
     * The constructor 
     */
    public Cafe (String name, String address, int nFloors){
        super(name, address, nFloors);
        this.nCoffeeOunces = 120 ;
        this.nSugarPackets = 100;
        this.nCreams = 100; 
        this.nCups = 100;
        

        System.out.println("You have built a cafe: ☕");
    }


    /**
     * Sells a cup of coffee, if there are no ingredients available then the method restocks the ingredients too 
     * @param size The size of the cup of coffee 
     * @param nSugarPackets Amount of sugar packets 
     * @param nCreams Amount of creams 
     */
    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        if (this.nCoffeeOunces ==0 || this.nSugarPackets == 0 || this.nCreams ==0|| this.nCups==0){
            restock(10,10,10,10);
        }

        this.nCoffeeOunces -= size;
        this.nSugarPackets -= nSugarPackets;
        this.nCreams -= nCreams;
        this.nCups -= 1;
        // if-else statement, default restock 
    }
    
    /**
     * Restocks the ingredients needed to make a cup of coffee
     * @param nCoffeeOunces Amount of Coffee needed for restock 
     * @param nSugarPackets Amount of sugar packets needed for restock 
     * @param nCreams Amount of creams needed for restock 
     * @param nCups Amount of cups eeded for restock 
     */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
            this.nCoffeeOunces += nCoffeeOunces;
            this.nSugarPackets += nSugarPackets;
            this.nCreams += nCreams;
            this.nCups += nCups;
    } 

    /** 
     * Overload method of restock. Only restocks coffee, sugar packets and creams.
     * @param nCoffeeOunces Amount of coffee needed for restock 
     * @param nSugarPackets Amount of sugar packets needed for restock 
     * @param nCreams Amount of creams needed for restock 
     */
    private void restock(double nCoffeeOunces, int nSugarPackets, int nCreams){
        this.nCoffeeOunces += nCoffeeOunces;
        this.nSugarPackets += nSugarPackets;
        this.nCreams += nCreams;
    }

    
    /** 
     * Overload method of restock. Only restocks coffee and sugar packets.
     * @param nCoffeeOunces Amount of cofeee needed for restock
     * @param nSugarPackets Amount of sugar packets needed for restock
     */
    private void restock(double nCoffeeOunces, double nSugarPackets){
        this.nCoffeeOunces += nCoffeeOunces;
        this.nSugarPackets += nSugarPackets;
    }
   

    /* 
     * Display the options of the methods you can use in this subclass
     */
    public void showOptions() {
        System.out.println("Available options at " + this.name + ":\n + restock() \n + sellCoffee() \n + enter() \n + exit()\n ");
    }

    /* (non-Javadoc)
     * Since cafe's only have one floor then a warning message appears when they try to go to any floor that is not the first floor
     */
    public void goToFloor(int floorNum){
        if (floorNum != 1){
          System.out.println("Warning: You do not have access to other floors ");
        }
    }
    
    // print statement to test 
    public static void main(String[] args) {
       Cafe shop = new Cafe("Compass Cafe", "1 Neilson Way Northampton,MA 01063",1);
       System.out.println(shop);
       shop.sellCoffee(12,4,5);
       shop.showOptions();
       shop.restock(12.5, 5.5);
       shop.restock(10.0, 3, 12);

    }
    
}
