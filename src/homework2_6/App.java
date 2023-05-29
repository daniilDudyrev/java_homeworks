package homework2_6;


public class App {
    public static void main(String[] args) {
        Car car1 = new Car("Car1", "Manufacturer1", 2000, 100);
        car1.printCar();
        car1.inputCar("NewCar1", "NewManufacturer1", 2001, 111);
        car1.printCar();
        car1.inputCar("NewNewCar1", "NewNewManufacturer1");
        car1.printCar();
    }
}
