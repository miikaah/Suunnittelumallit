
package composite;

public class Verkkokortti implements Laiteosa {
    private double hinta;

    public Verkkokortti(double hinta) {
        this.hinta = hinta;
    }
    
    @Override
    public double getHinta() {
        return hinta;
    }
}
