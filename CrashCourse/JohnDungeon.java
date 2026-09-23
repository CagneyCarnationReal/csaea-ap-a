//package CrashCourse;

public class JohnDungeon {
    
String characterName;
int health;
int age;
int stamina;
int dexterity;
int charisma;
int strength;
int magicPower;
int gold;

public JohnDungeon(String characterName , int health , int gold){

    this.characterName = characterName;
    this.health = health;
    this. gold = gold;

    age = 28;
    stamina = 50;
    dexterity = 1;
    charisma = 1;
    strength = 1;
    magicPower = 1;

}

public void rest(){
    if (stamina > 90){
        stamina = 100;
    }
    else{
        stamina = stamina + 10;
    }
    System.out.println("you sucsessfully rested");
}

public void shop(){
    if (gold > 10){
        gold = gold;
        System.out.println("your too broke");
    }
    else{
        gold = gold - 10;
        System.out.println("you purchased a sword");
    }
}

public void study(){
    magicPower = magicPower + 1;
}

public void train(){
    strength = strength + 1;
}

public void stretch(){
    dexterity = dexterity + 1;
}

}
