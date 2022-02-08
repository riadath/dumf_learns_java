package LabExam1;

public class Main {
    public static void main(String[] args){
        Memory a = new Memory(1000,10,0);
        Memory c = a;
        Memory b = new Memory(2000,20,0);
        a = null;

        b = new Memory(2000,0,200);
        c = new Memory(3000,0,0);


    }
}
