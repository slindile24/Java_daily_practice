package OOP.question2;

public class DiscountedProduct extends Product {
    private double discountPercentage;

    public DiscountedProduct(String name ,double discountPercentage,double price){
        super(name,price);
        this.discountPercentage = discountPercentage;

    }

    public double applyDiscount() {
        double discountedPrice = super.getPrice() - (super.getPrice() * discountPercentage);
        super.setPrice(discountedPrice);
        return discountedPrice;
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }





}
