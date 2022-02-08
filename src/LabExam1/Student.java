package LabExam1;

public class Student {
    private int roll;
    private String name;

    Student(String name,int roll) {
        this.roll = roll;
        this.name = name;
    }
    Student(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "Roll : " + roll + "\n" +
                "Name : " + name;
    }


    //Static Methods

    //A
    public static void changeMethod(Student obj){
        obj.setRoll(obj.getRoll() + 1);
        obj.setName(obj.getName() + " Grisha");
    }

    //B
    public static Student returnObject(){
        Student student2 = new Student("Mikasa Ackerman",776);
        return student2;
    }

    public static void main(String[] args){
        Student student1 = new Student("Eren Yeager",777);
        System.out.println("Before\n" + student1);
        Student.changeMethod(student1);
        System.out.println("After\n" + student1 + "\n\n");

        Student student2 = Student.returnObject();
        System.out.println("Before\n" + student2);
        student2.setName("Mikasa Yeager Ackerman");
        student2.setRoll(678);
        System.out.println("After\n" + student2);

    }
}
