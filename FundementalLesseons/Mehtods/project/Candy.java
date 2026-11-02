package FundementalLesseons.Mehtods.project;

public class Candy {
    
    private String candyName;
    private boolean isChoco;
    private int pieces;
    private double price;

    public Candy(String cName, boolean isC, int pieces, double price){

        this.candyName = cName;
        this.isChoco = isC;
        this.pieces = pieces;
        this.price = price;

    }
    
    public String toString(){
        return "Name " + candyName + ". made using chocolate " + isChoco + ". there is " + pieces + " pieces. It is " + price + " dollars.";
    }

    public boolean isBar(){
        return candyName.indexOf("bar") != -1;
    }
    
    public boolean canAfford(double budget){
        if (price <= budget){
            return true;
        }
        else{
            return false;
        }
    }

    public double pricePerPiece(){
        return price / pieces;
    }

    public String nameOfBar(){
        boolean x = isBar();
        if (x = true){
            return candyName.substring(0 , candyName.indexOf("bar") - 1);
        }
        else{
            return "not a bar";
        }
    }











}
