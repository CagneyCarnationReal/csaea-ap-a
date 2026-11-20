import java.util.ArrayList;


public class ArrayLists {

    public static ArrayList<String> createList() {
        ArrayList<String> animals = new ArrayList<>();

        animals.add("donkey");
        animals.add("pangolin");
        animals.add("blobfish");   


        return animals;
    }

    public static void showIndex(ArrayList<String> animals){
        System.out.println("First element: " + animals.get(0));
        System.out.println("Second element: " + animals.get(1));
        System.out.println("Last element: " + animals.get(animals.size() - 1));
    }

    public static int findIndex(ArrayList<String> list, String target){

        for(int i = 0; i < list.size(); i++){

            if(list.get(i).equals(target)){
                return i;
            }

        }
        
        
        return -1;
    }

    public static void modifyAnimals(ArrayList<String> animals){

        animals.set(0, "babirusa");
        animals.add("glass frog");
        animals.add(3, "aye - aye");
        animals.add(1, "camel");
        animals.add("camel");
        
        String removed = animals.remove(0);
        System.out.println("Removed animal: " + removed);
        System.out.println("Modified animal Array list: " + animals);

    }

    
    
    public static void replaceAll(ArrayList<String> animals, String oldVal , String newVal){

        for(int i = 0; i < animals.size(); i++){

            if(animals.get(i).equals(oldVal)){
                animals.set(i, newVal);
            }
        
        }
        System.out.println("New List: " + animals);
    }

    public static void numberUtlilities(){

        int[] values = {3, 7, 1, 9, 4, 2, 5, 8, 6, 0};

        ArrayList<Integer> nums = new ArrayList<Integer>();

        for(int v : values) {
            nums.add(v); //autoboxing
        }

        System.out.println("Orginal Numbers: " + nums);
        System.out.println("length of list: " + nums.size());

        int min = nums.get(0);
        int max = nums.get(0);
        int sum = 0;

        for (int n : nums){
            if (n < min) min = n;
            if (n > max) max = n;
            sum += n; //acumulator
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Sum: " + sum);

        System.out.println("Average: " + (double) sum / nums.size());
    }


    public static void maxIndex(){

        int[] values1 = {8,7,4,2,1,0,9};
    
        int highest = values1[0];
        int highestIndex = 0;

        for(int i = 1; i < values1.length; i++){
            highest = Math.max(highest,values1[i]);
            if(highest == values1[i]){
                highestIndex = i;
            }
            System.out.println("Highest value: " + values1[i]);
            System.out.println("Highest index: " + highestIndex);
        }

    }
}
