/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainClass;
import util.model.*;
import java.util.Scanner;
import util.conflig.Conflig;
/**
 *
 * @author hoang
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int typeEmployee;
        int numberOfEmployee;
        String name;
        long salary;
        int timeWork, bossOrStaff;
        Scanner input = new Scanner(System.in);
        System.out.println("How many member in your Company?");
        numberOfEmployee = Integer.parseInt(input.nextLine());
        Employee[] listEmployee = new Employee[numberOfEmployee];
        for(int i = 0; i <numberOfEmployee; i++){
            System.out.println("Enter name of employee "+ (i+1) + " :");
            name = input.nextLine();
            System.out.println("Type of Employee:");
            System.out.println("1.  Full Time\n2.   Part Time");
            typeEmployee = Integer.parseInt(input.nextLine());
            if(typeEmployee == Conflig.FULL_TIME){
                System.out.println(name +" is Boss or Staff?\n1.    Boss\n2.    Staff");
                bossOrStaff = Integer.parseInt(input.nextLine());
                System.out.println("Overtime (days):");
                timeWork = Integer.parseInt(input.nextLine());
                listEmployee[i] = new FullTime(name,timeWork, bossOrStaff);
            }else{
                System.out.println("Total time works:");
                timeWork = Integer.parseInt(input.nextLine());
                listEmployee[i] = new PartTime(name, timeWork);
            }
        }
        for(Employee member : listEmployee){
            member.displaySalary();
        }
    }
    
}
