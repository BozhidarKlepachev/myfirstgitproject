package homeWork7.employee;

public class Exercises {

    public static void main (String[] args) {
        Employee employee = new Employee(1,"Bozhidar","Klepachev", 30);
        String name = employee.getName();
        double annualSalary = employee.getAnnualSalary();
        System.out.println(employee);

        double raisedSalary = employee.raiseSalary(-10);
        annualSalary = employee.getAnnualSalary();
        System.out.println(employee);

    }
}
