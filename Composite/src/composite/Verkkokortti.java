
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

    @Override
    public void addLaiteosa(Laiteosa osa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
