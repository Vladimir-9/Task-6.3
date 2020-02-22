import java.util.Comparator;

public class CompanyComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee employee, Employee employee1) {
        if (employee.getMonthSalary() > employee1.getMonthSalary()) {
            return 1;
        }
        if (employee.getMonthSalary() < employee1.getMonthSalary()) {
            return -1;
        }
        return 0;
    }
}
