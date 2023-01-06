package test1.data;

public class Teacher extends User {
    
    private String scince;


    public Teacher(String fio, int birthYear, long passport, String scince) {
        super(fio, birthYear, passport);
        this.scince = scince;
    }


    public String getScince() {
        return scince;
    }

    public void setScince(String scince) {
        this.scince = scince;
    }
   
}
