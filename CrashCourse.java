
import java.util.ArrayList;

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

        // Strings
        String s1 = "Goodnight";
        String s2 = " and ";
        String s3 = "Goodbye";
        String result = s1 + s2 + s3;
        result += ", Cowboy.";
        System.out.println(result + "\n");

        // Arrays
        int[] arry1 = new int[10];
        System.out.println(arry1);
        System.out.println("length: " + arry1.length);

        arry1[0] = 11;
        arry1[1] = 2;

        System.out.println("remainder: " + arry1[0] % arry1[1]);

        int[] arry2 ={34, 52, 3, 64, 32,};
        System.out.println("arry2: " + arry2);

        //2d Arrays (grid/matrix)
        
        int[][] arrygrid1 = new int[4][3]; //first bracket is rows, second is collums
        // 0 0 0
        // 0 0 0
        // 0 0 0
        // 0 0 0

        System.out.println("rows: " + arrygrid1.length + "\n" + "collums: " + arrygrid1[0].length);

        int[][] arrygrid2 = { {7,8,9},
                              {4,5,6},
                              {1,2,3} };

        System.out.println(arrygrid2[0][1]); // print 8 in the grid
        System.out.println(arrygrid2[2][2]); // print 3 in the grid

        //Arraylist
        //any size, built in fuctions
        //avoid primitive data types. specia classesfor Intrgrt,Double,Boolean, String (wrapper classes)

        ArrayList<String> arrylst = new ArrayList<>();

        arrylst.add("BBQ");
        arrylst.add("Bacon");
        arrylst.add("Burger");
        arrylst.remove(0);
        arrylst.add(0, "Big");
        arrylst.set(1, "fat");
        
        System.out.println(arrylst);
        System.out.println(arrylst.size());
        System.out.println(arrylst.get(2));




    }


}
