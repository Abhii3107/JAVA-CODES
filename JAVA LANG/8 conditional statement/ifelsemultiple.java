public class ifelsemultiple{
    public static void main(String args[]){
        int age = 16;
        if(age >= 18){
            System.out.println("adult: drive,vote ");// not true jump to other individual if
        }
        if(age >13 && age<18){
        System.out.println("Bcha");// it is true so execute and not look any further statement
    }
    else{
        System.out.println("not adult");
    }
    }
}