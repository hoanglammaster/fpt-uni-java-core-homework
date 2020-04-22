package util.model;
import util.conflig.*;
/**
 * Code By Huang Lam
 * No Gain No Pain
 * Date Apr 22, 2020
 */
public class FullTime extends Employee{
    private int timeWork;
    private int bossOrStaff;

    public FullTime(){}
    
    public FullTime(String name, int timeWork, int bossOrStaff) {
        super(name);
        this.timeWork = timeWork;
        this.bossOrStaff = bossOrStaff;
    }
    public void typeEmployee(){
            System.out.println("Full Time Employee");
            System.out.println("Overtime: "+ timeWork + " days");
    }
    public void bossOrStaff(){
        if(bossOrStaff == Conflig.IS_BOSS){
            System.out.println("Position:\tBoss");
        }else{
            System.out.println("Position:\tStaff");
        }
    }
    void countSalary(){
        if(bossOrStaff == Conflig.IS_BOSS){
            salary = Conflig.BOSS + (timeWork * Conflig.SALARY_FULL);
        }else{
            salary = Conflig.STAFF + (timeWork * Conflig.SALARY_FULL);
        }
    }
}
