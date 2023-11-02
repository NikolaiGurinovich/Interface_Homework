public class Triangle extends Figure {
    private double lenghtOne;
    private double lenghtTwo;
    private double lenghtThree;

    public Triangle(double lenghtOne, double lenghtTwo, double lenghtThree) {
        this.lenghtOne = lenghtOne;
        this.lenghtTwo = lenghtTwo;
        this.lenghtThree = lenghtThree;
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

    public double getLenghtThree() {
        return lenghtThree;
    }

    public void setLenghtThree(double lenghtThree) {
        this.lenghtThree = lenghtThree;
    }

    @Override
    double calculateSquare() {
        double halfPerimetr = (lenghtOne + lenghtTwo + lenghtThree) / 2;
        return Math.sqrt(halfPerimetr * (halfPerimetr - lenghtOne) *
                (halfPerimetr - lenghtTwo) * (halfPerimetr - lenghtThree));
    }

    @Override
    double calculatePerimeter() {
        return lenghtOne + lenghtTwo + lenghtThree;
    }
}
