package day49_encapsulation;

public class Traffic {

    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight("blue");

        //cannot access anymore, made it public
      //  System.out.println(trafficLight.color);
       // trafficLight.color = "brown";
       // System.out.println(trafficLight.color);

        System.out.println(trafficLight.getColor());

        System.out.println(trafficLight.getColor());
        trafficLight.setColor("green");
        System.out.println(trafficLight.getColor());
        trafficLight.setColor("brown");
        System.out.println(trafficLight.getColor());
    }
}
