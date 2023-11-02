public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Figure[] array = new Figure[5];
        array[0] = new Triangle(3, 5, 7);
        array[1] = new Rectangle(3, 5);
        array[2] = new Circle(3);
        array[3] = new Rectangle(4, 6);
        array[4] = new Circle(4);

        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i].calculateSquare();
        }
        System.out.println(sum);

        Rectangle rectangle2 = new Rectangle(2, 4);
        Rectangle.clone(rectangle2);
    }
}