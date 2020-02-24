import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private int incomeCompany;
    private ArrayList<Employee> salary = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public List<Employee> getTopSalaryStaff(int count) {
        if (count <= salary.size()) {
            salary.sort(new CompanyComparator());
            return salary.subList(0, count);
        } else {
            System.out.println("Такого количества сотрудников нет");
            return salary.subList(0,0);
        }

    }

    public List<Employee> getLowestSalaryStaff(int count) {
        if (count <= salary.size()) {
            salary.sort(new CompanyComparator().reversed());
            return salary.subList(0, count);
        } else {
            System.out.println("Такого количества сотрудников нет");
            return salary.subList(0,0);
        }
    }

    public void print(List<Employee> list) {
        for (Employee employee : list) {
            System.out.println("Компания: " + name + " - Зарплата сотрудника - " + employee.getMonthSalary() + " руб.");
        }
    }

    public void hireAll(List<Employee> employee) {
        salary.addAll(employee);
    }

    public void fire(int delete) {
        for (int i = 0; i < delete; i++) {
            salary.remove(i);
        }
    }

    public void hire(Employee employee) {
        salary.add(employee);
    }

    public void setIncomeCompany(double incomeCompany) {
        this.incomeCompany += incomeCompany;
    }

    public int getIncomeCompany() {
        return incomeCompany;
    }

    public ArrayList<Employee> getSalary() {
        return salary;
    }
}
