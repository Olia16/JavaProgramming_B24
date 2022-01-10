package office_hours.practice_11_10_2021;

public class IPhone extends Phone implements AppleApp{

    public IPhone(String model, double price, int size){
        super("IPhone",model,price,size);

    }

    @Override
    public void facetime() {
        System.out.println("Iphone using facetime");
    }

    @Override
    public boolean download() {
        System.out.println("Downloading from: " + APP_STORE_NAME);
        return false;
    }

    @Override
    public void calling() {

    }

    @Override
    public void texting() {

    }
}
