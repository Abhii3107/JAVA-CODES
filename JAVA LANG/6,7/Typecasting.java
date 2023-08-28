import java.util.*;
public class Typecasting{
    public static  void main(String args[]){
        Scanner sc=new Scanner(System.in);
       /*
        float a=12;
        int b=a;
        System.out.println(b);
        It will print error float to int lossy for java
        now we convert by expilicity
        by adding (int) */

        float a=12.99999f; // putting f is necessary otherwise it wil take as a double value
        int b = (int) a ;
        System.out.println(b);
    }
}