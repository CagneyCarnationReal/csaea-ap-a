//package CrashCourse;

public class Dog {
    
    String name;
    String ownerName;
    String breed;
    int age;
    double weight;
    boolean isHungry;
    boolean isHome;
    int energylevel;

    public Dog(String name, String ownerName , String breed){

        this.name = name;
        this.ownerName = ownerName;
        this.breed = breed;

        age = 4;
        isHungry = true;
        energylevel = 65;
        weight = 23.5;

    }

    public void eat(){
        if (isHungry = true){
            isHungry = false;
            weight = weight + 5;
        }
    }
   
    public void runAway(){
        isHome = false;
        energylevel = energylevel - 10;
    }
    
    public void comeHome(){
        isHome = true;
    }
    
    public void sleep(){
        energylevel = 100;
    }

    public void haveBirthday(){
        age = age + 1;
    }


}
