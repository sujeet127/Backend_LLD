package main.PrototypeAndRegistry;

public class Client {
    public static void main(String[] args) {
            Student st= new Student("Sujeet",1,90.5,2021);
            IntelligentStudent is=new IntelligentStudent("Rahul",2,80.8,2022,75);


            //now create copy of both the objects
            Student stCopy=new Student(st);
            IntelligentStudent isCopy=new IntelligentStudent(is);

            Student st1=st.copy();
             System.out.println(st1.getName());
             st1=is.copy();
            System.out.println(st1.getName());

            StudentUtility.createCopy(st);
            StudentUtility.createCopy(is);


            //use of studentRegistory
         StudentRegistry studentRegistry=new StudentRegistry();
         Student newStudent=studentRegistry.get(StudentType.DATASCIENCE).copy();
        System.out.println(newStudent.getName());

    }
}
