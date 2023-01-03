package OOP1;

public class Ets extends Product{
    private double wight;
    private double volume;


    public Ets(double wight, double volume) {
        this.wight=wight;
        this.volume=volume;
    }

    public Ets(String name, double price, double wight, double volume) {
        super(name, price);
        this.wight=wight;
        this.volume=volume;
    
    }
    
}
