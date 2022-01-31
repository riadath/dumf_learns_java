package BurgerShop;

public class HealthyBurger extends Hamburger{

    private boolean avocado;
    private boolean ginger;

    private final double avocadoPrice = 2.99;
    private final double gingerPrice = 1.99;


    HealthyBurger(String meatType, boolean avocado, boolean ginger) {
        super("Brown Rye", meatType);
        this.avocado = avocado;
        this.ginger = ginger;
    }

    @Override
    public double calculatePrice() {
        return super.calculatePrice() + (avocado?avocadoPrice:0) + (ginger?gingerPrice:0);
    }

    @Override
    public String toString() {
        String retString = super.toString();
        if(avocado || ginger){
            retString += "You also added " + (avocado?"avocado, ":"") + (ginger?"ginger.":"");
        }
        return retString;
    }

    public boolean isAvocado() {
        return avocado;
    }

    public void setAvocado(boolean avocado) {
        this.avocado = avocado;
    }

    public boolean isGinger() {
        return ginger;
    }

    public void setGinger(boolean ginger) {
        this.ginger = ginger;
    }

    public double getAvocadoPrice() {
        return avocadoPrice;
    }

    public double getGingerPrice() {
        return gingerPrice;
    }


}
