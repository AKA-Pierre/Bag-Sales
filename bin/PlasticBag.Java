public class PlasticBag extends Bag {
    // instance variable specific to Plastic Bag
    private double tax;
    public void setTax(double tax) {
        this.tax = tax;
    }
    public getTax() {
        return tax;
    }
    public double getPrice() {
        double area = getLength() * getwidth();
        if (area > 250) {price = 0.3;}
        else {price = 0.2;}
        return price + tax;
    }
}