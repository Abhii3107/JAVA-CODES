import java.util.*;

public class taxcalculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax ;// here it assign zero value in tax

        if(income >= 500000){
            tax = (int)(income * 0);
        }
        else if(income>500000 && income<100000){
            tax = (int)(income * 0.2);
        }
        else{
            tax=(int) (income * 0.3);
        }
        system.out.println("your tax is :" + tax);
    }
}
