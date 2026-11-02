package FundementalLesseons.Mehtods.Equals;

public class PasswordTester {
    
    public static void main (String[] args){

        String a = "lion";
        String b = new String("lion"); // New object
        System.out.println(a); //lion
        System.out.println(b); //lion

        System.out.println(a == b); //false
        System.out.println(a.equals(b)); //true

        String cut = "dandelion".substring(5);
        System.out.println(cut); // lion
        System.out.println(cut == a); //false
        System.out.println(cut.equals(a)); //true

        String c = "lion";
        System.out.println(a == c);//true

        int x = 5;
        int y = 5;

        System.out.println(x == y);//true

        System.out.println();
        Password p =  new Password("lion");
        String at =  new String("lion");
        System.out.println(p.checkbroken(at));
        System.out.println(p.check(at));

        System.out.println();
        Password buh = new Password("goop");
        System.out.println(buh.sameAs(p));
     
        System.out.println();    
        System.out.println(p.change("tiger","tiger"));
        System.out.println(p.change("tiger", "tigre"));
        System.out.println(p.change("lion","lion"));

        System.out.println(); 
        buh.change("123ana3", "123ana3");
        Password z = new Password("password");
        
        System.out.println(p.isSafe("ana"));
        System.out.println(z.isSafe("ana"));
        System.out.println(buh.isSafe("ana"));

    }

}
