public class Operator implements Employee {

    private int salary = (int) ((Math.random() * 40000) + 30000);
    private Company company;

    public Operator(Company company) {
        this.company = company;
    }

    @Override
    public int getMonthSalary() {
        return salary;
    }
}
