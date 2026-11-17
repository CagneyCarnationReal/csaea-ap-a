import java.util.Arrays;

public class NativeArrays{

    public static void main(String [] args){

        System.out.println();

        int[] score = new int[5];

        System.out.println("Default values: " + Arrays.toString(score));
        
        int[] num = {3,7,1,9,4};

        System.out.println("Intial list: " + Arrays.toString(num));

        String[] names = new String[3];
        boolean[] flags = new boolean[3];
        double[] prices = new double[3];

        System.out.println("String defaults:  " + Arrays.toString(names));
        System.out.println("boolean defaults: " + Arrays.toString(flags));
        System.out.println("double defaults:  " + Arrays.toString(prices));

        // ===== 2. INDEXES AND LENGTH =====

        // Indexes start at 0. The last index is length - 1.
        System.out.println("\nFirst element nums[0]: " + num[0]);
        System.out.println("Length (a field, no parentheses): " + num.length);
        System.out.println("Last element nums[nums.length - 1]: " + num[num.length - 1]);
   
        // change in list(index 2 changes to 6)
        num[2] = 6;

        // ===== 3. OUT OF BOUNDS =====
        //System.out.println(nums[5]);
        //System.out.println(nums[-1]);

        
        // ===== 4. PARTS OF A FOR LOOP =====
        //   for (initialization; condition; update)
        //   initialization -> runs once, sets the starting index
        //   condition      -> checked before every pass; loop stops when false
        //   update         -> runs after every pass


        for (int i = 0; i < num.length; i ++){

            System.out.println(" index " + i + " -> value " + num[i]);
        
        }
    
        // ===== 5. ENHANCED FOR LOOP =====
    
        // Gives you each VALUE, no index. Good for reading, not for changing.

        for (int pacobell : num) {
            System.out.println(" enhanced value " + pacobell);
        }
    
        System.out.println();


        // Challenge 1: Double It
        // Multiply every element by 2, then print the array.
        int[] challengeOne = {3, 7, 1, 9, 4};
        // TODO: your loop here

        for (int i = 0; i < challengeOne.length; i ++){

            System.out.println("doubled value = " + challengeOne[i] * 2);

        }
        //modified for even
        for (int i = 0; i < challengeOne.length; i += 2){

            System.out.println("doubled value = " + challengeOne[i] * 2);

        }

        // Challenge 2: Every Other
        // Use i += 2 to add 10 to only the elements at even indexes, then print.
        int[] challengeTwo = {3, 7, 1, 9, 4};
        // TODO: your loop here

         for (int i = 0; i < challengeTwo.length; i += 2){

            System.out.println(challengeTwo[i] + 10);

        }

            // Challenge 3: Replace Negatives
        // Change every negative number to 0, then print.
        int[] temp = {5, -3, 8, -1, 0, -7};
        // TODO: your loop here

        for (int i = 0; i < temp.length; i ++){
            if (temp[i] <= 0){
            temp[i] = 0;
            }
            System.out.println("temperture: " + temp[i]);

        }

        // Challenge: Curve the Scores
        int[] scores = {85, 62, 97, 45, 70, 99};
        // Add 5 to every score, but no score can go above 100.
        for (int i = 0; i < scores.length; i ++){
            if(scores[i] >= 95){
                scores[i] = 100;
            }
            else{
                scores[i] += 5;
            }
            System.out.println("scores: " + scores[i]);
        }
        
        
        
        // Challenge: Find the Highest
        int[] temps = {58, 71, 64, 80, 77, 69};
        // Use a loop to find the highest temperature and the index it's at, then print both. Use Math.max()!
        
        int highest = temps[0];
        int highestIndex = 0;

        for(int i = 1; i < temps.length; i++){
            highest = Math.max(highest,temps[i]);
            if(highest == temps[i]){
                highestIndex = i;
            }
        }
        System.out.println(" Highest temp: " + highest + " Index: " + highestIndex);
        

        // Challenge: Random Fill
        int[] nums = new int[10];
        // Loop 10 times. Each time, use Math.random() to get a random number from 1 to 100 and a random index from 0 to 9, then put the number at that index. Print the array. 
        // Then answer: why are some spots still 0?

    }


}
