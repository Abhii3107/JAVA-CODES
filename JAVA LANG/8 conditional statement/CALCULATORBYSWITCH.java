import java.util.*;
public class CALCULATORBYSWITCH{
    public static void main(String args[]){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("enter  a :");
    int a = sc.nextInt();

    System.out.println("enter b :");
    int b = sc.nextInt();


    System.out.println("operator");
    char operator = sc.next().charAt(0); //sc.next is only for string after adding charAt(0) it will take operators

    switch(operator){
        case '+' : System.out.println(a+b);
        break ;
        case '-' : System.out.println(a-b);
        break ;
        case '*' : System.out.println(a*b);
        break ;
        case '/' : System.out.println(a/b);
        break;
        case '%' : System.out.println(a % b);
    default : System.out.println("not calculated");
    }
}
}