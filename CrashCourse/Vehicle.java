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

        if(speed <= 25){

        

        }
        else if(speed <= 45){



        }
        else if(speed <= 65){



        }
        else if(speed <= 85){



        }

    }

}
