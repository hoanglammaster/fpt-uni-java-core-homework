package util.model;

import util.conflig.Conflig;


/**
 * Code By Huang Lam
 * No Gain No Pain
 * Date Apr 22, 2020
 */
public class Employee implements Conflig{
    protected String name;
    protected long salary;
  
    public Employee(){}
    
    public Employee(String name){
        this.name = name;
    }
    
    void bossOrStaff(){}
    void typeEmployee(){}
    void countSalary(){}
    
    public void displaySalary(){
        System.out.println("====================");
        System.out.println("Name: "+name);
        typeEmployee();
        bossOrStaff();
        countSalary();
        System.out.println("Total Salary: "+ salary +" VND");
    }
}
