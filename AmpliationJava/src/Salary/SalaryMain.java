package Salary;

public class SalaryMain {
    public static void main(String[] args) {
        double sal = 16000;
        System.out.println(sal);
        for (int i = 0; i<55; i++){
            System.out.println("+"+i+"% :" +sal*(1+((double)i)/100));
        }
    }
}
