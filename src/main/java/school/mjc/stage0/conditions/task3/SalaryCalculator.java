package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        float tax;
        if (salary > 0 && salary < 10000) {
            tax = (float)(salary - (salary * 0.15));
            System.out.println(tax);
        } else if (salary > 10000 && salary < 20000) {
            tax = (float)(salary - (salary * 0.18));
            System.out.println(tax);
        } else if(salary > 20000){
            tax = (float)(salary - (salary * 0.20));
            System.out.println(tax);
        } else{
            System.out.println("wrong input!");
        }
    }
}
