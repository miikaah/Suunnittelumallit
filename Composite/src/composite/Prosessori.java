
package composite;

public class Prosessori implements Laiteosa {
    private double hinta;
    
    public Prosessori(double hinta) {
        this.hinta = hinta;
    }

    @Override
    public double getHinta() {
        return hinta;
    }
}
