package data;

public class Student extends User implements Comparable{

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

    @Override
    public int compareTo (Student student) {
        if (this.getBirthYear()>student.getBirthYear()) return 1;
        if (this.getBirthYear()<student.getBirthYear()) return -1;
        return 0;
    }
}