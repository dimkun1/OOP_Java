package test1.data;

public abstract class User {
    private String fio;
    private int birthYear;
    private long passport;


    
    public User(String fio, int birthYear, long passport) {
        this.fio = fio;
        this.birthYear = birthYear;
        this.passport = passport;
    }


    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }


    public int getBirthYear() {
        return birthYear;
    }
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }


    public long getPassport() {
        return passport;
    }
    public void setPassport(long passport) {
        this.passport = passport;
    }

}