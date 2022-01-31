package BurgerShop;

public class DeluxeBurger extends Hamburger{

    private final double chipsPrice = 2.0;
    private final double drinksPrice = 1.50;

    DeluxeBurger(String breadType,String meatType){
        super(breadType,meatType);
    }

    @Override
    public double calculatePrice() {
        return super.calculatePrice() + (chipsPrice + drinksPrice);
    }

    @Override
    public String toString() {
        return "You've ordered a delux burger with " + getBreadType() +
                " and " + getMeatType() + ". It includes chips and drinks";
    }

    @Override
    public void setLettuce(boolean lettuce) {
        System.out.println("Cannot add items to deluxe burger");
    }
    @Override
    public void setTomato(boolean tomato) {
        System.out.println("Cannot add items to deluxe burger");
    }
    @Override
    public void setCarrot(boolean carrot) {
        System.out.println("Cannot add items to deluxe burger");
    }
    @Override
    public void setPickle(boolean pickle) {
        System.out.println("Cannot add items to deluxe burger");
    }

    public double getChipsPrice() {
        return chipsPrice;
    }
    public double getDrinksPrice() {
        return drinksPrice;
    }

}
