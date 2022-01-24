package oop;




//This is the blueprint of Car aka CarManufacturer
 public class Car {

    public int engine;

    public float tankSize;

    public float speedLimit;

    public int numberOfDoors;

    private boolean isAirbag;

    public String carBrand;

   private static int carsManufacturedCount;




   public void printCarInfo() {
       System.out.println(engine);
       System.out.println(tankSize);
       System.out.println(speedLimit);
       System.out.println(isAirbag);
       System.out.println(numberOfDoors);
   }



    //Default Constructor
     Car() {
        this(false);
        System.out.println("Hi, I am creating car for you");
        this.engine = 1200;
        this.numberOfDoors = 4;
        this.speedLimit = 120;
        this.tankSize = 14.2f;
        this.carBrand = "Audi";
        carsManufacturedCount++;
    }

    //Parametrized Constructor
    private Car(boolean isAirBag) {
        this.isAirbag = isAirBag;
        System.out.println("Hi, I am creating car for you with AirBag" +  isAirBag);

    }

    Car(int speedLimit, int numberOfDoors) {
        System.out.println("Hi, I am creating car for you with SpeedLimit & NumberOfDoors"
                +  speedLimit + " " +  numberOfDoors);
    }


    public boolean isAirbag() {
         return this.isAirbag;
    }




    private Car giveMeCar()  {

        //Car this = Address of the object
        return  null;
    }

    private void testingCar() {

    }

    public static int getCarsManufacturedCount() {
         return carsManufacturedCount;
    }



 }
