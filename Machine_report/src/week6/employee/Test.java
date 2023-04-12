package week6.employee;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int salaryGrow,salarySum;
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入员工编号：");
        String number=sc.next();

        System.out.print("请输入员工姓名：");
        String name=sc.next();

        System.out.print("请输入基本薪资：");
        int salary=sc.nextInt();
        employee e=new employee(name,number,salary);
        e.getSalaryGrow();
        e.getSalarySum();
        e.printsalary();
    }
}
