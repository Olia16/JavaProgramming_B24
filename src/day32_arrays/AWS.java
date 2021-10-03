package day32_arrays;

public class AWS {
    public static void main(String[] args) {
        String app = "etsy";
        String zones = "us-east-1,us-west-1,us-west-2,us-west-3";


        for (String each : zones.split(",")){
            System.out.println("Deploying " + app + " to " + each);
        }
              // original loop
        // String [] allZones = zones.split(",");
        // for (int i = 0; i< allZones.length; i++){
        // System.out.println("Deploying " + app + " to " + allZones[i]);}
    }
}
