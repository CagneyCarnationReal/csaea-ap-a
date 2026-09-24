package CustomClass;

public class CandyTester{

    public static void main(String[] args){

        Candy bar = new Candy("YumBar", true , false , true , 2.99 , 10.0 , 1);
        Candy bag = new Candy("Bites", false, true , false , 1.99 ,  6.0 , 15);
        Candy bad = new Candy("icky", true , true , true , 3.99 , 8.0 , 1);

        bar.checkpackage();
        bar.changeName("Hersheys");
        bar.crumble();
        bar.changePrice(5.99);
        bar.lick();

        bag.checkpackage();
        bag.changeName("Pucker Bits");
        bag.crumble();
        bag.changePrice(3.99);
        bag.lick();

        bad.checkpackage();
        bad.changeName("Garbage Cans");
        bad.crumble();
        bad.changePrice(1.99);
        bad.lick();

    }

}