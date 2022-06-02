package Practice;
import java.lang.reflect.Array;
import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<String>();
        ArrayList<Point> pointList = new ArrayList<Point>();

        String str1 = "First";
        String str2 = "Second";
        String str3 = "Third";

        stringList.add(str1);
        stringList.add(str2);
        stringList.add(str3);

        System.out.println("Printing String Array List : ");
        for(String temp : stringList){
            System.out.println(temp);
        }

        stringList.remove(1); //Removing 2nd element

        System.out.println("Printing String Array List after deletion: ");
        for(String temp : stringList){
            System.out.println(temp);
        }

        System.out.println("If contains First : " + stringList.contains("First"));


        Point p1 = new Point(12,18.9);
        Point p2 = new Point(34,45.9);
        Point p3 = new Point(26,78.9);

        pointList.add(p1);
        pointList.add(p2);
        pointList.add(p3);

        System.out.println("Point Array List : ");
        for(Point temp : pointList){
            System.out.println(temp.x + " " + temp.y);
        }

        pointList.remove(2);

        System.out.println("Point Array List after deletion : ");
        for(Point temp : pointList){
            System.out.println(temp.x + " " + temp.y);
        }

        System.out.println("If contains p3 : " + pointList.contains(p3));

    }
}
