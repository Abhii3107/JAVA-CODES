import java.util.*;
public class Typepromotion{
    public static  void main(String args[]){

        char a='a';
        char b='b';
        System.out.println(b-a); // b-a automatically converted into int because there is expression inncluded_ Typepromotion

        System.out.println((int)(b));
        System.out.println((int)(a));
        System.out.println(a); //here it is simply will print a (not promoted into int because there is na any expression)

        // char c = a - b; //not possible because a-b conveted into int and by compatibility rule int cannot be converted into char ( so it is not possible) 

        /*char d = 'd'

        byte = a+b+d; not possible int cannot be convereted into byte by dest > source rule 
        but we can convert expilicity by our self

        byte bt = (byte)(a+b+c);
        System.out.println(bt); // compiler will print by itself something-127
        */


    }
}


