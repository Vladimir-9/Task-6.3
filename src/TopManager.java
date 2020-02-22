import java.util.List;

public class TopManager implements Employee {

    private Company company;
    private final static int INCOME_BONUS = 10_000_000;
    private int salary = (int) ((Math.random() * 40000) + 80000);

    TopManager(Company company) {
        this.company = company;
    }

    @Override
    public int getMonthSalary() {
        if (company.getIncomeCompany() > INCOME_BONUS)
            return (int) (salary + (salary * 1.5));
        else {
            return salary;
        }
    }


}
