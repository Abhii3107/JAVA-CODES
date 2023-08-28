import java.util.*;
public class typepromotionlargevalue{
    public static  void main(String args[]){
        int a=23;
        float b=23.7f;
        double c = 40.5;
        double sum = a*b*c; //a*b*c automatically converted into double (because in a,b,c - c have largest value and it data type is double)
        System.out.println(sum);
    }
}