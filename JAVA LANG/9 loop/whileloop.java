public class whileloop {
    public static void main (String args[]){
    int counter = 0;
    while(counter < 100){
        System.out.println("HELLO WORLD");
        counter ++ ; // if we donot add this (intilaly statements counter assign 0 value and 0 is always less than 100 a/c to condition so this code go into infinite lopp and hello world print infinite times)
        // couter- 0,1,2,3...
    }
    System.out.println("HELLO WORLD printed 100 times"); 
}

} 
/*step 1- it assign 0 value in counter
 * step 2- check condition
 * step 3_ print
 * step 4 - couter intialise
 * again follow these steps upto condition fail
 */