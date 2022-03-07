package Practice;
import java.util.*;
public class Main {
    public static int divide(){
        int x,y;
//        return x/y;
        try{
            x = getInt();
            y = getInt();
            return x/y;
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("hello darkness my old friend");
        }
        catch (ArithmeticException e){
            throw new ArithmeticException("tf are you doing?");
        }
    }
    public static int getInt(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
//        try {
//            return sc.nextInt();
//        }catch (InputMismatchException e){
//            System.out.println(e);
//            return 0;
//        }
    }
    public static void main(String[] args) {
        System.out.println(divide());
    }

}