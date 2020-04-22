package util.model;

import util.conflig.Conflig;

/**
 * Code By Huang Lam
 * No Gain No Pain
 * Date Apr 22, 2020
 */
public class PartTime extends Employee{
    private int timeWork;
    public PartTime(){}
    public PartTime(String name, int timeWork){
        super(name);
        this.timeWork = timeWork;
    }
    public void typeEmployee(){
            System.out.println("Part Time Employee");
            System.out.println("Total time : "+ timeWork + " hours");
    }
    void countSalary(){
        salary = Conflig.SALARY_PART * timeWork;
    }

}
