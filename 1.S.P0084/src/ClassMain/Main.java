package ClassMain;

/**
 * Code By HoangLam
 * No Gain No Pain
 * Date Apr 22, 2020
 *
 *REQUEST:Program Specifications
Write an application to multiply two digit number inputted from keyboard then display result to screen.
Note: size of inputted number is unlimited

Guidelines
Try to use array to store the result and two digit number.
* This is simple program, but you need create more function and try to use ArrayList and Array Object to practice more;

 */
import java.util.Scanner;
import java.util.ArrayList;

class Number{
    int x;
    int y;
    int mul ;
    public Number(){}
    public Number(int x, int y){
        this.x = x;
        this.y = y;
    }
    void mutiply(){
        mul = x * y;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        ArrayList<Integer> result = new ArrayList<Integer>();
        Number[] numbers = new Number[100];
        int check ;
        int i = 0;
        do{
            System.out.println("Enter First Number:");
            int x = Integer.parseInt(Input.nextLine());
            System.out.println("Enter Second Number:");
            int y = Integer.parseInt(Input.nextLine());
            numbers[i] = new Number(x,y);
            numbers[i].mutiply();
            result.add(Integer.valueOf(numbers[i].mul));
            System.out.println("Do you want more calculate?\n 1.    YES \n 2.   NO");
            check = Integer.parseInt(Input.nextLine());
            i++;
        }while(check != 2);
        System.out.println("Do you want display result?");
        System.out.println("1.  Display\n2.  Exit");
        check = Integer.parseInt(Input.nextLine());
        System.out.println(check);
        if(check == 1){
            for(int j = 0; j < i; j++){
                System.out.println(numbers[j].x +" * "+numbers[j].y + " = "+ result.get(j));
            }
        }
    }
}
