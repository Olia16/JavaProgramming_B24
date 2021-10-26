package office_hours.practice_10_21_2021;

public class WaterBottle {

    /*
    Create a class called WaterBottle
- instance variables: brand, ounces

- Create a constructor to initialize the two fields

- Encapsulate the variables

- Bonus: pervent negative ounces to be assigned and null or empty space to be assigned to brand
     */

    private String brand;
    private double ounces;

    public WaterBottle(String brand, double ounces){
        setBrand(brand);
        setOunces(ounces);
    }


    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        String s = "";

        if(brand != null && !brand.isEmpty()){
            this.brand = brand;
        }
    }
    public double getOunces(){
        return ounces;
    }
    public void setOunces(double ounces){
        if (ounces > 0){
            this.ounces = ounces;
        }

    }
}
