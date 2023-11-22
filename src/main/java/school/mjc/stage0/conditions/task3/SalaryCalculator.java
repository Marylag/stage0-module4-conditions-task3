package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary < 0) {
            System.out.println("wrong input!");
        } else if (salary <= 10000) {
            double netSalary = salary - salary * 0.15;
            System.out.println(netSalary);
        } else if (salary <= 20000) {
            double netSalary = salary - salary * 0.18;
            System.out.println(netSalary);
        } else {
            double netSalary = salary - salary * 0.20;
            System.out.println(netSalary);
        }
    }
}
