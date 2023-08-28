import java.util.*;
public class circlearea{
    public static  void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float rad = sc.nextFloat();
        float area= 3.14f *rad *rad; // 3.14f - if f is not used it give error because whenever we just write any decimal value ,java automatically take into DOUBLE 
        System.out.println(area);
    }
}