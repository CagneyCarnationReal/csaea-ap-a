package VehicleClass;
public class VehicleTester {
    
    public static void main(String[] args){

        Vehicle Camero = new Vehicle("IROC-Z" , 4 , true);
        Vehicle Truck = new Vehicle("Silverado", 2, true);
        Vehicle SUV = new Vehicle("Tahoe",5, true);
        Vehicle Train = new Vehicle("Thomas", 100 ,true);
        Vehicle Bike = new Vehicle("Bike", 1, false);

        Camero.geton();
        Camero.getoff();
        Camero.travel(45);
        Camero.fillgas();
        Camero.breakdown();
        Camero.repairEngine();

        Truck.geton();
        Truck.getoff();
        Truck.travel(25);
        Truck.fillgas();
        Truck.breakdown();
        Truck.repairEngine();

        SUV.geton();
        SUV.getoff();
        SUV.travel(60);
        SUV.fillgas();
        SUV.breakdown();
        SUV.repairEngine();

        Train.geton();
        Train.getoff();
        Train.travel(75);
        Train .fillgas();
        Train.breakdown();
        Train.repairEngine();
        
        Bike.geton();
        Bike.getoff();
        Bike.travel(10);
        Bike.fillgas();
        Bike.breakdown();
        Bike.repairEngine();

    }

}
