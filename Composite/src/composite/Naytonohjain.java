
package composite;

public class Naytonohjain implements Laiteosa {
    private double hinta;

    public Naytonohjain(double hinta) {
        this.hinta = hinta;
    }
    
    @Override
    public double getHinta() {
        return hinta;
    }

    @Override
    public void addLaiteosa(Laiteosa osa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
