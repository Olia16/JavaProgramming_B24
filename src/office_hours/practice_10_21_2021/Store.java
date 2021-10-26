package office_hours.practice_10_21_2021;

public class Store {
    public static void main(String[] args) {

        WaterBottle bottle = new WaterBottle("AquaFina", 16);
        System.out.println(bottle.getBrand());
        System.out.println(bottle.getOunces());

        bottle.setOunces(-20);
        System.out.println(bottle.getOunces());

        bottle.setBrand(null);
        System.out.println(bottle.getBrand());

        bottle.setBrand("Aqua");
        System.out.println(bottle.getBrand());
    }


}
