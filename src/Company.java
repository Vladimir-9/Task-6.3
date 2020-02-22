import java.util.ArrayList;

public class Company {
    private String name;
    private int incomeCompany;
    private ArrayList<Employee> salary = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public void getTopSalaryStaff(int count) {
        if (count <= salary.size()) {
            salary.sort(new CompanyComparator());
            for (; count > 0; count--) {
                System.out.println("Компания: " + name + " - Зарплата сотрудника - " + salary.get(count - 1).getMonthSalary() + " руб.");
            }
        } else {
            System.out.println("Такого количества сотрудников нет");
        }
        System.out.println();
    }

    public void getLowestSalaryStaff(int count) {
        if (count <= salary.size()) {
            salary.sort(new CompanyComparator().reversed());
            for (; count > 0; count--) {
                System.out.println("Компания: " + name + " - Зарплата сотрудника - " + salary.get(count - 1).getMonthSalary() + " руб.");
            }
        } else {
            System.out.println("Такого количества сотрудников нет");
        }
        System.out.println();
    }

    public void hireAll(Company company, int manager, int operator, int topManager) {
        for (int i = 0; i < manager; i++) {
            salary.add(new Manager(company));
        }
        for (int i = 0; i < operator; i++) {
            salary.add(new Operator(company));
        }
        for (int i = 0; i < topManager; i++) {
            salary.add(new TopManager(company));
        }
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
