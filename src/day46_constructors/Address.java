package day46_constructors;

public class Address {

    String street, city, state, zipcode,country;// for all Address objects we have US value

    public Address(String street,String city, String state, String zipcode){

        this.street = street; // lets us to use same variable name 'this' - is instance variables
        street = street;
        this.city = city;
        city = city;
        this.state = state;
        state = state;
        this.zipcode = zipcode;
        zipcode = zipcode;
        country = "US";

    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Address address = new Address("22 Main", "Chicago", "IL", "60654");
        System.out.println(address);
        System.out.println(address.state);
        System.out.println(address.country);
    }
}
