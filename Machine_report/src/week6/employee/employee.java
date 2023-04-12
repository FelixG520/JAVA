package week6.employee;

public class employee {
    private String name;
    private String number;
    private double salary;
    private double salaryGrow,salarySum;

    public employee() {
    }

    public employee(String name, String number, double salary) {
        this.name = name;
        this.number = number;
        this.salary = salary;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void getSalaryGrow() {
        salaryGrow = salary*0.15; //薪水增长额
    }

    public void getSalarySum() {
        salarySum = salary+salaryGrow;
    }
    public void printsalary(){
        System.out.println("编号："+number+"  姓名："+name+"  基本薪水："+salary+"  薪水增长额："+salaryGrow+"  工资总额："+salarySum);
    }
}
