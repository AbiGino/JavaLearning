import java.io.*;
interface InterfaceExample {
    void changeGear(int newGear);
    void speedUp(int increment);
    void applyBrakes(int decrement);
}
class Bicycle implements InterfaceExample {
    int speed;
    int gear;

    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }

    @Override
    public void speedUp(int increment) {

        speed = speed + increment;
    }

    @Override
    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }
    public void printStates() {
        System.out.println("speed: " + speed);
        System.out.println(" gear: " + gear);
    }
}

    class Bike implements InterfaceExample
    {

        int speed;
        int gear;


        @Override
        public void changeGear(int newGear){

            gear = newGear;
        }

        @Override
        public void speedUp(int increment){

            speed = speed + increment;
        }

        @Override
        public void applyBrakes(int decrement){

            speed = speed - decrement;
        }

        public void printStates() {
            System.out.println("speed: " + speed
                    + " gear: " + gear);
        }


    }
    class Main{

    public static void main(String[] args)
    {
        Bicycle b=new Bicycle();
        b.changeGear(2);
        b.speedUp(3);
        b.applyBrakes(1);
        System.out.println("Bicycle present state:");
        b.printStates();

        Bike k=new Bike();
        k.changeGear(1);
        k.speedUp(4);
        k.applyBrakes(3);
        System.out.println("Bike present state:");
        k.printStates();
    }
    abstract class Demo{
        abstract void demoAbstract();

        void  fff() {
            System.out.println("");
        }
    }
}