import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Main {
    public static void test(int... v){
        System.out.println(v.length + "\n>>>");
        System.out.println(v[0]);
        for(int x : v){
            System.out.println(x);
        }
    }
    public static void main(String[] args) {

        test(1,2,3,4,5);
    }
}
