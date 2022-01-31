package BurgerShop;

public class Hamburger {
    private String breadType;
    private String meatType;
    private boolean lettuce;
    private boolean tomato;
    private boolean carrot;
    private boolean pickle;

    private final double basePrice = 3.99;
    private final double lettucePrice = .50;
    private final double tomatoPrice = .40;
    private final double carrotPrice = .40;
    private final double picklePrice = 1.0;


    Hamburger(String breadType, String meatType) {
        this.breadType = breadType;
        this.meatType = meatType;
    }
    public double calculatePrice(){
        return (basePrice + (pickle?picklePrice:0) + (tomato?tomatoPrice:0) +
                (carrot?carrotPrice:0) + (lettuce?lettucePrice:0));

    }
    @Override
    public String toString(){
        return "A hamburger with " + breadType + " bread and " +
                meatType + " patty with " + (pickle?"pickle, ":"") +
                (carrot?"carrot, ":"") + (tomato?"tomato, ":"") + (lettuce?"lettuce.":".");
    }


    public double getBasePrice() {
        return basePrice;
    }
    public double getLettucePrice() {
        return lettucePrice;
    }
    public double getTomatoPrice() {
        return tomatoPrice;
    }
    public double getCarrotPrice() {
        return carrotPrice;
    }
    public double getPicklePrice() {
        return picklePrice;
    }
    public boolean isLettuce() {
        return lettuce;
    }
    public boolean isTomato() {
        return tomato;
    }
    public boolean isCarrot() {
        return carrot;
    }
    public boolean isPickle() {
        return pickle;
    }

    public void setLettuce(boolean lettuce) {
        this.lettuce = lettuce;
    }
    public void setTomato(boolean tomato) {
        this.tomato = tomato;
    }
    public void setCarrot(boolean carrot) {
        this.carrot = carrot;
    }
    public void setPickle(boolean pickle) {
        this.pickle = pickle;
    }
    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }
    public void setMeatType(String meatType) {
        this.meatType = meatType;
    }
    public String getBreadType() {
        return breadType;
    }
    public String getMeatType() {
        return meatType;
    }



}
