package main.PrototypeAndRegistry;

public class Student implements Prototype {
    private String name;
    private int id;
    private double grade;
    private int gradYear;
    private String course;
    private int length;
    private double amountPaid;
    public Student(String name, int id, double grade, int gradYear) {
        this.name = name;
        this.id = id;
        this.grade = grade;
        this.gradYear = gradYear;
    }
    //copy constructor
    public Student(Student st){
        this.name = st.name;
        this.id = st.id;
        this.grade = st.grade;
        this.gradYear = st.gradYear;
        this.course = st.course;
        this.length = st.length;
        this.amountPaid = st.amountPaid;
    }
    public Student copy(){
        return new Student(this);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }
}
