package CrashCourse;

public class Vehicle {
    
    private String vehicleName;
    private String manufacturer;
    private int wheelNum;
    private String vehicleColor;
    private int passengers;
    private int modelYear;
    private boolean hasEngine;
    private double gasoline;
    private double batteryCharge;

    public Vehicle(String vehicleName , int passengers , boolean hasEngine){

        this.vehicleName = vehicleName;
        this.passengers = passengers;
        this.hasEngine = hasEngine;

        manufacturer = "Cheverolet";
        wheelNum = 4;
        vehicleColor = "Canary Yellow";
        modelYear = 1986;
        gasoline  = 35.5; // 35.5 gallon tank
        batteryCharge = 87.6; // out of 100%

    }

    public void geton(){

        passengers += 1;

    }

    public void getoff(){

        passengers -= 1;

    }

    public void travel(int speed){

        if (gasoline > 0.1){
        
            if(speed <= 25){

                gasoline -= .4;
                System.out.print("You went one mile, you now have " + gasoline);
        
            }
        
            else if(speed <= 45){

                gasoline -= .3;
                System.out.print("You went one mile, you now have " + gasoline);

            }
        
            else if(speed <= 65){

                gasoline -= .2;
                System.out.print("You went one mile, you now have " + gasoline);
        
            }
        
            else if(speed <= 85){

                gasoline -= .1;
                System.out.print("You went one mile, you now have " + gasoline);

            }

        }
        else{
            System.out.println("you're to low on gas");
        }
    }

    public void breakdown(){

        hasEngine = false;

    }

    public void repairEngine(){
    
        if(hasEngine = false){
            hasEngine = true;
        }
        else{
            System.out.println("you have a working engine");
        }

    }

    public void fillgas(){
    
        gasoline = 35.5;

    }




}
