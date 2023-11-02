public class Employee implements Workable{
    private String position = "Employee";

    @Override
    public String printPosition() {
        return position;
    }
}
