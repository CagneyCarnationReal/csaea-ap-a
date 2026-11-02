package FundementalLesseons.Mehtods.project;

public class CandyTester {
 
    public static void main(String[] var0){

        Candy a = new Candy("Super bar", true , 1, 2.99);
        Candy b = new Candy("skittles", false , 15, 3.99);
        Candy c = new Candy("M&Ms", true , 20, 4.99);

        System.out.println(a.toString());
        System.out.println(a.isBar());
        System.out.println(a.canAfford(2.00));
        System.out.println(a.pricePerPiece());
        System.out.println(a.nameOfBar());

        System.out.println(b.toString());
        System.out.println(b.isBar());
        System.out.println(b.canAfford(2.00));
        System.out.println(b.pricePerPiece());
        System.out.println(b.nameOfBar());
        
        System.out.println(c.toString());
        System.out.println(c.isBar());
        System.out.println(c.canAfford(2.00));
        System.out.println(c.pricePerPiece());
        System.out.println(c.nameOfBar());
    }

}
