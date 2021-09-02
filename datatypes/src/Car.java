public class Car
{
    int maxSpeed=100;
    int minSpeed=0;
    double weight=4500;
    boolean isCarOn=false;
    char condition='A';
    public void buildCar()
    {
        System.out.println("This is the maximum speed that the car can go: " + maxSpeed);
        System.out.println("This is the minimum speed that the car can go: " + minSpeed);
        System.out.println("This is the weight of the car: " + weight);
        System.out.println("This states if the car is On or Off: status=" + isCarOn + ", means car is Off");
        System.out.println("This states the condition of the car: " +condition);
    }
    public void updateSpeed()
    {
        minSpeed=maxSpeed;
        maxSpeed=maxSpeed+1;
        condition='C';
        isCarOn=true;
        weight=10000;
    }
    public static void main(String[] args)
    {
        Car familyCar = new Car();
        familyCar.buildCar();
        Car vjCar = familyCar;
        familyCar.updateSpeed();
        vjCar.buildCar();
    }
}

