public class CrashCourse {    //class header
    
    public static void main(String[] args) {

        // comments

        /*muiltiline
        comment
        here
        */

        System.out.print("hello");
        System.out.println("goop"); //autoprints on new line
        System.out.println("im gumpin it");

        //Varibles

        //Primitive Variables
        int a; //integer
        double b; // decimal/float
        boolean c; //true or false

        a = 4;
        b = 5.5;
        c = false; //lowercase booleans

        // Arithmetic operators
        // + - / *
        // +=  -=  /=  %=

        int d = 3;
        d += 7;

        System.out.println("d = " + d);

        // incremend and decements by 1
        // --  ++
        d--;
        d++;
        d++;
        System.out.println("d = " + d);

        // comparisions retursns true of false
        // < > <= >= == !=

        System.out.println(4 > 3);
        System.out.println(12 != 8);
        System.out.println(8 == 3);

        // logical operators
        // NOT: !    AND:  &&   OR: ||

        boolean f = false; boolean t = true;

        //predict
        System.out.println(!f); //True
        System.out.println(f && t); //False
        System.out.println(f || t); //True
        System.out.println(f || t && !f); //True

        System.out.println(f && t); // short circusts after checking f
        System.out.println(t || (f && t)); // short circuts after checking the first t
        
        // Casting (converting)
        int g = (int)5.5; 
        System.out.println(g);
        double h = (double)5/6;
         System.out.println(h);

    
         
    }

}
