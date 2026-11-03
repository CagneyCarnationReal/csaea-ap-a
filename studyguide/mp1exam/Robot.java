package studyguide.mp1exam;
//class: blueprint / templete that creates objects
//classheader
public class Robot {
    
    //attributes / data /private instance varibles
    private String name;
    private String serial;
    private double battery;
    private boolean isOn;

    //constructor
    //speical method/starting point for new objects
    // no return type, same name as class
    public Robot(String n, String s , double b){ //perameters
        //this: instance variable vs parameters
        this.name = n;
        this.serial = s;
        this.battery = b;
       
        //default state
        this.isOn = false;
    }
    
    // Getter / accessor: return type matches variable
    public String getName(){
        return name;
    }

    public double getBattery(){
        return battery;
    }

    public boolean isOn(){
        return isOn;
    }
    
    //setter / mutators: void, change data
    public void setName(String newName){
        name = newName;
    }

    public void setBattery(double charge){
        battery = charge;
    }

    
    public String toString(){
        return name + " [" + serial + "]";
    }

    public boolean serialContains(String part){
        return serial.indexOf(part) != -1;
    }

}
