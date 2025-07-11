package main.DesignPatternAndPrinciples.PrototypeAndRegistry;

public class IntelligentStudent extends Student {
    private int iq;

    public IntelligentStudent(String name, int id, double grade, int gradYear, int iq) {
        super(name, id, grade, gradYear);
        this.iq = iq;
    }

    public IntelligentStudent(IntelligentStudent s) {
        super(s);
        this.iq = s.iq;
    }

    //control the flow of call
    public IntelligentStudent copy() {
        return new IntelligentStudent(this);
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }
}
