public class Rectangle extends Figure implements Cloneable{
    private double lenghtOne;
    private double lenghtTwo;

    public Rectangle(double lenghtOne, double lenghtTwo) {
        this.lenghtOne = lenghtOne;
        this.lenghtTwo = lenghtTwo;
    }

    public double getLenghtOne() {
        return lenghtOne;
    }

    public void setLenghtOne(double lenghtOne) {
        this.lenghtOne = lenghtOne;
    }

    public double getLenghtTwo() {
        return lenghtTwo;
    }

    public void setLenghtTwo(double lenghtTwo) {
        this.lenghtTwo = lenghtTwo;
    }

    @Override
    double calculateSquare() {
        return lenghtOne * lenghtTwo;
    }

    @Override
    double calculatePerimeter() {
        return (lenghtOne + lenghtTwo) * 2;
    }

    public static Object clone(Rectangle ob) throws CloneNotSupportedException {
        return ob.clone();
    }
}
