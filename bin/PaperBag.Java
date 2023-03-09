public class PaperBag extends Bag{
    public double getPrice() {
        // length and width are private to Bag class
        // need get methods to obtain them
        double area = getLength() * getwidth();
        if (area > 3000.0) {price = 0.2;}
        else {price = 0.15;}
        return price;
    }
}