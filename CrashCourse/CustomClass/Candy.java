package CustomClass;

public class Candy {
    
    String candyName;
    boolean isBar;
    boolean isSour;
    boolean hasChocolate;
    double price;
    double grams;
    int pieces;

    public Candy(String candyName, boolean isBar , boolean isSour , boolean hasChocolate , double price , double grams , int pieces){

        this.candyName = candyName;
        this.isBar = isBar;
        this.isSour = isSour;
        this.hasChocolate = hasChocolate;
        this.price = price;
        this.grams = grams;
        this.pieces = pieces;
    }

    public void checkpackage(){

         System.out.println("This is a " + candyName + " it is " + price + "$");

    }
    
    
    public void changeName(String newName){

        candyName = newName;
        System.out.println("Your candy is now called " + candyName);

    }

    public void crumble(){

        if(isBar = true){
            pieces = 5;
            System.out.println("you know have a handful of peices");
        }
        else if(isBar = false & pieces <= 20){
            pieces = pieces * 2;
            System.out.println("you know have " + pieces + " pieces of candy");

        }
        else if(isBar = false & pieces >= 40){

            System.out.println("Your peices are getting to small!");

        }

    }


    public void changePrice(double newPrice){

        price = newPrice;
        System.out.println(candyName + " Now costs " + price + "$");

    }

    public void lick(){

        if(isSour & hasChocolate == true){
            
            System.out.println("it tastes like absolute garbage");
        
        }
        
        else if(isSour == true){
        
            System.out.println("it has a nice tang to it");
        
        }
        
        else if(hasChocolate == true){
        
            System.out.println("it has a plesant chocolate taste");
        
        }
        
        else{
        
            System.out.println("it just tastes like sugar");
        
        }

    }



}
