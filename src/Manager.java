public class Manager implements Employee {

    private Company company;
    private int salary = (int) ((Math.random() * 40000) + 50000);
    private int earnedMoney = (int) (Math.random() * 250_000);


    public Manager(Company company) {
        this.company = company;
        company.setIncomeCompany(earnedMoney);
    }

    @Override
    public int getMonthSalary() {
        return (int) (salary + (earnedMoney * 0.05));
    }
}
