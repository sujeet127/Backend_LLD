package main.PrototypeAndRegistry;

public class StudentUtility {
    public static void createCopy(Student student){
        Student stCopy=student.copy();
        //Object instanceOf=student.getClass();
        System.out.println("Instance of:"+stCopy.getClass()+",Name: "+stCopy.getName());
    }
}
