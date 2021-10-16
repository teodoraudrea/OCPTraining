package Chapter1;

// import java.util.Random; //import tells us where to find Random 
import java.util.*; //imports all the classes (only the classes) from the java.util package 
public class ImportExample {
    public static void main(String[] args){
        Random r = new Random(); //does not compile
        System.out.println(r.nextInt(10));
    }
    
}
