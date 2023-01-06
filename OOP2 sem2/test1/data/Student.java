package test1.data;

public class Student extends User {

    private String groupNumber;


    public Student(String fio, int birthYear, long passport, String groupNumber) {
        super(fio, birthYear, passport);
        this.groupNumber = groupNumber;
    }


    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }


}