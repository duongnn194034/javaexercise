import *;
class Employee extends Person {
    private int salary;

    public Employee(String name, MyDate birthday, int salary) {
        super(name, birthday);
        this.salary = salary;
    }

    public int getSalary() {
        return this.salary;
    }

    public toString() {
        return super.toString() + ", " + this.getSalary + "$ salary."; 
    }
}