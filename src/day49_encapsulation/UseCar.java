package day49_encapsulation;

public class UseCar {

    public static void main(String[] args) {
        Car car = new Car("Olha", "4524LC", 24);

        System.out.println(car.driver);
        System.out.println(car.driver.name);
        System.out.println(car.driver.age);
        System.out.println(car.driver.license);

        Car car2 = new Car("Adam", "23458LK", 35);

    }
}
