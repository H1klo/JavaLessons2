package lab4;

public class CarDemo {
    public static void main(String[] args) {
        Car car = new Car("Camry","Toyota", "2023","blue",52,9000);
        System.out.println(car.toString());

        car.sell(3);

        System.out.println(car.getBrand());
        System.out.println(car.getColor());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
        System.out.println(car.getPrice());
        System.out.println(car.getQuantity());

        car.setYear("2001");

        System.out.println(car.toString());
    }
}
