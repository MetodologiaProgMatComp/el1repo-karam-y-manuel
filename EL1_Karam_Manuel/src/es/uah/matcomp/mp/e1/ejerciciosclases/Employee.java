package es.uah.matcomp.mp.e1.ejerciciosclases;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;


    public Employee (int id, String firstName, String lastName, int salary){
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public int getId() {
        return id;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public String getName(){
        return firstName + " " +  lastName;
    }
    public int getSalary() {
        return salary;
    }

    public void setSalary (int salary){
        this. salary = salary;
    }

    public int getAnnualSalary(){
        return salary*12;
    }

    public int raiseSalary (int percent){
        salary = salary *(100+percent)/100;
        return salary;
    }
    public String toString (){
        return "Employee[id =" + id + ", name = " + firstName + lastName + ", salary = " + salary + "]" ;
    }


}
