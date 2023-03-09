public abstract class Bag {
    private double length;
    private double width;
    // subclass can access "price" directly
    protected double price;

    // get/set methods to access private variables
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

      public double getwidth() {
        return width;
    }
    public void setwidth(double width) {
        this.width = width;

    // abstract method (no body)
    public abstract double getPrice();
}