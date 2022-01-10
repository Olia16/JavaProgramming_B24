package office_hours.practice_11_17_2021;

import java.util.ArrayList;

public class Store {
    public static void main(String[] args) {
        TShirt shirt1 = new TShirt();
        shirt1.wear();
        Clothes shirt2 = new TShirt();
        shirt2.wear();
        Object shirt3 = new TShirt();
      //  shirt3.wear(); -> invalid because Object class does not have wear method

        Jacket jacket1 = new Jacket();
        jacket1.wear();
        jacket1.putOnHood();
        Clothes jacket2 = new Jacket();
        jacket2.wear();
        ((Jacket)jacket2).putOnHood();

        Jacket jacket2_5 = (Jacket)jacket2;
        jacket2_5.putOnHood();

        HasHood jackets3 = new Jacket();
        ((Jacket)jackets3).wear();
        jackets3.putOnHood();

        buy(jacket1);
        buy(jacket2);
        buy((Jacket)jackets3);

        ArrayList<Clothes>clothes = new ArrayList<>();
        clothes.add(shirt1);
        clothes.add(shirt2);
        clothes.add((Clothes) shirt3);
        clothes.add(jacket1);
        clothes.add(jacket2);

        for(Clothes each : clothes){
            each.wear();
        }
    }
    public static void buy(Clothes item){

    }
}
