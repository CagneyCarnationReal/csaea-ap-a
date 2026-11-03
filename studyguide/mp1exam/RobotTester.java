package studyguide.mp1exam;

public class RobotTester {
    
    public static void main(String[] args){

        //Object: an instance of a class
        //Instanitation: new + constructor call

        //Arguments "Rover", "RX-77-B" , 8.0
        Robot r1 = new Robot("Rover","RX-77-B", 8.0);
        Robot r2 = new Robot("Unit", "TK-21", 3.0);

        System.out.println(r1);

        Robot r3 = r1;
        System.out.println(r3);// refers back to the old object not a new object

        //aliasing: same object different names
        r3.setName("Scout");
        System.out.println(r1.getName());

        System.out.println(r1 == r3);//true
        System.out.println(r1 == r2);//false
        // == compares objects
        
        System.out.println(r1.equals(r3));//true
        // .equals() compares the values
        String s1 = "RX-77-B";
        String s2 = new String("RX-77-B");
        System.out.println(s1 == s2); //false
        System.out.println(s1.equals(s2));//false

        System.out.println(r1.serialContains("77"));//true
        System.out.println(r1.serialContains("rx"));//false

    }
}
