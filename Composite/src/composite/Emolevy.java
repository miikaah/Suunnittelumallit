
package composite;

import java.util.ArrayList;
import java.util.List;

public class Emolevy implements LaiteosaComposite {

    private double hinta;
    private List<Laiteosa> emolevynOsat = new ArrayList<>();
    
    public Emolevy(double hinta) {
        this.hinta = hinta;
    }
    
    @Override
    public double getHinta() {
        double yhtHinta = this.hinta;
        for (Laiteosa laiteosa : emolevynOsat) {
            yhtHinta += laiteosa.getHinta();
        }
        return yhtHinta;
    }
    
    @Override
    public void addLaiteosa(Laiteosa osa) {
        if (!emolevynOsat.contains(osa)) {
            emolevynOsat.add(osa);
        }
    }
}
