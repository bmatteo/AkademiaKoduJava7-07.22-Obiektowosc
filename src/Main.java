import vechicles.Car;
import vechicles.Hatchback;
import vechicles.Truck;

public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck();
        truck.jedz();
        truck.capacity = 5;

        Car[] cars = new Car[10];
        cars[0] = truck;

        /////////////////////////////////////////

        Car c = cars[0];
        if(c instanceof Truck) {
            ((Truck) c).asd();
        }

        Hatchback hatchback = new Hatchback();

        hatchback.stop();
    }
}
