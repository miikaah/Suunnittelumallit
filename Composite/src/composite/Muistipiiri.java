
package composite;

public class Muistipiiri implements Laiteosa {
    private double hinta;
    
    public Muistipiiri(double hinta) {
        this.hinta = hinta;
    }

    @Override
    public double getHinta() {
        return hinta;
    }
}
