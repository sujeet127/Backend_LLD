package main.PrototypeAndRegistry;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    //store template of
    //dataScienceStudent ->template1
    //devopsStudent->template2
    //softwareStudent->template3


    Map<StudentType, Student> students=new HashMap<>();;
    public StudentRegistry() {
        initializeStudentRegistry();
    }

    public void add(StudentType key , Student student){
        students.put(key , student);
    }

    public Student get(StudentType key){
        return students.get(key).copy();
    }

    public  void initializeStudentRegistry() {
        Student dataScienceStudent=new Student("Bipin",45,90.5,2021);
        dataScienceStudent.setCourse(String.valueOf(StudentType.DATASCIENCE));
        dataScienceStudent.setLength(12);
        dataScienceStudent.setAmountPaid(500);

        Student devopsStudent=new Student("Vivek",20,90.5,2020);
        devopsStudent.setCourse(String.valueOf(StudentType.DEVOPS));
        devopsStudent.setLength(6);
        devopsStudent.setAmountPaid(200);

        Student softwareStudent=new Student("Software Student",21,90.5,2021);
        softwareStudent.setCourse(String.valueOf(StudentType.SOFTWARE));
        softwareStudent.setLength(18);
        softwareStudent.setAmountPaid(800);


        students.put(StudentType.DATASCIENCE,dataScienceStudent);
        students.put(StudentType.DEVOPS,devopsStudent);
        students.put(StudentType.SOFTWARE,softwareStudent);
    }

}
