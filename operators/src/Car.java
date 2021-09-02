public class Car
{
    int maxSpeed=100;
    int minSpeed=0;
    double weight=4500;
    boolean isCarOn=false;
    char condition='A';
    int numberOfPeopleInCar=1;
    double maxFuel=50;
    double currentFuel=20;
    double mpg=10;
    //Constructor with dynamic values
    public Car(int customMaxSpeed, double customWeight, boolean customCarOn)
    {
        maxSpeed=customMaxSpeed;
        weight=customWeight;
        isCarOn=customCarOn;
    }
    //Method or function to build cars
    public void buildCar()
    {
        System.out.println("This is the maximum speed that the car can go: " + maxSpeed);
        System.out.println("This is the minimum speed that the car can go: " + minSpeed);
        System.out.println("This is the weight of the car: " + weight);
        System.out.println("This states if the car is On or Off: status=" + isCarOn + ", means car is Off");
        System.out.println("This states the condition of the car: " +condition);
        System.out.println("Number of people in the car:"+numberOfPeopleInCar);
    }
    //Reference data types
    public void updateSpeed()
    {
        minSpeed=maxSpeed;
        maxSpeed=maxSpeed+1;
        condition='C';
        isCarOn=true;
        weight=10000;
    }
    public void getIn()
    {
        numberOfPeopleInCar++;
    }
    public void getOut()
    {
        numberOfPeopleInCar--;
    }
    public double howManyMileTillOutOfGas()
    {
        return currentFuel*mpg;
    }

    public double maxMilesPerFillUp()
    {
        return maxFuel * mpg;
    }
    //main method
    public static void main(String[] args)
    {
        System.out.println("\nBirthday Present V1");
        Car birthdayPresent = new Car(500, 2000.65, false);
        birthdayPresent.buildCar();
        birthdayPresent.getIn();
        birthdayPresent.getIn();
        birthdayPresent.getIn();
        System.out.println("How many miles left out of gas"+birthdayPresent.howManyMileTillOutOfGas());
        System.out.println("Maximum miles for full fuel"+birthdayPresent.maxMilesPerFillUp());
//        System.out.println("\nHow many miles left out of gas");
//        birthdayPresent.howManyMileTillOutOfGas();
//        System.out.println("\nMaximum miles for fill up");
//        birthdayPresent.maxMilesPerFillUp();

        System.out.println("\nBirthday Present V2");
        birthdayPresent.buildCar();
        birthdayPresent.getOut();

        System.out.println("\nBirthday Present V3");
        birthdayPresent.buildCar();

//        System.out.println("Christmas Present");
//        Car christmasPresent = new Car(100, 10000.65, true);
//        christmasPresent.buildCar();
    }
}

