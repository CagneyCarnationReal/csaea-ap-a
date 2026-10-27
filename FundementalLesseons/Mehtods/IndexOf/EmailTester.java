package FundementalLesseons.Mehtods.IndexOf;

public class EmailTester {
    
    public static void main(String[] args){

        String word = "supercalifragilisticexpialidocious";
        System.out.println(word.indexOf("b"));
        System.out.println(word.indexOf("al"));
        System.out.println(word.indexOf("x"));
        System.out.println(word.indexOf("z"));
        System.out.println(word.indexOf("s"));
        
        Email bill = new Email("billybobby7@gmail.com");
        Email john = new Email("johnlikespumpkins@outlook.com");

        System.out.println(bill.toString());
        System.out.println(bill.getAtIndex());
        System.out.println(john.getAtIndex());
        System.out.println(bill.getUser());
        System.out.println(john.getUser());
        System.out.println(bill.getDomain());
        System.out.println(john.getDomain());
    }
}
