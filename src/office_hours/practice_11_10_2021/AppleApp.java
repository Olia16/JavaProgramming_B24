package office_hours.practice_11_10_2021;

public interface AppleApp extends Downloadable{

    //by default variables are always static and final
    String APP_STORE_NAME = "Apple Store";
    void facetime();

    //Create an interface named AppleApps that can inherit from downloadable
    //Interface variable: AppStoreName
    //abstract method(): facetime();

}
